object Main {

  def pierwsze(nazwa : String) : String = {
    nazwa match {
      case "Poniedzialek" => "Praca"
      case "Wtorek" => "Praca"
      case "Sroda" => "Praca"
      case "Czwartek" => "Praca"
      case "Piątek" => "Praca"
      case "Sobota" => "Weekend"
      case "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }

  }

  def trzecie(osoba : Osoba) = osoba.imie match {
      case "Adam" => "Witaj Adam"
      case "Mariusz" => "Dzien dobry Bogdan"
      case "Jan" => "Czesc Jan"
      case a => s"Halo $a"
  }

  def czwarte(liczba:Int, funkcja: Int => Int) = funkcja(funkcja(funkcja(liczba)))


  def main(args:Array[String]) : Unit = {


    println("Zadanie 1")
    println("Poniedzialek => " + pierwsze("Poniedzialek"))
    println("Sobota => " + pierwsze("Sobota"))
    println("Ponie => " + pierwsze("Ponie"))

    println("\nZadanie 2")
    val konto1000 = new KontoBankowe(1000)
    println("nowe konto z parametrem 1000 -> "+konto1000.stanKonta)
    konto1000.wplata(20)
    println("wplata 20 -> "+konto1000.stanKonta)
    konto1000.wyplata(100)
    println("wyplata 100 -> "+konto1000.stanKonta)

    println()
    val konto = new KontoBankowe()
    println("nowe konto bez parametru -> "+konto.stanKonta)
    konto.wplata(20)
    println("wplata 20 -> "+konto.stanKonta)
    konto.wyplata(100)
    println("wyplata 100 -> "+konto.stanKonta)


    println("\nZadanie3")
    val osoba1 = new Osoba("Adam", "Niski")
    val osoba2 = new Osoba("Mariusz", "Wysoki")
    val osoba3 = new Osoba("Jan", "Prosty")
    val osoba4 = new Osoba("Kamil", "Slimak")
    val osoba5 = new Osoba("Janusz", "Nowak")

    println(trzecie(osoba1))
    println(trzecie(osoba2))
    println(trzecie(osoba3))
    println(trzecie(osoba4))
    println(trzecie(osoba5))

    println("\nZadanie4")
    def fun(n: Int): Int = n*n-n
    println(czwarte(5,fun))

    println("\nZadanie5")
    val p = new Osoba5("Janusz", "Nowak") with Pracownik
    p.pensja = 500
    println("Pracownik podatek -> "+p.podatek)
    val n = new Osoba5("Janusz", "Nowak") with Nauczyciel
    n.pensja = 500
    println("Nauczyciel podatek -> "+n.podatek)
    val s = new Osoba5("Janusz", "Nowak") with Student
    //s.pensja = 500
    println("Student podatek -> "+s.podatek)

    val sp = new Osoba5("Janusz", "Nowak") with Student with Pracownik
    sp.pensja = 500
    println("StudentPracownik podatek -> "+sp.podatek)

    val ps = new Osoba5("Janusz", "Nowak") with Pracownik with Student
    ps.pensja = 500
    println("PracownikStudent podatek -> "+ps.podatek)
  }
}
