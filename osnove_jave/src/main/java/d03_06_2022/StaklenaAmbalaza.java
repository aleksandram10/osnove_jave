package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza{
    //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
    //kaucija za flasu
    //atribut koji kaze da li se za flasu placa kaucija
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni

    private double kaucijaZaFlasu;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlasu, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    //racuna cenu
    //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //ako se ne placa, (osnovna cena) * 1.2

    @Override
    public double cenaArtikla(){
        if(daLiSePlacaKaucija==true){
            return kaucijaZaFlasu*1.2*osnovnaCena;
        }else { return osnovnaCena*1.2;}
    }


    //metoda stampaj stampa sve podatke iz klase staklena flasa.
    @Override
    public void print(){
        System.out.println("Staklena ambalaza:");
        System.out.println("BarKod je :"+barKod);
        System.out.println("Naziv artikla je "+nazivArtikla);
        System.out.println("Bruto tezina je: "+brutoTezina);
        System.out.println("Neto tezina je: "+netoTezina);
        System.out.println("Osnovna cena je "+osnovnaCena);
        if(daLiSePlacaKaucija==true){
            System.out.println("Placa se kaucija");}
        else{
            System.out.println("Ne placa se kaucija");
        }
        System.out.println("Cena ovog artikla je "+cenaArtikla());
    }
}
