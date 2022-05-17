package d16_05_2022;
import java.util.Scanner;
public class Zadatak4 {

    //  Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
    //  Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
    //  / / / / /

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n=s.nextInt();
        System.out.print("Unesite karakter: ");
        String karakter=s.next();
        stampa(n,karakter);
    }

    static void stampa(int a,String karakter){
        for(int i=0;i<a;i++){
            System.out.print(karakter+" ");
        }

    }
}
