package p02_06_2022.VideoPlayer;

public class QualityOptimizerControl extends Control {
    //Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
    //ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s

    private int brzinaInterneta;

    //gettere, settere i konstruktore

    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
// Kvalitet se racuna na osnovu formule:
    //brzina interneta * 10.1, gde se uzima prvi veci kvalitet
    //npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
    //npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
    //npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    @Override
    public  void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (brzinaInterneta * 10.1 <= 144) {
            videoPlayer.setKvalitetVidea(144);
        } else if (brzinaInterneta * 10.1 <= 240) {
            videoPlayer.setKvalitetVidea(240);
        } else if (brzinaInterneta * 10.1 <= 720) {
            videoPlayer.setKvalitetVidea(720);
        }else if (brzinaInterneta * 10.1 <= 1080) {
            videoPlayer.setKvalitetVidea(1080);
    }//eturn videoPlayer.getKvalitetVidea();
    }

    //Kvalitet videa (144, 240, 360, 480, 720, 1080)


    //U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
}
