trait Maybe[A] {
  def applyFunction(f: A => Any) : Maybe[_]
  def getOrElse[B](n:B) : Any
  def map(f: A => A): Maybe[A]
  def flatMap(f: A => Maybe[A]): Maybe[A]
}
