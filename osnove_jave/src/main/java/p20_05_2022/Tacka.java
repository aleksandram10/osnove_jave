package p20_05_2022;
//Za klasu Tacka, koja ima atribute:
//x - x koordinata
//y - y koordinata
//metodu stampaj
//imamo difoltni konstruktor
//imamo konstuktor koji prima obe koordinate za kreiranje objekta
//U glavnom programu kreirati objekte
public class Tacka {
    public int x;
    public int y;
    public Tacka(){}

    public Tacka(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void print(){
        System.out.println("x-koordinata je "+this.x+" , a y-koordinata je  "+y);
    }
}
