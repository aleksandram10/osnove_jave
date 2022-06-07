package p02_06_2022.VideoPlayer;

public class VideoPlayer {
    //Kreirati klasu VideoPlayer koja ima:
    //duzinu videa
    //trenutno vreme videa
    //jacinu zvuka
    //Kvalitet videa (144, 240, 360, 480, 720, 1080)
    //gettere, settere i konstruktore


    private int duzinaVidea;
    private int trenutnoVremeVidea;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    //metodu stampaj koja stampa podatke u formatu:
    //trenutno vreme videa
    //jacina zvuka
    //kavlitet videa
    private void print(){
        System.out.println(this.trenutnoVremeVidea);
        System.out.println(jacinaZvuka);
        System.out.println(kvalitetVidea);
    }


}
