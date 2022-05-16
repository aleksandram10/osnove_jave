package p16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati metodu koja vraca suprotno negativna broj od prosledjenog.
        // Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //	Ako se metoda pozove za N=-11, vraca 11
        int x=suprotanBroj(-10);
        System.out.println("Suprotan broj "+x);

        int y=suprotanBroj(11);
        System.out.println("Suprotan broj je "+y);

    }

    static int suprotanBroj(int broj){
        return broj*(-1);
    }
}
