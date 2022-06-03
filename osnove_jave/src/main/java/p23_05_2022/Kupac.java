package p23_05_2022;

public class Kupac {
    //Kreirati klasu Kupac koja ima:
    //ime i prezime
    //clansku kartu
    //gettere i settere, clanska karta ne moze da se menja
    //konstruktore
    //metodu stampaj koja stampa u formatu
    //ime i prezime - broj kartice

    private String punoIme;
    private ClanskaKarta clanskaKarta;

    public Kupac(){}

    public Kupac(String punoIme)  {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;

    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public void print(){
        System.out.print(this.punoIme+" "+this.clanskaKarta.getBrojKartice());
    }

}
