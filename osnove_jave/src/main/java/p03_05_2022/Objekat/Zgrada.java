package p03_05_2022.Objekat;

public class Zgrada extends Objekat{
    //Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
    //broj stanova

    private int brojStanova;

    //konstuktore, gettere i setter

    public Zgrada(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
    //porez racuna po formuli koeficijent * povrsina * broj stanova
    //prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

    @Override
    public double porezObjekta(){
        return koeficijentZaPorez()*povrsina*brojStanova;
    }


    @Override
    public void stampaj(){
        System.out.println("Zgrada:");
        System.out.println("Broj stanova je "+this.brojStanova);
        System.out.println("Adresa je "+this.adresa);
        System.out.println("Povrsina kuce je "+this.povrsina);
        System.out.println("Zgrada se nalazi u zoni "+this.zona);
        System.out.println("Porez je "+porezObjekta());
    }


}
