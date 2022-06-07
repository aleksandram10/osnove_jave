package p02_06_2022.Student;

import p02_06_2022.Student.Student;

public class StudentOsnovnih extends Student {
    //Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
    //koja za cenu skolarine vraca 90000
    //za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
    //stampajte podatke po izboru


    public StudentOsnovnih() {
    }

    public StudentOsnovnih(String punoImeStudenta, String brojIndeksa, int godinaStudija) {
        super(punoImeStudenta, brojIndeksa, godinaStudija);
    }

    @Override
    public  int cenaSkolarine(){
        return 9000;
    }
    @Override
    public  boolean daLiJeNaBudzetu(){
        if(godinaStudija<5)return true;
        return false;
    }

//    @Override
//    public void print(){
//        System.out.println(this.punoImeStudenta+" , "+this.brojIndeksa+" , "+this.godinaStudija);
//        if(daLiJeNaBudzetu()==true){
//        System.out.println("Finansiranje: na budzetu");}
//                else{
//                System.out.println("Finansiranje: nije na budzetu");}
//        System.out.println("Cena skolarine: "+cenaSkolarine());
    }


