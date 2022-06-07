package p02_06_2022.Kartica;

import p02_06_2022.Kartica.PlatnaKartica;

public class MasterKartica extends PlatnaKartica {
    //Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
    //  konstruktor sa parametrima



    public MasterKartica(double trenutnaSuma, String brojKartice, int godDoKadaVazi, int mesecDoKadaVazi) {
        super(trenutnaSuma, brojKartice, godDoKadaVazi, mesecDoKadaVazi);
    }
    //  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.

    @Override
    public  void izvrsiTransakciju(double unetaSuma) {
        double provizija=1.5/100*unetaSuma;
        if(provizija>=4){
            if(trenutnaSuma-unetaSuma-provizija>=0){
                this.trenutnaSuma=this.trenutnaSuma-unetaSuma-provizija;
            }}}



    //  metoda naplatiOdrzavanje, koja sa racuna skida $2.

    public void naplatiOdrzavanje(){
        trenutnaSuma=trenutnaSuma-2;
        if(trenutnaSuma<0){trenutnaSuma=0;}
    }
    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Master Card: 12/2019, 4012-1239-1221-3381, $232


    @Override
    public void print() {
        System.out.println("Master Card: " +this.mesecDoKadaVazi+"/"+godDoKadaVazi+this.brojKartice+", $"+trenutnaSuma);

    }


    //	  u main funkciji, napraviti visa i master kartice i testirati funkcije
}
