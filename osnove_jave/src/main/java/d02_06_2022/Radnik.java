package d02_06_2022;

import p03_05_2022.Caribic.Sastojak;

import java.util.ArrayList;

public abstract class Radnik {
    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi
    // abstraktnu metodu koja vraca platu radnika
    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    protected ArrayList<Sektor> sektori=new ArrayList<>();

    protected String punoIme;

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public abstract double plata();

    public void zaposliUSektor(Sektor noviSektor){
        sektori.add(noviSektor);
    }
}
