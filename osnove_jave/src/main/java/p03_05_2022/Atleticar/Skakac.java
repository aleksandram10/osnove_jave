package p03_05_2022.Atleticar;

public class Skakac extends Atleticar {

    //Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
    // Kod trkača je bolji manji rezultat, a kod skakača veći.

//    public Skakac() {
//    }

    public Skakac(String punoIme, int rezultatNaTakmicenju) {
        super(punoIme, rezultatNaTakmicenju);
    }


    @Override
    public boolean daLiJeBolji(Atleticar a){
        if (this.rezultatNaTakmicenju > a.rezultatNaTakmicenju) {
            return true;
            } else {
                return false;
            }
        }
    }






