package p30_05_2022.Pasta;

public class SastojakPastaMain {
    public static void main(String[] args) {
        //Kreirati klasu Sastojak koja ima:
        //naziv
        //cenu
        //gettere i settere
        //konstruktore
        //metodu za stampanje koja stampa  podatke u formatu:
        //naziv - cena.din
        //
        //	Kreirati klasu Pasta koja ima:
        //niz sastojaka
        //metodu za dodavanje sastojka
        //(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
        //defaultni konstruktor
        //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
        //metodu za stampu koja stampa podatke u formatu:
        //Pasta je sa sastojcima:
        //naziv - cena.din
        //naziv - cena.din
        //naziv - cena.din
        //Cena paste je cena.din
        //
        //U glavnom programu kreirati objekte i testirati funkcionalnosti

        Sastojak sos = new Sastojak("sos", 250);
        Sastojak so = new Sastojak("so", 80);
        Sastojak meso = new Sastojak("meso", 350);

        //  sos.print();
        //   so.print();
        //  meso.print();

        Pasta pasta = new Pasta();

        pasta.dodajSastojak(sos);
        pasta.dodajSastojak(so);
        pasta.dodajSastojak(meso);

        pasta.print();

//       Sastojak noviSastojak=new Sastojak("so",12);
//       pasta.brisiSastojak(noviSastojak);


       pasta.brisiSastojak("so");
       pasta.print();


    }
}
