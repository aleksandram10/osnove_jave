package p31_05_2022.StudentProfesor;

public class Profesor extends Osoba {
    //Kreirati klasu Profesor koja nasledjuje klasu Osoba,
    //			koja od dodatnih atributa ima:
    //naziv predmeta koji predaje
    //iznos plate
    //konstuktor sa parametrima
    //metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
    //Napisati implementaciju metode stampaj da stampa sve podatke o profesoru

    private String nazivPredmeta;
    private double plata;

    public Profesor(String punoIme, String jmbg, String nazivPredmeta, double plata) {
        super(punoIme, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.plata = plata;
    }

    public void povecajPlatu(int procenat) {

        this.plata = this.plata + (procenat * this.plata) / 100;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Naziv predmeta "+this.nazivPredmeta);
        System.out.println("Plata je "+this.plata);
    }
}
