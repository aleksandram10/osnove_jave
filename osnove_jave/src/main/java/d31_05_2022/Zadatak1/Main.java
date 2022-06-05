package d31_05_2022.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Kreirati klasu Osoba koja ima:
        //ime i prezime
        //jmbg
        //godinu rodjenja
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere
        //metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //broj (broj koji igrac nosi)
        //poziciju koju igra (odbrambeni, napadac, … )
        //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere za broj, kapiten i poziciju
        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
        //godine iskustva
        //tip trenera (kondicioni, za igru, pomocni, personalni)
        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
        //
        //U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


        Igrac igrac1 = new Igrac("Gaga", "1010994", 1994, 10, "odbrana", false);
        igrac1.print();
        Igrac igrac2 = new Igrac();
        igrac2.setBroj(5);
        igrac2.setPozicija("napad");
        igrac2.setGodRodjenja(1990);
        igrac2.setDaLiJeKapiten(true);
        igrac2.setPunoIme("Nikola");
        igrac2.setJmbg("124141");
        igrac2.print();

        Trener trener1 = new Trener("Jovan Jovanovic", "141252", 1977, 15, "kondicioni");
        trener1.print();

        //(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace
        // i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj igraca: ");
        int n = s.nextInt();

        ArrayList<Igrac> igraci = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Uneti puno ime igraca:");
            String ime = s.next();
            System.out.print("Uneti jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Uneti godinu rodjenja igraca: ");
            int god = s.nextInt();
            System.out.print("Uneti koji broj igrac nosi: ");
            int broj = s.nextInt();
            System.out.print("Uneti poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Da li je igrac kapiten? (true/false) : ");
            boolean kapiten = s.nextBoolean();

            Igrac igr = new Igrac(ime, jmbg, god, broj, pozicija, kapiten);
            igraci.add(igr);
        }



        System.out.println("Uneti broj trenera: ");
        int m = s.nextInt();

        ArrayList<Trener> treneri = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            System.out.print("Uneti puno ime trenera:");
            String ime = s.next();
            System.out.print("Uneti jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Uneti godinu rodjenja trenera: ");
            int god = s.nextInt();
            System.out.print("Uneti godine iskustva trenera: ");
            int iskustvo = s.nextInt();
            System.out.print("Uneti tip trenera: ");
            String tip = s.next();

            Trener tr = new Trener(ime, jmbg, god, iskustvo, tip);
            treneri.add(tr);
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).print();
        }

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).print();
        }


    }
}
