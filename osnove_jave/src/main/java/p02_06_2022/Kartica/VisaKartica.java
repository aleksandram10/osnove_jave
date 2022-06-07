package p02_06_2022.Kartica;

public class VisaKartica extends PlatnaKartica {
    //Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
    // ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
    //getter i setter za ovlasceno lice
    //konstruktor sa parametrima

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double trenutnaSuma, String brojKartice, int godDoKadaVazi, int mesecDoKadaVazi, String ovlascenoLice) {
        super(trenutnaSuma, brojKartice, godDoKadaVazi, mesecDoKadaVazi);
        this.ovlascenoLice = ovlascenoLice;
    }


    //  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
    //  Najmanja provizija moze biti $4.

    @Override
    public  void izvrsiTransakciju(double unetaSuma) {
        double provizija=1.8/100*unetaSuma;
       if(provizija>=4){
           if(trenutnaSuma-unetaSuma-provizija>=0){
        this.trenutnaSuma=this.trenutnaSuma-unetaSuma-provizija;
    }}}

    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212


    @Override
    public void print() {
        System.out.println("Visa Card: "+this.brojKartice+" , "+this.mesecDoKadaVazi+"/"+godDoKadaVazi+", $"+trenutnaSuma);

    }
}
