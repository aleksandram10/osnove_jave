package p03_05_2022.Objekat;

public abstract class Objekat {
    //Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi: Object
    //adresa (ulica i broj)
    //povrsina objekta
    //zona (1, 2 ili 3)
    //konstuktore, gettere i settere

   // protected Objekat object;
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat( String adresa, double povrsina, int zona) {

        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }


    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    //metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
    //zona 1, koeficijent je 1.4
    //zona 2, koeficijent je 1.1
    //zona 3, koeficijent je 1.05

    public double koeficijentZaPorez(){
        if(this.zona==1){return 1.4;}
        else if(this.zona==2){return 1.1;}
        else if(this.zona==3){return 1.05;}
        return 0;
    }


    //abstraktnu metodu koja racuna i vraca porez objekta

    public abstract double porezObjekta();

    //abstraktnu metodu stampaj

    public abstract void stampaj();


}
