package p02_06_2022.Figura;

import p02_06_2022.Figura.Figura;

public class Pravougaonik extends Figura {
    //Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
    //stranice a i b
    //gettere/settere/konstruktore
    //implementira metodu povrsina
    //implementira metodu obim
    //

    private double stranicaA;
    private double stranicaB;

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public Pravougaonik() {
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina(){
        return (stranicaA * stranicaA) + stranicaB*stranicaB;
    }

    @Override
    public  double obim(){
        return 2*stranicaA+2*stranicaB;
    }


//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine
    // i obime i za svaku figuru ispisati ponaosob
}
