package p02_06_2022.VideoPlayer;

import p02_06_2022.VideoPlayer.VideoPlayer;

public class VideoPlayerMain {
    public static void main(String[] args) {
        VideoPlayer videoPlayer=new VideoPlayer(120,60,30,144);
        TimeControl timeControl=new TimeControl(true);
        System.out.println("Trenutno vreme videa je ");

        timeControl.izvrsiAkciju(videoPlayer);
        System.out.println(videoPlayer.getTrenutnoVremeVidea());
      //  System.out.println(timeControl.izvrsiAkciju(videoPlayer.getTrenutnoVremeVidea());

        QualityOptimizerControl qualityOptimizerControl=new QualityOptimizerControl(100);
        System.out.println("Kvalitet interneta je ");
        qualityOptimizerControl.izvrsiAkciju(videoPlayer);
        System.out.println(videoPlayer.getKvalitetVidea());

    }
}
