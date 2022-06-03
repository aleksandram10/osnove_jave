package p23_05_2022;

public class Reziser {
    //Kreirati klasu Reziser koja ima:
    //ime i prezime rezisera
    //startost
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //ime prezime, starost.god

    private String imeIprezime;
    private int starost;

    public Reziser(){}

    public Reziser(String imeIprezime,int starost){
        this.imeIprezime=imeIprezime;
        this.starost=starost;
    }

    public String getImeIprezime(){
        return this.imeIprezime;
    }

    public void setImeIprezime(String imeIprezime){
        this.imeIprezime=imeIprezime;
    }
    public int getStarost(){
        return this.starost;
    }

    public void setStarost(int starost){
        this.starost=starost;
    }

    public void stampaj(){
        System.out.println("Reziser je "+this.imeIprezime);
        System.out.println("Ima "+this.starost+" godina.");
    }
}
