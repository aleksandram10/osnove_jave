package p02_06_2022.Kartica;

public class KarticaMain {
    public static void main(String[] args) {

        VisaKartica visaKartica=new VisaKartica(1000,"132-452",34,2,"Gaga");
        visaKartica.print();
        visaKartica.dodajSredstva(200);

        visaKartica.print();
        visaKartica.izvrsiTransakciju(300);
        visaKartica.print();

        MasterKartica masterKartica=new MasterKartica(500,"123-4331",24,1);
        masterKartica.print();
        masterKartica.dodajSredstva(100);
        masterKartica.print();
        masterKartica.izvrsiTransakciju(100);
        masterKartica.print();
        masterKartica.naplatiOdrzavanje();
        masterKartica.print();




    }
}
