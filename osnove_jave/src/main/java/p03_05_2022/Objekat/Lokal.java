package p03_05_2022.Objekat;

public class Lokal extends Objekat{
    //Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
    //konstuktore
    //porez racuna po formuli koeficijent * povrsina * 1.3
    //prepisati metodu stampaj tako da stampa sve podatke vezane za lokal


    public Lokal() {
    }

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porezObjekta(){
        return koeficijentZaPorez()*povrsina*1.3;
    }


    @Override
    public void stampaj(){
        System.out.println("Lokal:");
        System.out.println("Adresa je "+this.adresa);
        System.out.println("Povrsina kuce je "+this.povrsina);
        System.out.println("Zgrada se nalazi u zoni "+this.zona);
        System.out.println("Porez je "+porezObjekta());
    }
}
