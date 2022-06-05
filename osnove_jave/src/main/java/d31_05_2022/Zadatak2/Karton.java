package d31_05_2022.Zadatak2;

public class Karton {
    //Kreirati klasu Karton koja ima:
    //tip kartona (crveni, zuti)
    //konstuktore za koje mislite da ce vam trebati
    //gettere i settere za karton

    private String tipKartona;


    public Karton(String tipKartona) {
        this.tipKartona = tipKartona;
    }

    public String getTipKartona() {
        return tipKartona;
    }

    public void setTipKartona(String tipKartona) {
        this.tipKartona = tipKartona;
    }
}
