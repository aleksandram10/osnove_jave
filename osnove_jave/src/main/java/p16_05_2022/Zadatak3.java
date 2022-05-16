package p16_05_2022;

public class Zadatak3 {
//Napisati metodu koja stampa zvezdicu sa razmakom.
// U glavnom programu je potrebno odstampati sledecu sliku:
//*  *  *
//*  *
//*

    public static void main(String[] args) {

        star();
        star();
        star();
        System.out.println();
        star();
        star();
        System.out.println();
        star();
        System.out.println("    ");

        for(int i=0;i<6;i++){
            star();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            star();
        }
        System.out.println();
        for(int i=0;i<4;i++){
            star();
        }
        System.out.println();
        for(int i=0;i<3;i++){
            star();
        }
        System.out.println();
        for(int i=0;i<2;i++){
            star();
        }
        System.out.println();
        star();



    }

    static void star() {
        System.out.print("* ");
    }
    //Primer 2:
    //* * * * * *
    //  * * * * *
    //	* * * *
    //	* * *
    //	* *
    //	*
}
