package d03_06_2022;

public abstract class Ambalaza {
    //Kreirati abstraktnu klasu Ambalaza koja ima:
    //barkod (primer: 328232-2823)
    //naziv artikla
    //neto tezinu
    //bruto tezinu

    protected String barKod;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;


    //konstuktore (default-ni i sa parametrima)
    //gettere i settere

    public Ambalaza() {
    }

    public Ambalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barKod = barKod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    public double tezinaPakovanja(){
        return brutoTezina-netoTezina;
    }


    //abstraktnu metodu koja vraca cenu artikla

    public abstract double cenaArtikla();

    //abstraktnu metodu stampaj

    public abstract void print();
}
