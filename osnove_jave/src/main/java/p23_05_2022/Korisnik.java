package p23_05_2022;

public class Korisnik {
    //Kreirati klasu Korisnik koja ima
    //ime
    //prezime
    //gettere i settere za ime i prezime
    //konstuktore koje mislite da su vam potrebni
    //metoda koja stampa u formatu:
    //(ime) (prezime)

    private String ime;
    private String prezime;

    public Korisnik(){}

    public Korisnik(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }

    public String getIme(){
        return this.ime;
    }

    public void setIme(String ime){
        this.ime=ime;
    }

    public String getPrezime(){
        return this.prezime;
    }

    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public void print(){
        System.out.println(this.ime+" " +this.prezime);
    }
}
