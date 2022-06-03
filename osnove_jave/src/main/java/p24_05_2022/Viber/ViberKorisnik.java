package p24_05_2022.Viber;

public class ViberKorisnik {

    // Zadatak (Za vezbanje)
    //Kreirati klasu ViberKorisnik koja ima:
    //ime i prezime
    //broj telefona
    //da li je trenutno aktivan (boolean)
    //gettere, settere, konstuktore

    private String punoIme;
    private String brojTelefona;
    private boolean daLiJeTrenutnoAktivan;

    public ViberKorisnik(){}

    public ViberKorisnik(String punoIme,String brojTelefona,boolean daLiJeTrenutnoAktivan){
        this.punoIme=punoIme;
        this.brojTelefona=brojTelefona;
        this.daLiJeTrenutnoAktivan=daLiJeTrenutnoAktivan;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isDaLiJeTrenutnoAktivan() {
        return daLiJeTrenutnoAktivan;
    }

    public void setDaLiJeTrenutnoAktivan(boolean daLiJeTrenutnoAktivan) {
        this.daLiJeTrenutnoAktivan = daLiJeTrenutnoAktivan;
    }


}
