package d24_05_2022.ZeleniKarton;

import d24_05_2022.ZeleniKarton.ZeleniKartonMain;

import java.util.ArrayList;

public class ZeleniKartonMain {
    public static void main(String[] args) {

            //Zadatak
            //Kreirati klasu ZeleniKarton koja ima:
            //ime i prezime studenta
            //broj indeksa
            //naziv predmeta
            //ime i prezime profesora
            //ocenu - od 5 do 10
            //gettere i settere
            //konstruktore
            //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
            //metodu stampaj koja stampa podatke u formatu:
            //		(naziv predmeta) - (ocena)
            //		Student: ime i prezime, broj indeksa
            //		Profesor: ime i prezime
            //
            //	U glavnoj klasi:
            //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
            //(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
            //(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

            ArrayList<ZeleniKarton> kartoni = new ArrayList<>();

            ZeleniKarton karton = new ZeleniKarton("Aleksandra Markovic", "30/12", "matematika 1", "Mirko Golubic", 8);
            kartoni.add(karton);

            ZeleniKarton karton1 = new ZeleniKarton("Gaga", "12/34", "matematika2", "Marko", 5);
            kartoni.add(karton1);

            ZeleniKarton karton2 = new ZeleniKarton("Aleksandra Markovic", "1021/20", "matematika3", "Mirjana Pavlovic", 9);
            kartoni.add(karton2);

            double sveOcene = 0;
            double sveOcenePolozenihIspita = 0;
            int broj = 0;

            for (int i = 0; i < kartoni.size(); i++) {
                kartoni.get(i).stampaj();
                sveOcene = sveOcene + kartoni.get(i).getOcena();

                if (kartoni.get(i).ispitPolozen() == true) {
                    sveOcenePolozenihIspita = sveOcenePolozenihIspita + kartoni.get(i).getOcena();
                    broj = broj + 1;
                }
            }


            double prosecnaOcena = sveOcene / kartoni.size();
            double prosecnaOcenaPolozenihIspita = sveOcenePolozenihIspita / broj;

            System.out.println("Prosecna ocena za sve ocene je " + prosecnaOcena);
            System.out.println("Prosecna ocena polozenih ispita je " + prosecnaOcenaPolozenihIspita);
        }












}

