package p30_05_2022.FacebookPost;

import java.util.ArrayList;

public class FacebookPost {

//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija

    private String koJeStavioOglas;
    private String tekstObjave;

    private ArrayList<Reakcije> reakcije=new ArrayList<>();

    public FacebookPost() {
    }

    public FacebookPost(String koJeStavioOglas, String tekstObjave, ArrayList<Reakcije> reakcije) {
        this.koJeStavioOglas = koJeStavioOglas;
        this.tekstObjave = tekstObjave;
        this.reakcije = reakcije;
    }

    public String getKoJeStavioOglas() {
        return koJeStavioOglas;
    }

    public void setKoJeStavioOglas(String koJeStavioOglas) {
        this.koJeStavioOglas = koJeStavioOglas;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public ArrayList<Reakcije> getReakcije() {
        return reakcije;
    }

    public void setReakcije(ArrayList<Reakcije> reakcije) {
        this.reakcije = reakcije;
    }

    //metodu reaguj, koja dodaje reakciju u niz

    public void reaguj(Reakcije novaReakcija){
        reakcije.add(novaReakcija);
    }



//(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post
// (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.

    public void modifikacijaReaguj(Reakcije novaReakcija){
        for(int i=0;i<reakcije.size();i++){
        if(novaReakcija.getPunoImeKorisnika().equals(reakcije.get(i).getPunoImeKorisnika())){
            //if(novaReakcija.getTipReakcije().equals(reakcije.get(i).getTipReakcije())){
                reakcije.remove(i);
            }
            reakcije.add(novaReakcija);
            }


        }






//privatnu metodu koja vraca broj reakcija odredjenog tipa
// (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)

    private int brojReakcijaOdredjenogTipa(String novaReakcija){
       int brojReakcija=0;
        for (int i=0;i<reakcije.size();i++){
           if(novaReakcija.equals(reakcije.get(i).getTipReakcije())){
               brojReakcija=brojReakcija+1;
           }
       }
        return brojReakcija;
    }


//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2

    public void print(){
        System.out.println(this.koJeStavioOglas);
        System.out.println(this.tekstObjave);
        System.out.println("Smajli "+this.brojReakcijaOdredjenogTipa("smajli")+"| Like " +this.brojReakcijaOdredjenogTipa("like")+" | Srce"+this.brojReakcijaOdredjenogTipa("srce"));
    }


}
