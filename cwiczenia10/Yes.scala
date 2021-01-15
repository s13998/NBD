class Yes[A](val obiekt:A) extends Maybe[A] {
  override def applyFunction(f: A => Any): Maybe[_] = new Yes[Any](f(obiekt))

  override def getOrElse[B](n: B): Any = obiekt

  override def toString: String = obiekt.toString()

  override def map(f: A => A): Maybe[A] = {
    val newValue = f(obiekt)
    new Yes[A](newValue)
  }

  override def flatMap(f: A => Maybe[A]): Maybe[A] = f(obiekt)
}
