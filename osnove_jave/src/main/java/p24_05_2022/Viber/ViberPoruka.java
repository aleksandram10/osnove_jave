package p24_05_2022.Viber;

public class ViberPoruka {
    //Kreirati klasu ViberPoruka koja ima:
    //tekst poruke
    //vreme kad je poslata poruka
    //korisnika koji je poslao poruku
    //korisnika kome je poslata poruka
    //gettere i setere i konstuktore
    //rekaciju na poruku

    private String tekstPoruke;
    private String vremeKadaJePoslata;
    private ViberKorisnik koJePoslao;
    private ViberKorisnik komeJePoslao;
    private ViberReakcije reakcijaNaPoruku;

    public ViberPoruka() {
    }

    public ViberPoruka(String tekstPoruke, String vremeKadaJePoslata, ViberKorisnik koJePoslao, ViberKorisnik komeJePoslao, ViberReakcije reakcijaNaPoruku) {
        this.tekstPoruke = tekstPoruke;
        this.vremeKadaJePoslata = vremeKadaJePoslata;
        this.koJePoslao = koJePoslao;
        this.komeJePoslao = komeJePoslao;
        this.reakcijaNaPoruku = reakcijaNaPoruku;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVremeKadaJePoslata() {
        return vremeKadaJePoslata;
    }

    public void setVremeKadaJePoslata(String vremeKadaJePoslata) {
        this.vremeKadaJePoslata = vremeKadaJePoslata;
    }

    public ViberKorisnik getKoJePoslao() {
        return koJePoslao;
    }

    public void setKoJePoslao(ViberKorisnik koJePoslao) {
        this.koJePoslao = koJePoslao;
    }

    public ViberKorisnik getKomeJePoslao() {
        return komeJePoslao;
    }

    public void setKomeJePoslao(ViberKorisnik komeJePoslao) {
        this.komeJePoslao = komeJePoslao;
    }

    public ViberReakcije getReakcijaNaPoruku() {
        return reakcijaNaPoruku;
    }

    public void setReakcijaNaPoruku(ViberReakcije reakcijaNaPoruku) {
        this.reakcijaNaPoruku = reakcijaNaPoruku;
    }


//metodu prikazi koja stampa podatke o poruci u formatu:
    //From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
    //To: [Ime i prezime korisnika kome je poslata]
    //[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
    //
    //POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
    //if (this.reakcija != null)

    public void print(){
        System.out.print("From: "+this.koJePoslao.getPunoIme()+" * " );
        if(this.koJePoslao.isDaLiJeTrenutnoAktivan()) System.out.print("Active Now");
        else{
            System.out.print("Not Active");}
        System.out.print(" at "+this.vremeKadaJePoslata);
        if(this.reakcijaNaPoruku !=null){
        System.out.println(this.tekstPoruke+" : "+reakcijaNaPoruku.getEmoji()+" from "+ reakcijaNaPoruku.getKorisnikKojiJeReagovao().getPunoIme() );}




    }


}


