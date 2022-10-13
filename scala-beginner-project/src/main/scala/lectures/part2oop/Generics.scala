package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    //use the type A
    def add[B >: A](element: B): MyList[B] = ???
  /*
  A = Cat
  B = Animal
  * */
  }
  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //yes list[Cat] extends List[Animal]
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)???

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: Animal)
  val cage = new Cage(new Dog)

  // expand MyList to be generic
}
