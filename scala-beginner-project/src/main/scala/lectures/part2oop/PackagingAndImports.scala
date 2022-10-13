package lectures.part2oop

import playground.Cinderella

import java.util.Date

object PackagingAndImports extends App {

  //package members are accessible by their simple name
  val writer = new Writer("Daniel", "Rock the JVM", 2018)

  //import the package
  val princess = new Cinderella
  println(sayHello)

  val date = new Date
}
