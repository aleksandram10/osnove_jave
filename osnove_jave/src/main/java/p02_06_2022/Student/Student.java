package p02_06_2022.Student;

public abstract class Student {
//Kreirati apstraktnu klasu Student koja ima:
//ime i prezime studenta
//broj indeksa
//godinu studija
//gettere, settere i konstruktore

    protected String punoImeStudenta;
    protected String brojIndeksa;
    protected int godinaStudija;

    public Student() {
    }

    public Student(String punoImeStudenta, String brojIndeksa, int godinaStudija) {
        this.punoImeStudenta = punoImeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    //apstraktnu metodu koja vraca cenu skolarine.

    public abstract int cenaSkolarine();

//apstraktnu metodu koja vraca da li je student na buzetu ili ne.

    public abstract boolean daLiJeNaBudzetu();


//metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budzet/samofinansirajuci
//Cena skolarine: cena

    public void print(){
        System.out.println(this.punoImeStudenta+" , "+this.brojIndeksa+" , "+this.godinaStudija);
        if(daLiJeNaBudzetu()==true){
            System.out.println("Finansiranje: na budzetu");}
               else{
               System.out.println("Finansiranje: nije na budzetu");}
        System.out.println("Cena skolarine: "+cenaSkolarine());
    }



}
