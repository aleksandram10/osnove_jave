package p30_05_2022.FacebookPost;

public class Reakcije {
    //Kreirati klasu Reakcija koja ima
    //tip reakcije (smajli, like, srce)
    //ime i prezime korisnika koji je reagovao
    //gettere, settere i konstruktore
    //

    private String tipReakcije;
    private String punoImeKorisnika;

    public Reakcije(){}

    public Reakcije(String tipReakcije, String punoImeKorisnika) {
        this.tipReakcije = tipReakcije;
        this.punoImeKorisnika = punoImeKorisnika;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getPunoImeKorisnika() {
        return punoImeKorisnika;
    }

    public void setPunoImeKorisnika(String punoImeKorisnika) {
        this.punoImeKorisnika = punoImeKorisnika;
    }

    //Kreirati klasu FacebookPost koja ima:
    //ime i prezime korisnika koji je stavio oglas
    //tekst objave
    //niz reakcija
    //metodu reaguj, koja dodaje reakciju u niz
    //(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
    //Primer: Milan - lajkuje
    //	 Nemanja - lajkuje
    //	 Milan - daje srce
    //Post ima lajk od Nemanje i srce od Milana.
    //privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    //metodu stampaj koja stampa podatke u formatu:
    //ime i prezime
    //tekst objave
    //Smajli 10 | Like 15 | Srce 2
}
