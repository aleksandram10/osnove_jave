package p23_05_2022;

public class Film {
    //Kreirati klasu Film koja ima:
    //naziv filma
    //iz koje godine je film
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //naziv filma, godina

    private String naziv;
    private int godina;

    public Film(){}

    public Film(String naziv,int godina){
        this.naziv=naziv;
        this.godina=godina;
    }

    public String getNaziv(){
        return this.naziv;
    }

    public void setNaziv(String naziv){
        this.naziv=naziv;
    }

    public int getGodina(){
        return this.godina;
    }

    public void setGodina(int godina){
        this.godina=godina;
    }


    public void stampaj(){
        System.out.println("Naziv filma je "+this.naziv);
        System.out.println("Godina izlaska filma je "+this.godina);
    }




}
