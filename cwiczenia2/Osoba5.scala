class Osoba5(val imie:String, val nazwisko:String) {

  private var _podatek:Float = 0

  def this(imie:String, nazwisko:String, podatek:Float){
    this(imie, nazwisko)
    this._podatek = podatek
  }
  def podatek: Float = _podatek

}
