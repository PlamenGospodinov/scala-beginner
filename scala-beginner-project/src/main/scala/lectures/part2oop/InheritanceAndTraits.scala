package lectures.part2oop

object InheritanceAndTraits extends App{

  class Animal {
    val creatureType: String = "Animal"
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

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat =
      super.eat
      println("woof, mnm")
  }
  val dog = new Dog("K9")
  dog.eat

  //type substitution (polymorphism)
  val dog3: Animal = new Dog("German Shepard")
  println(dog3.creatureType)

  //super

  //preventing overrides
  //-final keyword on member
  //-final keyword on the entire class
  /*-seal the class = extend classes in this file,
  prevent extensions in other files - "sealed" keyword
  */

}
