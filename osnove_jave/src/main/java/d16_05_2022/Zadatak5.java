package d16_05_2022;

import java.util.Scanner;

public class Zadatak5 {

    //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
    //
    //Primer izvrsenja:
    //izbroji(5, 10) ima za rezultat 4. Kako? 6 7 8 9
    //izbroji(-5, 1) ima za rezultlat 5 . Kako?  -4 -3 -2 -1 0

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m=s.nextInt();
        System.out.print("Unesite N: ");
        int n=s.nextInt();
        int x=izbrojiBrojeve(m,n);
        System.out.println("Izmedju brojeva "+m+" i "+n+" ima "+x+" brojeva");

    }

    static int izbrojiBrojeve(int broj1,int broj2){
        int brojac=0;
        for(int i=broj1+1;i<broj2; i++) {
            brojac = brojac + 1;
        }
         return brojac;
        }

}
