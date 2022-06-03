package d24_05_2022.Racun;

public class Racun {
    //Zadatak
    //Kreirati klasu Racun koja ima:
    //broj racuna (npr: 170-289328923-23)
    //ime i prezime osobe
    //trenutno stanje na racunu (npr: 100, 1220)
    //gettere i setter za sve atribute, sem settera za stanje na racunu


    private String brojRacuna;
    private String punoIme;
    private  double trenutnoNaRacunu;

    public Racun(String brojRacuna, String punoIme, double trenutnoNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.punoIme = punoIme;
        this.trenutnoNaRacunu = trenutnoNaRacunu;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getTrenutnoNaRacunu() {
        return trenutnoNaRacunu;
    }

    public void setTrenutnoNaRacunu(double trenutnoNaRacunu) {
        this.trenutnoNaRacunu = trenutnoNaRacunu;
    }

//metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)

    public void menjaStanjeNaRacunu(double novaVrednost) {
        this.trenutnoNaRacunu = trenutnoNaRacunu - novaVrednost;
        if (trenutnoNaRacunu -novaVrednost <= 0) {
            trenutnoNaRacunu = 0;
        }
    }

    public void print(){
        System.out.println(this.punoIme+" - "+this.brojRacuna);
        System.out.println("Stanje na racunu je "+trenutnoNaRacunu+" rsd.");}
}

    //metodu koja stampa podatke o racunu u formatu:
    //Ime i prezime  -  broj racuna
    //stanje na racunu je (trenutno stanje) rsd.



