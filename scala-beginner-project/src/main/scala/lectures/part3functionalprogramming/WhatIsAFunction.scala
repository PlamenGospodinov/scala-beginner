package lectures.part3functionalprogramming

object WhatIsAFunction extends App {

  // use functions as first class elements
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  //function types = Function1[A, B]
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }

  val concatenator = new Function2[String, String, String] {
    override def apply(str1: String, str2: String): String = str1 + str2

  }

  println(stringToIntConverter("3") + 3)
  println(adder(6, 9))
  println(concatenator("Hello, ", "there"))
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // curried function
}

trait MyFunction[A, B] {
  def apply(element: A): B = ???
}