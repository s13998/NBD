object main {

  def main(args: Array[String]): Unit = {

    println("Zadanie1")
    val contInt = new Container[Int](5)
    println("contInt.getContent() -> "+contInt.getContent())
    def funInt(n: Int): Float = n*n-n+10
    println("contInt.applyFunction(funInt) -> "+contInt.applyFunction(funInt))

    val contFloat = new Container[Float](5)
    println("contFloat.getContent() -> "+contFloat.getContent())
    def funFloat(n: Float): Float = n*n-n
    println("contFloat.applyFunction(funFloat) -> "+contFloat.applyFunction(funFloat))

    val contString = new Container[String]("string")
    println("contString.getContent() -> "+contString.getContent())
    def funString(n: String): Float = n.length
    println("contString.applyFunction(funString) -> "+contString.applyFunction(funString))

    println("\nZadanie2")
    val no = new No()
    val yes = new Yes[Int](2)
    println("no.isInstanceOf[Maybe[_]] -> "+no.isInstanceOf[Maybe[_]])
    println("yes.isInstanceOf[Maybe[_]] -> "+yes.isInstanceOf[Maybe[_]])

    println("\nZadanie3")
    println("no.applyFunction(funInt) -> "+no.applyFunction(funInt))
    println("yes.applyFunction(funInt) -> "+yes.applyFunction(funInt))

    println("\nZadanie4")
    println("no.getOrElse[String](\"5aa\") -> "+no.getOrElse[String]("5aa"))
    println("yes.getOrElse[Float](5.0f) -> "+yes.getOrElse[Float](5.0f))


  }
}
