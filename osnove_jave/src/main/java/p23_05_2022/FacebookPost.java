package p23_05_2022;

public class FacebookPost {
    //Kreirati klasu FacebookPost
    //opis
    //korisnik (referenca na korisnika koji je kreirao post)
    //konstrukore koje mislite da su vam potrebni
    //metoda print, stampa u formatu:
    //(ime) (prezime)
    //(opis post-a)


    private String opis;
    private Korisnik korisnik;

    public FacebookPost() {
    }

    public FacebookPost(String opis) {
        this.opis = opis;

    }


    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return this.korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }


    public void print() {
        //System.out.println(this.korisnik.getIme()+" "+this.korisnik.getPrezime());
        this.korisnik.print();
        System.out.println(this.opis);
    }


}
