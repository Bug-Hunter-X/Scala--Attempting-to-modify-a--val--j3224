```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(name)
  }
}

object MainObject extends App {
  val myInstance = new MyClass("John")
  myInstance.printName()
  myInstance.name = "Jane" // Trying to modify a val
  myInstance.printName()
}
```