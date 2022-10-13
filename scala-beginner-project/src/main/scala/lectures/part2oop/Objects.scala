package lectures.part2oop

object Objects extends App {

  //Scala doesnt have class-level functionality "static"
  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person =
      new Person("Bobbie")
  }

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = Person
  val john = Person
  val mary2 = new Person("Mary")
  val john2 = new Person("John")
  println(mary == john)
  println(mary2 == john2)

  class Person(val name: String) {
    // instance-level functionality
  }
  //companions

  val bobbie = Person(mary2, john2)

  //Scala application - Scala object with
  //def main(args: Array[String]): Unit
}
