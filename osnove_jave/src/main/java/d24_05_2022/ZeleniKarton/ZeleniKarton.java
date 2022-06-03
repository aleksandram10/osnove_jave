package d24_05_2022.ZeleniKarton;

public class ZeleniKarton {
    //Zadatak
    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore

    private String punoImeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String punoImeStudenta, String brojIndeksa, String nazivPredmeta, String punoImeProfesora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)

    public boolean ispitPolozen() {
        if (ocena < 6 && ocena > 0) {
            return false;
        }
        else if (ocena > 5 && ocena < 11) {
            return true;
        }
        return false;
    }



    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    //

    public void stampaj(){
        System.out.println(this.nazivPredmeta+" - "+this.ocena);
        System.out.println("Student: " +this.punoImeStudenta+", "+this.brojIndeksa);
        System.out.println("Profesor: "+this.punoImeProfesora);
    }




}
