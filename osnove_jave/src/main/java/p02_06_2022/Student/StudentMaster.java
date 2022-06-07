package p02_06_2022.Student;

import p02_06_2022.Student.Student;

public class StudentMaster extends Student {
    //Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
    //koja za cenu skolarine vraca 100000
    //za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
    //	U glavnoj klasi kreirati studente i testirati funkciolanosti

    public StudentMaster() {
    }

    public StudentMaster(String punoImeStudenta, String brojIndeksa, int godinaStudija) {
        super(punoImeStudenta, brojIndeksa, godinaStudija);
    }

    @Override
    public  int cenaSkolarine(){
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu(){
        if(godinaStudija<2){return true;}
        else return false;
    }

//    @Override
//    public void print(){
//        System.out.println(this.punoImeStudenta+" , "+this.brojIndeksa+" , "+this.godinaStudija);
//        if(daLiJeNaBudzetu()==true){
//            System.out.println("Finansiranje: na budzetu");}
//                else{
//                System.out.println("Finansiranje: nije na budzetu");}
//            System.out.println("Cena skolarine: "+cenaSkolarine());
//        }
}
