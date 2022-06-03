package p23_05_2022;

public class FilmReziserMain {
    //1.Zadatak
    //Kreirati klasu Film koja ima:
    //naziv filma
    //iz koje godine je film
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //naziv filma, godina
    //
    //
    //Kreirati klasu Reziser koja ima:
    //ime i prezime rezisera
    //starost
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //ime prezime, starost.god
    //
    //U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
    public static void main(String[] args) {


        Film f = new Film();

        f.setNaziv("Titanik");
        f.setGodina(1997);


        Reziser r = new Reziser();
        r.setImeIprezime("Milan Jovanovic");
        r.setStarost(50);

        f.stampaj();
        r.stampaj();


    }

}
