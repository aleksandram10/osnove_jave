package p16_05_2022;

public class Zadatak8 {
    //Napisati metodu koja proverava da li je trougao pravougli.
    // Metoda prima stranice trougla i hipotenuzu trougla.
    // Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
    //Trougao je pravougli ukoliko je a*a+b*b=c*c

    public static void main(String[] args) {
        boolean x=pitagora(2,3,5);
        System.out.println(x);
    }

    static boolean pitagora(int a,int b, int c){
        if(a*a+b*b==c*c){
            return true;
        }else{
            return false;
        }
    }
}
