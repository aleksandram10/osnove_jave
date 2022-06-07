package d03_06_2022;

public class Main {
    public static void main(String[] args) {
        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
        // i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa k=new Korpa();
        StaklenaAmbalaza a1=new StaklenaAmbalaza("131-324","mleko",150,400,90,false,150);
        Tetrapak a2=new Tetrapak("13-421","Coca-cola",200,500,true,300);

        k.dodajAmbalazu(a1);
        k.dodajAmbalazu(a2);

        System.out.println("Cena korpe je "+k.ukupnaCenaKorpe(new SuperKartica("314","Gaga",10)));

        k.izbaciAmbalazu("131-324");
        System.out.println("Cena korpe je "+k.ukupnaCenaKorpe(new SuperKartica("314","Gaga",10)));

        a1.print();
        a2.print();


    }
}
