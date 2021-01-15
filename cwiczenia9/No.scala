class No extends Maybe[Nothing] {
  override def applyFunction(f: Nothing => Any): Maybe[_] = this

  override def getOrElse[B](n: B): Any = n

  override def toString: String = "No"

}
