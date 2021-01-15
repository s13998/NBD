trait Maybe[A] {
  def applyFunction(f: A => Any) : Maybe[_]
  def getOrElse[B](n:B) : Any

}
