class KontoBankowe() {
  private var _stanKonta = 0
  def this(kwota: Int){
    this()
    this._stanKonta = kwota
  }

  def stanKonta = _stanKonta

  def wplata(kwota: Int): Unit ={
    this._stanKonta = this._stanKonta + kwota
  }

  def wyplata(kwota: Int): Unit ={
    this._stanKonta = this._stanKonta - kwota
  }


}
