package p31_05_2022.PlatneKartice;

public class KarticaMain {
    public static void main(String[] args) {
        //Napraviti klasu PlatnaKartica koja ima
        //  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
        //  atribut broj kartice  primer: 4012-1239-1221-3381
        //  atribut godina - godina do kada vazi kartica
        //  atribut mesec-  mesec do kada vazi kartica
        //  konstruktor sa parametrima
        //  gettere za sve atribute, bez settera
        //   metodu dodajSredstva koja povecava sumu za unetu vrednost
        //  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
        //  metodu koja stampa podatke o kartici u formatu:
        //	  4012-1239-1221-3381, 11/2019, $212

        PlatnaKartica platnaKartica1 = new PlatnaKartica(123, "1124-352", 31, 4);
        platnaKartica1.dodajSredstva(10);
        platnaKartica1.print();


        //
        //	  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
        // ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
        //getter i setter za ovlasceno lice
        //konstruktor sa parametrima
        //  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
        //  implementira metodu koja stampa podatke o kartici u formatu:
        //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
        //
        VisaKartica visa1 = new VisaKartica(12, "325-325", 34, 5, "ALkesandra Markovic");

        visa1.izvrsiTransakciju(5);
        visa1.print();
        visa1.dodajSredstva(120);
        visa1.print();


        //	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
        //  konstruktor sa parametrima
        //  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
        //  metoda naplatiOdrzavanje, koja sa racuna skida $2.
        //  implementira metodu koja stampa podatke o kartici u formatu:
        //	  Master Card: 12/2019, 4012-1239-1221-3381, $232
        //	  u main funkciji, napraviti visa i master kartice i testirati funkcije

        MasterKartica master = new MasterKartica(123, "131-2352", 24, 6);
        master.print();
        master.dodajSredstva(100);
        master.print();
        master.izvrsiTransakciju(30);
        master.print();
        master.naplatiOdrzavanje();
        master.print();

    }
}
