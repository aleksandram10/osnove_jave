package p03_05_2022.Atleticar;

public abstract class Atleticar {
    // Kreirati apstraktnu klasu Atleticar čiji su tributi:
    //ime i prezime privatni
    //i rezultat ostvaren na takmičenju koji je zasticen

     private String punoIme;
     protected int rezultatNaTakmicenju;

    public Atleticar(String punoIme, int rezultatNaTakmicenju) {
        this.punoIme = punoIme;
        this.rezultatNaTakmicenju = rezultatNaTakmicenju;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getRezultatNaTakmicenju() {
        return rezultatNaTakmicenju;
    }

    public void setRezultatNaTakmicenju(int rezultatNaTakmicenju) {
        this.rezultatNaTakmicenju = rezultatNaTakmicenju;
    }
//Javne metode klase su:
    //apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog
    // atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)

    public abstract boolean daLiJeBolji(Atleticar a);

    //metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

    public void print(){
        System.out.println(this.punoIme+", "+this.rezultatNaTakmicenju);
    }

}
