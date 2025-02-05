```scala
class MyClass(var name: String) {
  def printName(): Unit = {
    println(name)
  }
}

object MainObject extends App {
  val myInstance = new MyClass("John")
  myInstance.printName()
  myInstance.name = "Jane"
  myInstance.printName()
}
```