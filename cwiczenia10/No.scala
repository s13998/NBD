class No extends Maybe[Nothing] {
  override def applyFunction(f: Nothing => Any): Maybe[_] = this

  override def getOrElse[B](n: B): Any = n

  override def toString: String = "No"

  override def map(f: Nothing => Nothing): Maybe[Nothing] = new No()

  override def flatMap(f: Nothing => Maybe[Nothing]): Maybe[Nothing] = new No()
}
