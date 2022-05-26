package d23_05_2022;

public class Proizvod {
    //(Za vezbanje) Kreirati klasu Proizvod koja ima:
    //sifru proizvoda
    //naziv proizvoda
    //cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
    //konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
    //gettere i settere za sifru i naziv
    //setter za cenu po kilogramu

    private String sifra;
    private String naziv;
    private double cenaKg;

    public Proizvod(String sifra, String naziv, double cena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaKg = cena;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaKg(double cena) {
        this.cenaKg = cena;
    }
    //metodu getCenaKg koja vraca cenu za 1 kg proizvoda
    //metodu getCenaLb koja vraca cenu za 1lb prozvoda
    // 		konverzija: 1 kg = 2.2046 lb
    //metodu koja stampa proizvod u formatu:
    //(sifra) - (naziv)
    //

    public double getCenaKg(){
        return this.cenaKg;
    }
    public double getCenaLb(){
        return 0.4536*cenaKg;
    }
    public void print(){
        System.out.println(this.sifra+" "+this.naziv);
    }
}
