trait Pracownik extends Osoba5 {

  protected var _pensja : Float = 0

  def pensja:Float = _pensja
  def pensja_= (value:Int):Unit = _pensja = value

  override def podatek:Float = _pensja*0.2f


}
