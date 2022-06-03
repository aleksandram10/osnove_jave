package d24_05_2022.Racun;

import d24_05_2022.Racun.Racun;

public class Transakcija {
    //Kreirati klasu Transakcija koja ima:
    //id transakcije
    //racun sa kog se prenose sredstva
    //racun na koji se prenose sredstva
    //gettere i settere
    //konstruktore

    private String id;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;

    public Transakcija() {
    }

    public Transakcija(String id, Racun recunSaKogSePrenosi, Racun racunNaKojiSePrenosi) {
        this.id = id;
        this.racunSaKogSePrenosi = recunSaKogSePrenosi;
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRecunSaKogSePrenosi() {
        return racunSaKogSePrenosi;
    }

    public void setRecunSaKogSePrenosi(Racun recunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = recunSaKogSePrenosi;
    }

    public Racun getRacunNaKojiSePrenosi() {
        return racunNaKojiSePrenosi;
    }

    public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    //privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
    //ako je prenos sredstava veci od 4500, provizija je 1%
    //S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
    //Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.


    private double provizijaZaTransakciju(double visinaTransakcije) {
        if (visinaTransakcije < 4500) {
            return 45;
        } else if (visinaTransakcije >= 4500) {
            return 0.01 * visinaTransakcije;
        } else return 0;
    }


    //metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
    //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
    //(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava

    public void izvrsiTransakciju(double vrednostKojaSePrebacuje) {
        if (this.racunSaKogSePrenosi.getTrenutnoNaRacunu() >= (vrednostKojaSePrebacuje + provizijaZaTransakciju(vrednostKojaSePrebacuje))){
            this.racunSaKogSePrenosi.setTrenutnoNaRacunu(this.racunSaKogSePrenosi.getTrenutnoNaRacunu() - vrednostKojaSePrebacuje - provizijaZaTransakciju(vrednostKojaSePrebacuje));  ;
            this.racunNaKojiSePrenosi.setTrenutnoNaRacunu(this.racunNaKojiSePrenosi.getTrenutnoNaRacunu() + vrednostKojaSePrebacuje) ;
        }
    }


    //metodu koja stampa podatke o transakciji u formatu:
    //id transkacije
    //Racun sa: Ime i prezime  -  broj racuna
    //Racun na: Ime i prezime  -  broj racuna

    public void print(){
        System.out.println(this.id);
        System.out.println("Racun sa "+this.racunSaKogSePrenosi.getPunoIme()+" - "+this.racunSaKogSePrenosi.getBrojRacuna());
        System.out.println("Racun na: "+this.racunNaKojiSePrenosi.getPunoIme()+" - "+this.racunSaKogSePrenosi.getBrojRacuna());
    }




    //	Naravno u glavnom kreirati objekte i testirati funkcionalnosti
}
