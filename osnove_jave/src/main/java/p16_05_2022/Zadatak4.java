package p16_05_2022;
import java.util.Scanner;
public class Zadatak4 {
    public static void main(String[] args) {
//4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
// za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
// U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.


    operacije(10,5);
    }

    static void operacije(int broj1,int broj2){
        int zbir=broj1+broj2;
        int razlika=broj1-broj2;
        int proizvod=broj1*broj2;
        int kolicnik=broj1/broj2;
        System.out.println("Zbir je "+zbir+", razlika je "+razlika+", proizvod je  "+proizvod
        +"  , a kolicnik je  "+kolicnik);
    }
}
