package p03_05_2022.Objekat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta
        // i istestirati sve metode.


        //Objekat objekat = new Objekat("JNA", 150, 2);

        Kuca kuca1 = new Kuca("JNA",120,2,3);
        Kuca kuca2 = new Kuca("Skerliceva",90,3,2);

        Zgrada z1 = new Zgrada("Kneza Danila",200,3,9);
        Zgrada z2 = new Zgrada("JNA",4500,2,79);

        Lokal l1 = new Lokal("Kneza Milosa", 200, 1);
        Lokal l2 = new Lokal("Kneza Mihaila", 120, 2);


        ArrayList<Objekat> objekti = new ArrayList<>();
        PoreskaUprava poreskaUprava = new PoreskaUprava("Kragujevac",objekti);
       poreskaUprava.dodajObjekat(kuca1);
        poreskaUprava.dodajObjekat(kuca2);
        poreskaUprava.dodajObjekat(z1);
        poreskaUprava.dodajObjekat(z2);
        poreskaUprava.dodajObjekat(l1);
        poreskaUprava.dodajObjekat(l2);

        poreskaUprava.print();
        System.out.println("Max porez ima objekat");
        poreskaUprava.objekatMaxPorez().stampaj();
        System.out.println("Min porez ima objekat ");
        poreskaUprava.objekatMinPorez().stampaj();
        System.out.println("Ukupan porez je: "+poreskaUprava.ukupanPorez());



    }
}
