package p03_05_2022.Caribic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice.
// Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        IcePoint sladoled1 = new IcePoint("vanila", true);
        IcePoint sladoled2 = new IcePoint("cokolada", false);
        IcePoint sladoled3 = new IcePoint("jagode", true);
        Pica pica1 = new Pica(120);
        Pica pica2 = new Pica(100);

        proizvodi.add(sladoled1);
        proizvodi.add(sladoled2);
        proizvodi.add(sladoled3);
        proizvodi.add(pica1);
        proizvodi.add(pica2);

        Sastojak s1 = new Sastojak("kecap", 50);
        Sastojak s2 = new Sastojak("kackavalj", 90);
        Sastojak s3 = new Sastojak("plazma", 60);
        Sastojak s4 = new Sastojak("cokoladne mrvice", 50);

        sladoled1.ubaciDodatak(s3);
        sladoled2.ubaciDodatak(s4);
        sladoled3.ubaciDodatak(s3);
        pica1.ubaciDodatak(s1);
        pica2.ubaciDodatak(s2);

        for(int i=0; i<proizvodi.size();i++){
            proizvodi.get(i).print();
        }

        double suma=0;
        for (int i=0;i<proizvodi.size();i++){
            suma=suma+proizvodi.get(i).racunajCenu();
        }
        System.out.println("Cena porudzbine je "+suma);


    }
}
