package p02_06_2022.VideoPlayer;

public class TimeControl extends Control {

//    //Kreirati klasu TimeControl koja nasledjuje klasu Control i
//    //konstruktore
//    //ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)

    private boolean naKojuStranuPomeraVremeVidea;

    public TimeControl() {
    }

    public TimeControl(boolean naKojuStranuPomeraVremeVidea) {
        this.naKojuStranuPomeraVremeVidea = naKojuStranuPomeraVremeVidea;
    }
    //implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili
    // unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {   //true-desno; false-levo
        if (this.naKojuStranuPomeraVremeVidea == true) {
            if (videoPlayer.getTrenutnoVremeVidea() + 15 <= videoPlayer.getDuzinaVidea()) {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() + 15) ;
            } else {
                if (videoPlayer.getTrenutnoVremeVidea() - 15 < 0) {
                    videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() - 15) ;
                }
            }

        }//return  videoPlayer.getTrenutnoVremeVidea();
    }
}



