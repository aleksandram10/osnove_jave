package p31_05_2022.StudentProfesor;

public class ProfesorStudentOsobaMain {
    public static void main(String[] args) {
//        Kreirati klasu Osoba koja od atributa ima:
//        ime i prezime
//                jmbg
//        konstuktor sa parametrima
//        metodu stampaj koja stampa podatke u formatu
//        ime prezime, jmbg
//
//
//        Kreirati klasu Student koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        broj indeksa
//        dug za skolarinu
//        konstuktor sa parametrima
//        metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//                Napisati implementaciju metode stampaj da stampa sve podatke o studentu
//
//
//        Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        naziv predmeta koji predaje
//        iznos plate
//        konstuktor sa parametrima
//        metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//        Napisati implementaciju metode stampaj da stampa sve podatke o profesoru
//
//
//        U glavnom programu kreirati 2 studenta i 2 profesora.

        Osoba osoba = new Osoba("Gaga", "Gagic");
        osoba.print();

        Student student1 = new Student("Aleksandra Markovic", "10109945678", 30, 350);
        Student student2 = new Student("Marko Markovic", "120341441", 56, 0);

        student1.uplatiSkolarinu(200);
        student1.print();
        student2.print();

        Profesor profesor1=new Profesor("Tatjana Tomic","213421543214","matematika2",67000);
        Profesor profesor2=new Profesor("Dimitrije Minic","134124214","matematika3",89000);

        profesor1.povecajPlatu(10);
        profesor1.print();
        profesor2.print();


    }
}
