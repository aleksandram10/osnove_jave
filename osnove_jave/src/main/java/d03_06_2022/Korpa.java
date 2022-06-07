package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
//Kreirati klasu Korpa koja ima:
//niz ambalaza

    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

//metodu dodaj ambalazu

    public void dodajAmbalazu(Ambalaza nova) {
        ambalaze.add(nova);
    }

//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

    public void izbaciAmbalazu(String barKod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (this.ambalaze.get(i).barKod.equals(barKod)) {
                this.ambalaze.remove(i);
            }
        }
    }

//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.

private double cenaSvihAmbalaza(double popust){
        double suma=0;
        for(int i=0;i<ambalaze.size();i++){
            suma=suma+ambalaze.get(i).cenaArtikla();
        }
        return suma-suma*popust/100;
}


//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
// kao parametar funkcije se prima Super karticu iz koje se cita popust.

public double ukupnaCenaKorpe(SuperKartica sk){
        return cenaSvihAmbalaza(sk.getPopust());
}
}
