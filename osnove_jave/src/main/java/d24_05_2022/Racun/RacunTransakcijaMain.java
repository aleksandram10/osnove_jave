package d24_05_2022.Racun;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun racun1 = new Racun("1213-42254", "Aleksandra Markovic", 10500);

        racun1.menjaStanjeNaRacunu(600);
        racun1.print();

        Racun racun2 = new Racun("34405-345325", "Marko Markovic", 2050);
        racun2.print();

        Transakcija transakcija1 = new Transakcija("123", racun1, racun2);

        transakcija1.izvrsiTransakciju(500);
        transakcija1.print();
        racun1.print();
        racun2.print();


    }
}
