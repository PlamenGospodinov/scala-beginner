package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def unary_! : String = s"$name, what the heck?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation = operator notation(syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight club")
  println(mary hangOutWith tom)

  //prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix works only with + - ~ !
  println(!mary)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent
}
