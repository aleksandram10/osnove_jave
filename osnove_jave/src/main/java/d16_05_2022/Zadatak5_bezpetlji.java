package d16_05_2022;

import java.util.Scanner;

public class Zadatak5_bezpetlji {

    //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
       //
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 6 7 8 9
       //izbroji(-5, 1) ima za rezultlat 5 . Kako?  -4 -3 -2 -1 0
    //Napomena: Resiti bez koriscenja petlji.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = s.nextInt();
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int x = izbrojiBrojeve(m, n);
        System.out.println("Izmedju brojeva " + m + " i " + n + " ima " + x + " brojeva");

    }

    static int izbrojiBrojeve(int broj1, int broj2) {
        int brojac;
        if (broj1 > broj2) {
            brojac = broj1 - broj2 - 1;
        } else if (broj1 <broj2){
            brojac = broj2 - broj1 - 1;
        } else {
            brojac = 0;
        }
        return brojac;

    }

}


