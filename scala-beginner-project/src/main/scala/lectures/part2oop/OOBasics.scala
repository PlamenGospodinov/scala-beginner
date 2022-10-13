package lectures.part2oop

import java.time.Year

object OOBasics extends App {

  val person = new Person("John", 22)
  println(person.age)
  person.greet("Ivan")

  val author = new Writer("Ivan", "Minchov", 1850)
  val imposter = new Writer("Ivan", "Minchov", 1850)
  val novel = new Novel("Under the Yoke", 1888, author)

  println(novel.getAuthorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.increase.print
}

//constructor
class Person(val name: String, val age: Int = 0) {
  //body
  val x = 2

  println(x + 1)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Due")
}

//class parameters are not fields

//Novel and a Writer class

class Writer(val firstName: String, val surname: String, val yearOfBirth: Int) {
  def getFullName(): Unit = {
    println(s"$firstName $surname")
  }
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def getAuthorAge(): Int = {
    yearOfRelease - author.yearOfBirth
  }

  def getAuthor(): Unit = {
    println(s"The author is: ${author.getFullName()}")
  }

  def isWrittenBy(author: Writer) = author == this.author

  def copy(year: Int): Novel = {
    new Novel(name, year, author)
  }
}

class Counter(val num: Int = 0) {

  def increase = {
    println("Incrementing")
    new Counter(num + 1)
  }

  def decrease = {
    println("Decrementing")
    new Counter(num - 1)
  }

  def increase(n: Int): Counter = {
    if (n <= 0) this
    else increase.increase(n - 1)
  }

  def decrease(n: Int): Counter = {
    if (n <= 0) this
    else decrease.decrease(n - 1)
  }

  def print = println(num)
}
