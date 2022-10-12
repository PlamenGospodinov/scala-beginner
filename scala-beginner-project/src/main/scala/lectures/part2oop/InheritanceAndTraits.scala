package lectures.part2oop

object InheritanceAndTraits extends App{

  class Animal {
    private def specific = println("You can't access me")
    protected def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("sth else")
    }
  }

  val cat = new Cat
  //can't access this as well cat.eat
  // this can't be accessed: cat.specific

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)
}
