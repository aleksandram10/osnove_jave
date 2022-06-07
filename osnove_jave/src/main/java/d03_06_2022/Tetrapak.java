package d03_06_2022;

public class Tetrapak extends Ambalaza{
    //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //atribut koji kaze da li se moze reciklirati
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni

    private boolean daLiSeMozeReciklirati;
    private double osnovnaCena;

    public boolean isDaLiSeMozeReciklirati() {
        return daLiSeMozeReciklirati;
    }

    public void setDaLiSeMozeReciklirati(boolean daLiSeMozeReciklirati) {
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiSeMozeReciklirati, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

//racuna cenu tako da ispunjava uslova:
    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //ako nije u cenu ulazi samo osnovna cena

    @Override
    public double cenaArtikla(){
        if(daLiSeMozeReciklirati==true){
            return tezinaPakovanja()*1.5*osnovnaCena;
        }else { return osnovnaCena;}
    }


    //metoda stampaj stampa sve podatke iz klase tetrapak.
    @Override
    public void print(){
        System.out.println("Tetrapak:");
        System.out.println("BarKod je :"+this.barKod);
        System.out.println("Naziv artikla je "+nazivArtikla);
        System.out.println("Bruto tezina je: "+brutoTezina);
        System.out.println("Neto tezina je "+netoTezina);
        System.out.println("Osnovna cena je "+osnovnaCena);
        if(daLiSeMozeReciklirati==true){
            System.out.println("Moze se reciklirati");}
        else{
            System.out.println("Ne moze se reciklirati");
        }
        System.out.println("Cena artikla je "+cenaArtikla());
    }
}
