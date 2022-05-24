package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        //1.Kreirati klasu FacebookPost koja ima:
        //   Od atributa:
        //ime i prezime korisnika koji je objavio post
        //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
        //tekst objave
        //broj lajkova
        //broj deljenja
        // Konstruktore:
        //difoltni konstuktor
        //konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
        //  Od metoda:
        //like(), koja povecava broj lajkova za 1.
        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
        //share(), koja povecava broj deljenja za 1
        //print(), koja stampa objavu u formatu:
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //
        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        //
        //
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        FacebookPost prvi=new FacebookPost("Aleksandra Markovic","Marko Markovic","Danas je lep dan.");
        prvi.brojLajkova=21;
        prvi.brojDeljenja=2;
        FacebookPost drugi=new FacebookPost("Marko Markovic","Aleksandra Markovic","Jeste.");
        drugi.brojLajkova=3;
        drugi.brojDeljenja=0;

        prvi.print();
        drugi.print();

        prvi.like();
        prvi.like();
        prvi.like();
        prvi.dislike();
        prvi.share();
        drugi.share();
        drugi.like();
        drugi.dislike();
        drugi.dislike();

        System.out.println(" ");
        prvi.print();
        drugi.print();


    }
}
