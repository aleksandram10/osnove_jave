package d30_05_2022.Student;

public class Main {
    public static void main(String[] args) {
//        Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)

        Ispit i1=new Ispit("matematika1",8,"Aleksandra Markovic");
        Ispit i2=new Ispit("matematika2",5,"Marko Markovic");
        Ispit i3=new Ispit("matematika3",9,"Gaga");
        Ispit i4=new Ispit("matematika4",10,"Mirjana Pavlovic");

        Student student=new Student("12/10","Aleksandra Milicevic","osnovne");
        student.dodajIspit(i1);
        student.dodajIspit(i2);
        student.dodajIspit(i3);
        student.dodajIspit(i4);

        student.print();

    }
}
