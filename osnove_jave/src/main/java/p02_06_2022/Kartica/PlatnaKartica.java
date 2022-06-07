package p02_06_2022.Kartica;

public abstract  class  PlatnaKartica {
    //Napraviti klasu apstraktnu PlatnaKartica koja ima
    //  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
    //  atribut broj kartice  primer: 4012-1239-1221-3381
    //  atribut godina - godina do kada vazi kartica
    //  atribut mesec-  mesec do kada vazi kartica
    //  konstruktor sa parametrima
    //  gettere za sve atribute, bez settera


    protected double trenutnaSuma;
    protected String brojKartice;
    protected int godDoKadaVazi;
    protected int mesecDoKadaVazi;

    public PlatnaKartica(double trenutnaSuma, String brojKartice, int godDoKadaVazi, int mesecDoKadaVazi) {
        this.trenutnaSuma = trenutnaSuma;
        this.brojKartice = brojKartice;
        this.godDoKadaVazi = godDoKadaVazi;
        this.mesecDoKadaVazi = mesecDoKadaVazi;
    }

    public double getTrenutnaSuma() {
        return trenutnaSuma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodDoKadaVazi() {
        return godDoKadaVazi;
    }

    public int getMesecDoKadaVazi() {
        return mesecDoKadaVazi;
    }



    //  metodu dodajSredstva koja povecava sumu za unetu vrednost

        public void dodajSredstva(double unetaSuma){
        this.trenutnaSuma=this.trenutnaSuma+unetaSuma;
}

    //  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.

    public abstract void izvrsiTransakciju(double unetaSuma);


    //  apstraktnu metodu koja stampa podatke o kartici
    public abstract void print();
}
