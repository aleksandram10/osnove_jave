package p24_05_2022.ZoomCall;

public class Korisnik {
    ////geter za sve, seter ne!
    //    //Kreirati klasu Korisnik koja ima:
    //    //ime i prezime
    //    //tip licence (basic/pro/premium)
    //    //konstruktore. Po difoltu korisnik ima basic licencu. u konstruktoru stavljamo da je licenca basic!!!
    //    //gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
    private String punoIme;
    private String tipLicence;

    public Korisnik() {
        this.tipLicence = "basic";
    }

    public Korisnik(String punoIme) {
        this.punoIme = punoIme;
        this.tipLicence = "basic";
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipLicence() {
        return tipLicence;
    }


    //metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
    //ako je uplata 100, postavlja licencu na “pro”
    //ako je uplata 150, postavlja licencu na “premium”

    public String postavljaLicencu(int uplata) {
        if (uplata == 100) {
            this.tipLicence = "pro";
        }
        if (uplata == 150) {
            this.tipLicence = "premium";
        }
        return this.tipLicence;
    }


    //Metoda kao parametar prima vrednost uplate $100 ili $150

    public int uplata(int uplata) {
        return uplata;
    }


    //metodu ponisti pretplatu koja postavlja licencu na basic

    public String ponistiPretplatu() {
        return this.tipLicence = "basic";
    }


    //metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
    //ako je basic, vraca 40min
    //ako je pro, vraca 240min
    //ako je  premium, vraca 1440min

    public int maksimalnaDuzinaVideoPoziva() {
        int duzinaPoziva=0;
        if (this.tipLicence.equals("basic")) {
            duzinaPoziva=40;
        } else if (this.tipLicence.equals("pro")) {
            duzinaPoziva=240;
        } else if (this.tipLicence.equals("premium")) {
            duzinaPoziva= 1440;
        } return duzinaPoziva;

    }



//metodu za stampu koja stampa u formatu:
//ime i prezime
//
    public void print(){
        System.out.println(this.punoIme);
    }




}
