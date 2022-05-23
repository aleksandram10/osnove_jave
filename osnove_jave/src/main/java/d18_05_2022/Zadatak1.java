package d18_05_2022;

public class Zadatak1 {
    //Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)
    //	i metode:
    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    //
    //
    //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
    public static void main(String[] args) {

        Proizvod p= new Proizvod();
        p.naziv="jagode";
        p.cena=399.99;
        p.tezina=900;

        print(p.naziv,p.cena, p.tezina);

        Proizvod r= new Proizvod();
        r.naziv="tresnje";
        r.cena=449.99;
        r.tezina=1000;

        print(r.naziv,r.cena,r.tezina);

    }

    static void print(String a,double b, double c){
        System.out.println("{{"+a+"}} ,"+" {{"+b+"}} , "+"{{"+c+"}}");
    }
}
