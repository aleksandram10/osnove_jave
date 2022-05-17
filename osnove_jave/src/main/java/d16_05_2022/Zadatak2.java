package d16_05_2022;

public class Zadatak2 {
    //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
    // vraca novu vrednost koja se formira kao na primeru:
    //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
    //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    public static void main(String[] args) {
        int x=noviBroj(2,3);
        System.out.println("Novi broj je "+x);
        int y=noviBroj(6,2);
        System.out.println("Novi broj je "+y);

    }
    static int noviBroj(int a,int b){
        int broj=10*a+b;
        return  broj;
    }

}
