package p31_05_2022.StudentProfesor;

public class Osoba {
    //Kreirati klasu Osoba koja od atributa ima:
    // ime i prezime
    // jmbg
    //konstuktor sa parametrima
    //metodu stampaj koja stampa podatke u formatu
    //			ime prezime, jmbg

    protected String punoIme;
    protected String jmbg;

    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void print(){
        System.out.println(this.punoIme+" , "+this.jmbg);
    }
}
