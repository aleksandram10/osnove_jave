package p16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {
        //Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost
        // prosledjene vrednosti.
        stampajApsolutnuVrednost(-6);
    }

    static void stampajApsolutnuVrednost(int broj){
        int apsolutno;
        if(broj>=0){
            apsolutno=broj;
        }else{
            apsolutno=-broj;}
        System.out.println("Apsolutna vrednost broja "+broj+" je "+apsolutno);
        }

    }

