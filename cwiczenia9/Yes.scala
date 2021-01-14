class Yes[A](val obiekt:A) extends Maybe[A] {
  override def applyFunction(f: A => Any): Maybe[_] = new Yes[Any](f(obiekt))

  override def getOrElse[B](n: B): Any = obiekt

  override def toString: String = obiekt.toString()
}
