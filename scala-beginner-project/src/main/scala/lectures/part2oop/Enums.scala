package lectures.part2oop

object Enums {

  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    //аdd fields/methods
    def openDoc(): Unit =
      if(this == READ) println("Opening document..")
      else println("Reading not allowed")
  }

  val somePermissions: Permissions = Permissions.WRITE

  //constructor args
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) // 001
    case NONE extends PermissionsWithBits(0) // 000
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits =
      PermissionsWithBits.NONE
  }

  //standart API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions: Array[PermissionsWithBits] = PermissionsWithBits.values
  val readPermissions: Permissions = Permissions.valueOf("READ")
  def main(args: Array[String]): Unit = {
    somePermissions.openDoc()
    println(somePermissionsOrdinal)
    println(allPermissions)
  }
}
