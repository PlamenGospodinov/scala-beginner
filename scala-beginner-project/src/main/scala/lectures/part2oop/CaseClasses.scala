package lectures.part2oop

object CaseClasses extends App{

  case class Person(name: String, age: Int)

  val jim = Person("Jim", 18)
  println(jim.age)

  println(jim.toString)

  val jim2 = Person("Jim", 18)
  println(jim.equals(jim2))

  val jim3 = jim.copy(age = 45)
  println(45 == jim3.age)

  val mary = Person("Mary", 23)

  case object Ireland {
    def name: String = "Ireland"
  }
}
