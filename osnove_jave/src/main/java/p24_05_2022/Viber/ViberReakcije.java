package p24_05_2022.Viber;

import p24_05_2022.Viber.ViberKorisnik;

public class ViberReakcije {


      //Kreirati klasu ViberReakcija koja ima:
     //emoji (moze da bude sunglases, heart, smile, like ili sad)
     //korisnika koji je reagovao

    //U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

    private String emoji;
    private ViberKorisnik korisnikKojiJeReagovao;

    public ViberReakcije() {
    }

    public ViberReakcije(String emoji, ViberKorisnik korisnikKojiJeReagovao) {
        this.emoji = emoji;
        this.korisnikKojiJeReagovao = korisnikKojiJeReagovao;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getKorisnikKojiJeReagovao() {
        return korisnikKojiJeReagovao;
    }

    public void setKorisnikKojiJeReagovao(ViberKorisnik korisnikKojiJeReagovao) {
        this.korisnikKojiJeReagovao = korisnikKojiJeReagovao;
    }


}
