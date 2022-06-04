package d30_05_2022.Student;

public class Ispit {
    //Napisati klasu Ispit koja ima
    //naziv predmeta
    //ocenu (u rasponu od 5 do 10)
    //Ime i prezime profesora koji predaje predmet
    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za sve atribute

    private String nazivPredmeta;
    private int ocena;
    private String punoImeProfesora;

    public Ispit() {
    }

    public Ispit(String nazivPredmeta, int ocena, String punoImeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.punoImeProfesora = punoImeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)

    public boolean ispitPolozen(){
        if(this.ocena>5&&this.ocena<11){return true;}
        else{return false;}

    }


    //metodu koja stampa ispit u formatu:
    //(naziv predmeta) - (profesor) - (ocena)

    public void print(){
        System.out.println(this.nazivPredmeta+" - "+this.punoImeProfesora+" - "+this.ocena);
    }
}
