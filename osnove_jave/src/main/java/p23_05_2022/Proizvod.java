package p23_05_2022;

public class Proizvod {
    //Kreirati klasu Proizvod koja ima
    //Naziv proizvoda
    //kupca/musteriju
    //cenu izrade proizvoda
    //gettere i settere
    //konstruktore
    //Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
    //cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
    //Metodu za stampanje proizvoda u formatu:
    //naziv proizvoda - cena
    //ime i prezime - broj kartice

    private String naziv;
    private Kupac kupac;
    private double cena;
    private ClanskaKarta clanskaKarta;


    public Proizvod(){}
    public Proizvod(String naziv, double cena){
            this.naziv=naziv;
            this.cena=cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }



    //Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
    //cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
    //Metodu za stampanje proizvoda u formatu:
    //naziv proizvoda - cena
    //ime i prezime - broj kartice

    public double cenaProizvoda(double cena){
        return this.cena*1.9*(100-this.kupac.getClanskaKarta().getPopust())/100;
    }

    public void print(){
        System.out.println(this.naziv+" - "+this.cenaProizvoda(this.cena)+" ");
        System.out.println(this.kupac.getPunoIme()+" "+this.kupac.getClanskaKarta().getBrojKartice());
    }
}
