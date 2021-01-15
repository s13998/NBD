object Main {

  def paryLiczb = for {
    a <- Iterator.from(1)
    b <- 1 until a+1 if a%b == 0
  } yield (a, b)

  def main(args: Array[String]): Unit = {

    println("Zadanie1")
    val test = paryLiczb.buffered
    print("take 4 foreach println -> ")
    test take 4 foreach println
    println("test.next -> "+test.next)
    println("test.next -> "+test.next)
    print("take 3 foreach println -> ")
    test take 3 foreach println
    print("take 8 foreach println -> ")
    test take 8 foreach println
    println("test.next -> "+test.next)
    print("take 2 foreach println -> ")
    test take 2 foreach println


    println("\nZadanie2")
    val intResult = for {
      a <- new Yes(1)
      b <- new Yes(2)
      c <- new Yes(3)
    } yield a+b+c
    println("1+2+3 = "+intResult)

    val stringResult = for {
      a <- new Yes("aa")
      b <- new Yes("bb")
      c <- new Yes("cc")
    } yield a+b+c
    println("\"aa\"+\"bb\"+\"cc\" = "+stringResult)

  }
}
