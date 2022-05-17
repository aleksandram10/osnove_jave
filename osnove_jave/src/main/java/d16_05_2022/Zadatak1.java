package d16_05_2022;

public class Zadatak1 {
    //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
    // prosledjena vrednost za 10 veca.
    // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

    public static void main(String[] args) {

        stampajVrednostZa10Vecu(9);
        stampajVrednostZa10Vecu(38);
        stampajVrednostZa10Vecu(-32);
    }

    static void stampajVrednostZa10Vecu(int broj) {
        int brojZa10Veci = broj + 10;
        System.out.println("Broj koji je za 10 veci od broja " + broj + " je " + brojZa10Veci);

    }
}
