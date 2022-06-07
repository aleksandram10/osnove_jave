package p03_05_2022.Atleticar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Disciplina {
    //Kreirati i klasu Disciplina čiji su privatni atributi:
    //ime discipline
    //tip discipline (Trkacka ili Skakacka)
    //niz atletičara koji učestvuju u toj disciplini.
    private String imeDiscipline;
    private String tipDiscipline;

    private ArrayList<Atleticar> nizAtleticara=new ArrayList<>();

    //U javnom delu klase definisati:
    //konstuktore, gettere i settere
    //konstruktor koji postavlja ime discipline i tip


    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;

    }

    public Disciplina() {
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }


    //metodu dodaj atleticara u disciplinu

    public void dodajAtleticara(Atleticar novi){
        nizAtleticara.add(novi);
    }


    //metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara

    public void diskvalifikuj(String punoIme){
        for(int i=0;i<nizAtleticara.size();i++){
                if(nizAtleticara.get(i).getPunoIme().equals(punoIme)){
                    nizAtleticara.remove(i);
                }
    }}

    //(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime)
    // sa najboljim rezultatom

    public Atleticar nadjiNajboljeg() {
        Atleticar najbolji = this.nizAtleticara.get(0);
        for (int i = 1; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).daLiJeBolji(najbolji)) {
                najbolji = this.nizAtleticara.get(i);
            }
        }

        return najbolji;
    }

    private Atleticar vratiNajboljeg() {
        Atleticar a = this.nizAtleticara.get(0);
        for (int i = 1; i < this.nizAtleticara.size(); i++) {
            if(this.nizAtleticara.get(i).daLiJeBolji(a)) {
                a = this.nizAtleticara.get(i);
            }
        }

        return a;
    }


    //(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.

    public void stampajPobednika() {
        this.vratiNajboljeg().print();
    }



}
