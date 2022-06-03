package p23_05_2022;

public class ClanskaKartaKupacProizvodMain {
    public static void main(String[] args) {

        ClanskaKarta karta=new ClanskaKarta();
        karta.setBrojKartice("123-456");
        karta.setPopust(7);

        Kupac kupac=new Kupac();
        kupac.setPunoIme("Aleksandra Markovic");

        kupac.setClanskaKarta(karta);
        kupac.print();

        System.out.println("    ");

        Proizvod proizvod=new Proizvod();
        proizvod.setCena(500);
        proizvod.setNaziv("knjiga ");
      //  proizvod.setClanskaKarta(karta);
        proizvod.setKupac(kupac);

        proizvod.print();

    }
}
