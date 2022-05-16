package p16_05_2022;

public class Zadatak6 {
    //Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
    //Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
    //N=5, print je=> * * * * *
    //
    //Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
    //N=9, print je=> * * * * * * * * * public static void main(String[] args) {
    public static void main(String[] args) {
        zvezdice(5);
        System.out.println();
        zvezdice(9);
    }


    static void zvezdice(int broj){

    for (int i=0;i<broj;i++){
        System.out.print("* ");
    }
    }
}
