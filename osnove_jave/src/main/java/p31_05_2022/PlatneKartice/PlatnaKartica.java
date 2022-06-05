package p31_05_2022.PlatneKartice;

public class PlatnaKartica {
    //  Napraviti klasu PlatnaKartica koja ima
    //  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
    //  atribut broj kartice  primer: 4012-1239-1221-3381
    //  atribut godina - godina do kada vazi kartica
    //  atribut mesec-  mesec do kada vazi kartica
    //  konstruktor sa parametrima
    //  gettere za sve atribute, bez settera


    protected double sumaDolari;
    protected String brojKartice;
    protected int godDoKadaVaziKartica;
    protected int mesecdoKadaVazi;


    public PlatnaKartica(double sumaDolari, String brojKartice, int godDoKadaVaziKartica, int mesecdoKadaVazi) {
        this.sumaDolari = sumaDolari;
        this.brojKartice = brojKartice;
        this.godDoKadaVaziKartica = godDoKadaVaziKartica;
        this.mesecdoKadaVazi = mesecdoKadaVazi;
    }

    public double getSumaDolari() {
        return sumaDolari;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodDoKadaVaziKartica() {
        return godDoKadaVaziKartica;
    }

    public int getMesecdoKadaVazi() {
        return mesecdoKadaVazi;
    }

    //   metodu dodajSredstva koja povecava sumu za unetu vrednost
    //  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.


    public void dodajSredstva(double novaVrednost){
        this.sumaDolari=sumaDolari+novaVrednost;
    }

    public void izvrsiTransakciju(double novaVrednost){

        if(this.sumaDolari>=novaVrednost){this.sumaDolari=this.sumaDolari-novaVrednost;}

    }


    //  metodu koja stampa podatke o kartici u formatu:
    //	  4012-1239-1221-3381, 11/2019, $212

    public void print(){
        System.out.println(this.brojKartice+", "+this.mesecdoKadaVazi+"/"+this.godDoKadaVaziKartica+" , $"+this.sumaDolari);
    }



}
