package d02_06_2022;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //U glavnom programu kreirati jednog magacionera i jednog menadzera,
        // postaviti sektore u kojima rade i ispisati platu za svakog



        Magacionar magacionar=new Magacionar("Gaga");
        Menadzer menadzer=new Menadzer("Nikola");

        ArrayList<Radnik> radnici=new ArrayList<>();
        radnici.add(magacionar);
        radnici.add(menadzer);

        Sektor s1=new Sektor("naziv1",10500);
        Sektor s2=new Sektor("naziv2",20000);
        Sektor s3=new Sektor("naziv3",40000);
        Sektor s4=new Sektor("naziv4",60500);

        magacionar.zaposliUSektor(s1);
        magacionar.zaposliUSektor(s2);

        menadzer.zaposliUSektor(s3);
        menadzer.zaposliUSektor(s4);

        for(int i=0;i<radnici.size();i++){
            System.out.println("Plata je "+radnici.get(i).plata());
        }


    }
}
