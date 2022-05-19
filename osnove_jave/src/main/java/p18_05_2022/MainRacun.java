package p18_05_2022;

import java.util.Scanner;

public class MainRacun {
    //1.Zad
    ////		Kreirati klasu Racun koja ima
    ////		broj racuna (npr: 840-23932-323)
    ////		ime i prezime vlasnika
    ////		stanje na racunu
    ////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
    public static void main(String[] args) {


        Racun r = new Racun();
        r.brojRacuna = "84011443252";
        r.imeIprezimeVlasnika = "Aleksandra Markovic";
        r.stanjeNaRacunu = 1000;

        System.out.println("Broj racuna je " + r.brojRacuna);
        System.out.println("Ime i prezime vlasnika je "+ r.imeIprezimeVlasnika);
        System.out.println("Stanje na racunu je "+r.stanjeNaRacunu);

        Racun p=new Racun();
        p.brojRacuna = "84075653252";
        p.imeIprezimeVlasnika = "Marko Markovic";
        p.stanjeNaRacunu = 200;
        System.out.println("Broj racuna je " + p.brojRacuna);
        System.out.println("Ime i prezime vlasnika je "+ p.imeIprezimeVlasnika);
        System.out.println("Stanje na racunu je "+p.stanjeNaRacunu);

        //Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
        // Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
        //
        //Primer izvrsenja:
        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
        //Primalac: Marko Markovic, 840-23932-334, stanje: 200
        //Unesite sumu za transakciju: 500
        //Stanje nakon stransakcije
        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
        //Primalac: Marko Markovic, 840-23932-334, stanje: 700
        System.out.println("");
        Scanner s=new Scanner(System.in);
        System.out.println("Posiljalac: "+r.imeIprezimeVlasnika+" , "+r.brojRacuna+" , stanje: "+r.stanjeNaRacunu);
        System.out.println("Primalac: "+p.imeIprezimeVlasnika+" , "+p.brojRacuna+" , stanje: "+p.stanjeNaRacunu);

        System.out.print("Unesite sumu za transakciju: ");
        int suma=s.nextInt();
        r.stanjeNaRacunu=r.stanjeNaRacunu-suma;
        p.stanjeNaRacunu= p.stanjeNaRacunu+suma;

        System.out.println("Stanje nakon transakcije");
        System.out.println("Posiljalac: "+r.imeIprezimeVlasnika+" , "+r.brojRacuna+" , stanje: "+r.stanjeNaRacunu);
        System.out.println("Primalac: "+p.imeIprezimeVlasnika+" , "+p.brojRacuna+" , stanje: "+p.stanjeNaRacunu);



    }
}
