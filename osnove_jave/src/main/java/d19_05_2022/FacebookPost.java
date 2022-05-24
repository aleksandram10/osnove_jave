package d19_05_2022;

public class FacebookPost {
    //3.(ZA VEZBANJE) Kreirati klasu FacebookPost koja ima:
    //   Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja

    public String koJeObjavioPost;
    public String kodKogaJeObjavljenPost;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

  //  Od metoda:
    //like(), koja povecava broj lajkova za 1.
    //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //share(), koja povecava broj deljenja za 1


    public int like(){
        return this.brojLajkova=this.brojLajkova+1;
    }

    public int dislike(){
        this.brojLajkova=this.brojLajkova-1;
        if(this.brojLajkova<0){this.brojLajkova=0;}
return this.brojLajkova;
    }

    public int share(){
        return this.brojDeljenja=this.brojDeljenja+1;
    }

    //print(), koja stampa objavu u formatu:
    //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //(tekst objave)
    //Likes (broj lajkova) | Shares (broj deljenja)

    public void print(){
        System.out.println(this.koJeObjavioPost+" >>> "+this.kodKogaJeObjavljenPost);
        System.out.println(this.tekstObjave);
        System.out.println("Likes "+this.brojLajkova+" | Shares "+this.brojDeljenja);
    }


}
