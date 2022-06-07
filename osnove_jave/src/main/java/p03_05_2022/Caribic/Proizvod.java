package p03_05_2022.Caribic;

import java.util.ArrayList;

public abstract class Proizvod {
//Kreirati abstraktnu klasu Proizvod koja ima:
// niz dodataka
// metodu ubaciDodatak koja dodaje dodatak u niz
// metodu koja vraca cenu svih dodataka koje ima proizvod
// abstraktnu metodu ukupnu racunaj cenu
// abstraktnu metodu stampaj

    protected ArrayList<Sastojak> sastojci=new ArrayList<>();

    public void ubaciDodatak(Sastojak noviDodatak){
        sastojci.add(noviDodatak);
    }

    public double cenaSvihDodatakaProizvoda(){
        double suma=0;
        for (int i=0;i<sastojci.size();i++){
            suma=suma+sastojci.get(i).getCenaDodatka();
        }
        return suma;
    }
// abstraktnu metodu ukupnu racunaj cenu

    public abstract double racunajCenu();

// abstraktnu metodu stampaj

    public abstract void print();

}
