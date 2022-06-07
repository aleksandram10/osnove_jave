package p02_06_2022.Figura;

import java.util.ArrayList;

public class FiguraMain {
    public static void main(String[] args) {

//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine
        // i obime i za svaku figuru ispisati ponaosob

        JednakostranicanTrougao trougao1 = new JednakostranicanTrougao(4);
        trougao1.print();

        JednakostranicanTrougao trougao2=new JednakostranicanTrougao(1);

        Pravougaonik p1=new Pravougaonik(2,3);
        Pravougaonik p2=new Pravougaonik(4,5);
        Pravougaonik p3=new Pravougaonik(6,10);

        ArrayList<Figura>figure=new ArrayList<>();
        figure.add(trougao1);
        figure.add(trougao2);
        figure.add(p1);
        figure.add(p2);
        figure.add(p3);
        double povrsina=0;
        double obim=0;

        for(int i=0;i<figure.size();i++){
            povrsina=povrsina+figure.get(i).povrsina();
            obim=obim+figure.get(i).obim();
            figure.get(i).print();
        }
        System.out.println("Ukupna povrsina je "+povrsina);
        System.out.println("Ukupan obim je "+obim);
    }
}