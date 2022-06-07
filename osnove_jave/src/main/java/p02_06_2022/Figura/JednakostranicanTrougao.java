package p02_06_2022.Figura;

import p02_06_2022.Figura.Figura;

public class JednakostranicanTrougao extends Figura {
    //Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
    //stranicu a
    //gettere/settere/konstruktore
    //implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
    //implementira metodu obim

    private double stranica;

    public JednakostranicanTrougao(double stranica) {
        this.stranica = stranica;
    }

    public JednakostranicanTrougao() {
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    @Override
        public double povrsina(){
        return (stranica * stranica) * 1.73205 / 4;
    }

    @Override
    public  double obim(){
        return 3*stranica;
    }
}
