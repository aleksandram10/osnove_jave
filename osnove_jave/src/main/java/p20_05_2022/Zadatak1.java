package p20_05_2022;

public class Zadatak1 {
//Za klasu Tacka, koja ima atribute:
//x - x koordinata
//y - y koordinata
//metodu stampaj
//imamo difoltni konstruktor
//imamo konstuktor koji prima obe koordinate za kreiranje objekta
//U glavnom programu kreirati objekte

    public static void main(String[] args) {
        Tacka a=new Tacka();
        a.x=12;
        a.y=89;

        a.print();

        Tacka b=new Tacka(13,56);
        b.print();
    }
}
