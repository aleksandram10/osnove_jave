package d31_05_2022.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //niz kartona
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)

    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni=new ArrayList<>();
    private boolean daLiJeKapiten;

    //default-ni konstuktor
    //konstuktor sa parametrima

    public Igrac() {
        super();
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int broj, String pozicija, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    //gettere i settere za broj, kapiten i poziciju

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


    //metodu dodaj karton, gde se dodaje karton u niz

    public void dodajKarton(Karton noviKarton){
        kartoni.add(noviKarton);
    }


    //metodu koja vraca broj zutih kartona

    public int brojZutihKartona(){
        int broj=0;
        for (int i=0;i<kartoni.size();i++) {
            if(kartoni.get(i).getTipKartona().equals("zuti")){
                broj=broj+1;
            }
        }
        return broj;
    }


    //metodu koja vraca broj crvenih kartona

    public int brojCrvenihKartona(){
        int broj=0;
        for (int i=0;i<kartoni.size();i++) {
            if(kartoni.get(i).getTipKartona().equals("crveni")){
                broj=broj+1;
            }
        }
        return broj;
    }
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    @Override
    public void print(){
        super.print();
        System.out.println("Broj koji igrac nosi: "+this.broj);
        System.out.println("Pozicija igraca je: "+this.pozicija);
        if(this.daLiJeKapiten=true){
            System.out.println("Igrac je kapiten.");
        }else{
            System.out.println("Igrac nije kapiten.");
        }
    }
}
