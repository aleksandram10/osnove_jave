package d18_05_2022;

public class Zadatak2 {
    //Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu: Proizvoljno :)
    //
    //
    //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
    // i za svaki od njih pozvati metodu za stampu

    public static void main(String[] args) {
        SmartAirConditioning s= new SmartAirConditioning();
        s.marka="Samsung";
        s.temperatura=20;
        s.mod="hladi";

        print(s.marka,s.temperatura, s.mod);
        System.out.println("");
        SmartAirConditioning r= new SmartAirConditioning();
        r.marka="Galanz";
        r.temperatura=30;
        r.mod="greje";

        print(r.marka,r.temperatura, r.mod);



    }

    static void print(String a, int b, String c){
        System.out.println("Marka klime je "+a);
        System.out.println("Izabrana temperatura je "+b);
        System.out.println("Mod je "+c);
    }
}
