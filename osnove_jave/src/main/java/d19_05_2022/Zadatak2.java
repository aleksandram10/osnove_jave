package d19_05_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        //(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
        //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
        //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
        //atribut za mod (hladi/greje)
        //metodu za stampu - stampa u formatu
        //marka - mod - termperatura
        //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
        //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
        //metodu koja racuna koliko klima novca potrosi za mesec dana
        //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
        //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
        //Metoda vraca ukupnu cenu za taj mesec
        //
        //U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

        SmartAirConditioning klima1=new SmartAirConditioning();
        klima1.marka="Samsung";
        klima1.temperatura=17;
        klima1.mod="hladi";
        klima1.potrosnjaDokHladi=1;
        klima1.potrosnjaDokGreje=2;

        SmartAirConditioning klima2=new SmartAirConditioning();
        klima2.marka="Galanz";
        klima2.temperatura=30;
        klima2.mod="greje";
        klima2.potrosnjaDokHladi=3;
        klima2.potrosnjaDokGreje=4;

        klima1.print();
        klima2.print();
        System.out.println(" ");

        System.out.println(klima1.mesecnaPotrosnja());
        System.out.println(klima2.mesecnaPotrosnja());
        System.out.println(" ");

        System.out.println("Mesecna potrosnja klime1 je "+klima1.potrosnjaZaMesecDana());
        System.out.println("Mesecna potrosnja klime2 je "+klima2.potrosnjaZaMesecDana());


    }
}
