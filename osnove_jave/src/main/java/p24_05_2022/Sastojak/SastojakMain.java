package p24_05_2022.Sastojak;

import p24_05_2022.Sastojak.Sastojak;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMain {
    public static void main(String[] args) {
        ////--U glavnom programu kreirati 3 sastojka.
        //    //	 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
        //    //	 Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();

        // Sastojak prvi=new Sastojak("brasno",80 );
        // Sastojak drugi=new Sastojak("secer",100);
        // Sastojak treci=new Sastojak("jaja",150);

        ArrayList<Sastojak> niz = new ArrayList<Sastojak>();

        for (int i = 0; i < n; i++) {

            System.out.print("Unesite ime sastojka: ");
            String naziv = s.next();
            System.out.println("Unesite cenu sastojka: ");
            double cena = s.nextDouble();

            Sastojak sastojak1 = new Sastojak(naziv, cena);

            //sastojak1.setNaziv(naziv);
            //sastojak1.setCena(cena);

            niz.add(sastojak1);

        }


        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i).getNaziv());
            System.out.println(niz.get(i).getCena()+ ", ");
        }
    }


}

