package d23_05_2022;

public class Vaga {
    //	Kreirati klasu Vaga koja ima:
    //merna jedinica (kg ili lb)
    //proizvod (proizvod koji se meri)
    //TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
    //default-ni konstuktor
    //getteri i setteri za sve atribute


    private String mernaJedinica;
    private Proizvod proizvod;

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    //metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
    // Na racunanje cene utice i merna jedinica na koju je vaga podesena.

    public double sracunajCenu(double tezina) {
        if (mernaJedinica.equals("kg")) {
            return tezina * this.proizvod.getCenaKg();
        } else if (mernaJedinica.equals("lb")) {
            return tezina * this.proizvod.getCenaLb();
        } else return 0;
    }

    //metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
    //               (sifra) - (naziv)
    //   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
    //   Ukupno: (ukupna cena)

public void stampaj(double tezina){
    System.out.println(this.proizvod.getSifra()+" - "+this.proizvod.getNaziv());
    System.out.println(this.proizvod.getCenaKg()+" "+this.mernaJedinica+ "*"+tezina);
    System.out.println("Ukupno "+ sracunajCenu(tezina));
}


}

