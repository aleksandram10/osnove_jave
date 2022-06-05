package p31_05_2022.PlatneKartice;

public class MasterKartica extends PlatnaKartica {
    //	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
    //  konstruktor sa parametrima
    //  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
    //  metoda naplatiOdrzavanje, koja sa racuna skida $2.
    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Master Card: 12/2019, 4012-1239-1221-3381, $232
    //	  u main funkciji, napraviti visa i master kartice i testirati funkcije


    public MasterKartica(double sumaDolari, String brojKartice, int godDoKadaVaziKartica, int mesecdoKadaVazi) {
        super(sumaDolari, brojKartice, godDoKadaVaziKartica, mesecdoKadaVazi);
    }
    @Override
    public void izvrsiTransakciju(double novaVrednost){

        if(this.sumaDolari>=novaVrednost)
        {this.sumaDolari=this.sumaDolari-novaVrednost-(1.5 * novaVrednost) / 100;}

    }

    // metoda naplatiOdrzavanje, koja sa racuna skida $2.

    public void naplatiOdrzavanje(){
        if(sumaDolari-2>=0){
        this.sumaDolari=this.sumaDolari-2;
    }
    }


    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Master Card: 12/2019, 4012-1239-1221-3381, $232
    //	  u main funkciji, napraviti visa i master kartice i testirati funkcije


    @Override
    public void print() {
        System.out.print("Master Card: ");
        super.print();

    }
}
