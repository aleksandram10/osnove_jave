package p16_05_2022;

public class Zadatak9 {
    //Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
    //1 - I
    //2 - II
    //3 - III
    //4 - IV
    //5 - V
    //6 - VI
    //7 - VII
    //8 - VIII
    //9 - IX
    //10 - X
    //
    //Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
    //Ako se unese VIII vraca se 8.
    //
    //VIII => 8

    public static void main(String[] args) {

        int rimski=konverzija("X");//da se prosledi string - mora sa navodnicima!!!
        System.out.println(rimski);

    }
    static int konverzija(String a){
        if(a.equals("I")){return 1;}
        else if(a.equals("II")){return 2;}
        else if(a.equals("III")){return 3;}
        else if(a.equals("IV")){return 4;}
        else if(a.equals("V")){return 5;}
        else if(a.equals("VI")){return 6;}
        else if(a.equals("VII")){return 7;}
        else if(a.equals("VIII")){return 8;}
        else if(a.equals("XI")){return 9;}
        else if(a.equals("X")){return 10;}
        else if(a.equals("L")){return 50;}
        else if(a.equals("S")){return 100;}
        else if(a.equals("M")){return 1000;}
        else{return 0;}
    }
}
