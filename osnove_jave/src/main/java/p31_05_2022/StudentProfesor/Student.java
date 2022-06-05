package p31_05_2022.StudentProfesor;

import p31_05_2022.StudentProfesor.Osoba;

public class Student extends Osoba {
    //Kreirati klasu Student koja nasledjuje klasu Osoba,
    //			koja od dodatnih atributa ima:
    //broj indeksa
    //dug za skolarinu
    //konstuktor sa parametrima
    //metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
    // Metoda prima iznos uplate kao parametar metode.
    //Napisati implementaciju metode stampaj da stampa sve podatke o studentu

    private int brojIndeksa;
    private double dugSkolarine;

    public Student(String punoIme, String jmbg, int brojIndeksa, double dugSkolarine) {
        super(punoIme, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugSkolarine = dugSkolarine;
    }

    public void uplatiSkolarinu(double novac){

        this.dugSkolarine=this.dugSkolarine-novac;
        if(this.dugSkolarine<0){this.dugSkolarine=0;}

    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj indeksa je "+this.brojIndeksa);
        System.out.println("Dug za skolarinu je "+this.dugSkolarine);
    }



}
