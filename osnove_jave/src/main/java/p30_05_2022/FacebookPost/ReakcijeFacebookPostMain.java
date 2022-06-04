package p30_05_2022.FacebookPost;

public class ReakcijeFacebookPostMain {
    public static void main(String[] args) {
        //Kreirati klasu Reakcija koja ima
        //tip reakcije (smajli, like, srce)
        //ime i prezime korisnika koji je reagovao
        //gettere, settere i konstruktore
        //
        //Kreirati klasu FacebookPost koja ima:
        //ime i prezime korisnika koji je stavio oglas
        //tekst objave
        //niz reakcija
        //metodu reaguj, koja dodaje reakciju u niz
        //(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
        //Primer: Milan - lajkuje
        //	 Nemanja - lajkuje
        //	 Milan - daje srce
        //Post ima lajk od Nemanje i srce od Milana.
        //privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
        //metodu stampaj koja stampa podatke u formatu:
        //ime i prezime
        //tekst objave
        //Smajli 10 | Like 15 | Srce 2

        Reakcije prva = new Reakcije("smajli", "Aleksandra Markovic");
        Reakcije druga = new Reakcije("like", "Marko Markovic");
        Reakcije treca = new Reakcije("srce", "Aleksandra Markovic");


        FacebookPost post1 = new FacebookPost();
        post1.setKoJeStavioOglas("Gaga");
        post1.setTekstObjave("bla");
        post1.reaguj(prva);
        post1.reaguj(druga);
        post1.reaguj(treca);

        //post1.print();
       Reakcije novaReakcija = new Reakcije("like", "Aleksandra Markovic");
       // post1.modifikacijaReaguj(novaReakcija);

       // System.out.println(post1);


        post1.modifikacijaReaguj(novaReakcija);

        post1.print();






    }
}
