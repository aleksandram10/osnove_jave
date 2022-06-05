package d31_05_2022.Zadatak1;

public class Igrac extends Osoba {
    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere za broj, kapiten i poziciju
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int broj;
    private String pozicija;
    private boolean daLiJeKapiten;

    public Igrac() {
        super();
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int broj, String pozicija, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
    @Override
    public void print(){
        System.out.println("Igrac: ");
        super.print();
        System.out.println("Pozicija igraca je "+pozicija);
        System.out.println("Broj koji igrac nosi je "+broj);
        if(this.daLiJeKapiten==true){
            System.out.println("Igrac je kapiten.");
        }else System.out.println("Igrac nije kapiten");
    }
}
