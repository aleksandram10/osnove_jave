package p03_05_2022.Atleticar;

public class Trkac extends Atleticar {
   //Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
    // Kod trkača je bolji manji rezultat, a kod skakača veći.


//    public Trkac() {
//    }

    public Trkac(String punoIme, int rezultatNaTakmicenju) {
        super(punoIme, rezultatNaTakmicenju);
    }

    @Override
    public  boolean daLiJeBolji(Atleticar a){
        if(a.rezultatNaTakmicenju>this.rezultatNaTakmicenju)
        { return true;}
        else return false;
    }

}
