package p03_05_2022.Caribic;

public class Sastojak {
    //Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
    //Npr: Ice point vanila sa dodacima: plazma, cokolada
    //Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
    //
    //Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
    // naziv dodatka
    // cenu dodatka
    // konstruktore, gettere i settere koji su vam potrebni
    // metodu stampaj koja stampa u formatu:
    //(dodatak)  (cena)

    private String nazivDodatka;
    private double cenaDodatka;

    public Sastojak() {
    }

    public Sastojak(String nazivDodatka, double cenaDodatka) {
        this.nazivDodatka = nazivDodatka;
        this.cenaDodatka = cenaDodatka;
    }

    public String getNazivDodatka() {
        return nazivDodatka;
    }

    public void setNazivDodatka(String nazivDodatka) {
        this.nazivDodatka = nazivDodatka;
    }

    public double getCenaDodatka() {
        return cenaDodatka;
    }

    public void setCenaDodatka(double cenaDodatka) {
        this.cenaDodatka = cenaDodatka;
    }
}
