package p03_05_2022.Objekat;

public class Kuca extends Objekat {
    //Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
    //konstuktore, gettere i setter


     private int brojClanova;

    public Kuca(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    public Kuca( String adresa, double povrsina, int zona, int brojClanova) {
        super( adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    //porez racuna po formuli: koeficijent * povrsina.


   @Override
   public double porezObjekta(){
        return koeficijentZaPorez()*povrsina;
    }


    @Override
    public void stampaj(){
        System.out.println("Kuca:");
        System.out.println("Broj clanova domacinstva je "+this.brojClanova);
        System.out.println("Adresa je "+this.adresa);
        System.out.println("Povrsina kuce je "+this.povrsina);
        System.out.println("Kuca se nalazi u zoni "+this.zona);
        System.out.println("Porez je "+porezObjekta());
    }
    //prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

}
