package p24_05_2022.Viber;

public class ViberMain {
    public static void main(String[] args) {
        //Kreirati klasu ViberKorisnik koja ima:
        //ime i prezime
        //broj telefona
        //da li je trenutno aktivan (boolean)
        //gettere, settere, konstuktore
        //
        //Kreirati klasu ViberPoruka koja ima:
        //tekst poruke
        //vreme kad je poslata poruka
        //korisnika koji je poslao poruku
        //korisnika kome je poslata poruka
        //gettere i setere i konstuktore
        //rekaciju na poruku
        //metodu prikazi koja stampa podatke o poruci u formatu:
        //From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
        //To: [Ime i prezime korisnika kome je poslata]
        //[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
        //
        //POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
        //if (this.reakcija != null)
        //
        //Kreirati klasu ViberReakcija koja ima:
        //emoji (moze da bude sunglases, heart, smile, like ili sad)
        //korisnika koji je reagovao


        //U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

        ViberKorisnik prvi = new ViberKorisnik("Gaga", "062220651", true);
        ViberKorisnik drugi = new ViberKorisnik("Marko", "0645642321", false);


        ViberReakcije reakcija1 = new ViberReakcije("lol", prvi);
        ViberReakcije reakcija2 = new ViberReakcije("cry", drugi);

        ViberPoruka poruka1 = new ViberPoruka("U ponedeljak je test", "23:16", prvi, drugi, reakcija1);
        ViberPoruka poruka2 = new ViberPoruka("Moramo da vezbamo", "23:20", drugi, prvi, reakcija2);


        poruka1.print();
        poruka2.print();


    }
}
