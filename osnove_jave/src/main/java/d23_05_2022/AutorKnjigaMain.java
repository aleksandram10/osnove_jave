package d23_05_2022;

import p19_05_2022.Auto;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor autor1=new Autor("Aleksandra","Markovic");
        Autor autor2=new Autor("Marko","Markovic");

        autor1.stampaj();
        autor2.stampaj();
        System.out.println("");

        Knjiga knjiga1=new Knjiga("123sfg","Kako preziveti dan",2021,autor1);
        Knjiga knjiga2=new Knjiga("234tre","Zivot je lep",2019,autor1);
        Knjiga knjiga3=new Knjiga("766gds","Nije mi jasno",2022,autor2);

        knjiga1.setAutor(autor1);
        knjiga2.setAutor(autor1);
        knjiga3.setAutor(autor2);


        knjiga1.stampaj();
        System.out.println("");
        knjiga2.stampaj();
        System.out.println(" ");
        knjiga3.stampaj();


    }
}
