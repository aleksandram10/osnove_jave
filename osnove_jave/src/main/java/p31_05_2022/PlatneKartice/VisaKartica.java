package p31_05_2022.PlatneKartice;

import p31_05_2022.PlatneKartice.PlatnaKartica;

public class VisaKartica extends PlatnaKartica {

    //	  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
    // ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
    //getter i setter za ovlasceno lice
    //konstruktor sa parametrima
    //  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
    //  Najmanja provizija moze biti $4.
    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double sumaDolari, String brojKartice, int godDoKadaVaziKartica, int mesecdoKadaVazi, String ovlascenoLice) {
        super(sumaDolari, brojKartice, godDoKadaVaziKartica, mesecdoKadaVazi);
        this.ovlascenoLice = ovlascenoLice;
    }
    //  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
    //  Najmanja provizija moze biti $4.

    @Override
    public void izvrsiTransakciju(double novaVrednost){
        double provizija=novaVrednost*1.8/100;
        if(provizija<4){provizija=4;}
        if(this.sumaDolari-novaVrednost-provizija>=0)
        {this.sumaDolari=this.sumaDolari-novaVrednost-provizija;}
    }


    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
@Override
    public void print(){

    System.out.print("Visa Card: ");
    super.print();

}

}
