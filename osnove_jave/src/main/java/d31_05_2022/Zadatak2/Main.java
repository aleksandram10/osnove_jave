package d31_05_2022.Zadatak2;

import d31_05_2022.Zadatak2.Igrac;
import d31_05_2022.Zadatak2.Karton;

public class Main {
    public static void main(String[] args) {
       //U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

       Igrac igrac1=new Igrac("Aleksadndra","1412424",1994,10,"odbrana",true);

       Karton k1=new Karton("zuti");
       Karton k2=new Karton("zuti");
       Karton k3=new Karton("crveni");

       igrac1.dodajKarton(k1);
       igrac1.dodajKarton(k2);
       igrac1.dodajKarton(k3);

       igrac1.print();

    }
}
