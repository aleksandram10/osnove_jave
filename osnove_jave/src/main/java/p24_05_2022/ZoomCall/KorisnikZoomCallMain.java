package p24_05_2022.ZoomCall;

public class KorisnikZoomCallMain {
    public static void main(String[] args) {
        //Zadatak
        //
        //Kreirati klasu Korisnik koja ima:
        //ime i prezime
        //tip licence (basic/pro/premium)
        //konstruktore. Po difoltu korisnik ima basic licencu.
        //gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
        //metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
        //ako je uplata 100, postavlja licencu na “pro”
        //ako je uplata 150, postavlja licencu na “premium”
        //Metoda kao parametar prima vrednost uplate $100 ili $150
        //metodu ponisti pretplatu koja postavlja licencu na basic
        //metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
        //ako je basic, vraca 40min
        //ako je pro, vraca 240min
        //ako je  premium, vraca 1440min
        //metodu za stampu koja stampa u formatu:
        //ime i prezime
        //
        //
        //
        //	Kreirati klasu ZoomCall koja ima:
        //link za poziv
        //password
        //korisnika koji je host
        //korisnika koji je guest
        //gettere za sve atribute
        //setter samo za guest-a
        //metodu pokreni poziv koja stampa podatke u formatu:
        //		Zoom Call: url
        //		Password: password
        //		Host: ime i prezime
        //		Guest: ime i prezime
        //		Maksimalno trajanje poziva je (broj minuta)min
        //
        //		Maksimalno trajanje poziva se cita od korisnika koji je host!
        //
        //	U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija


        Korisnik gost=new Korisnik("ALeksandra Markovic");
        Korisnik host=new Korisnik("Marko Markovic");

        gost.print();
        host.print();

        System.out.println(gost.uplata(150));
        System.out.println(gost.maksimalnaDuzinaVideoPoziva());

        gost.postavljaLicencu(gost.uplata(150));
        System.out.println(gost.getTipLicence());
        gost.ponistiPretplatu();
        System.out.println(gost.getTipLicence());
        System.out.println(" ");

        ZoomCall call=new ZoomCall("123-456","gaga10",host);
        call.setGuest(gost);//MORA UVEK DA SE SETUJEEE!

        call.print();




    }
}
