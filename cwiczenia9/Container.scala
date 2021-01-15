class Container[A] {

  private var _wartosc:A = null.asInstanceOf[A]

  def this(wartosc:A){
    this()
    this._wartosc = wartosc
  }

  def getContent(): A= _wartosc
  def applyFunction(f: A => Any): Any = f(_wartosc)

}
