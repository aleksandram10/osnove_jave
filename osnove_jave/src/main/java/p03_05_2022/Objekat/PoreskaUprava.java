package p03_05_2022.Objekat;

import java.util.ArrayList;

public class PoreskaUprava {
    //Kreirati klasu PoreskaUprava koja za atribute ima:
    //ime grada u kom se nalazi
    //niz objekata
    //metodu dodaj objekat

    private String grad;
    private ArrayList<Objekat> objekti = new ArrayList<>();


    public PoreskaUprava(String grad, ArrayList<Objekat> objekti) {
        this.grad = grad;
        this.objekti = objekti;
    }

    public void dodajObjekat(Objekat noviObjekat) {
        objekti.add(noviObjekat);
    }


//(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez

    public Objekat objekatMaxPorez() {
        Objekat max = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
            if (objekti.get(i).porezObjekta() >= max.porezObjekta()) {
                max = objekti.get(i);
            }
        }
        return max;
    }


    //(za vezbanje) metodu koja vraca objekat sa najmanjim porezom

    public Objekat objekatMinPorez() {
        Objekat min = objekti.get(0);
        for (int i = 0; i < objekti.size(); i++) {
            if (objekti.get(i).porezObjekta() < min.porezObjekta()) {
                min = objekti.get(i);
            }
        }
        return min;
    }


    //metodu koja racuna ukupan porez za ceo grad

    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < objekti.size(); i++) {
            suma = suma + objekti.get(i).porezObjekta();
        }
        return suma;
    }


    //metodu koja stampa sve objekte
    public void print() {
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();
//            System.out.print(objekti.get(i).getAdresa()+" ");
//            System.out.print(objekti.get(i).getPovrsina()) +" ";
//            System.out.print(objekti.get(i).getZona()+" ");
        }
    }


}
