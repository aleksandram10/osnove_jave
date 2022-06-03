package p24_05_2022.FizickoLice;

public class FizickoLice {
    //Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
    //ime i prezime
    //broj licne karte
    //jmbg
    //podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
    //konstuktore
    //gettere i settere, jmbg ne sme da se menja


    private String punoIme;
    private String brojLicneKarte;
    private String jmbg;
    private boolean daLiJePrethodnoKupovao;

    public FizickoLice(String jmbg){
        this.jmbg="10109941234";
    }

    public FizickoLice(String punoIme,String brojLicneKarte,boolean daLiJePrethodnoKupovao){
        this.punoIme=punoIme;
        this.brojLicneKarte=brojLicneKarte;
        this.jmbg="10109941234";
        this.daLiJePrethodnoKupovao=daLiJePrethodnoKupovao;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }


    public boolean isDaLiJePrethodnoKupovao() {
        return daLiJePrethodnoKupovao;
    }

    public void setDaLiJePrethodnoKupovao(boolean daLiJePrethodnoKupovao) {
        this.daLiJePrethodnoKupovao = daLiJePrethodnoKupovao;
    }

    ////metodu stampaj, koja stmpa podatke u formatu:
    //    //ime i prezime, broj licne karte

    public void stampaj(){
        System.out.print(this.punoIme+" , "+this.brojLicneKarte);
    }
}
