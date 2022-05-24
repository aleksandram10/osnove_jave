package d20_05_2022;

public class FacebookPost {

    public String koJeObjavioPost;
    public String kodKogaJeObjavljenPost;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public FacebookPost() {
    }

    public FacebookPost(String koJeObjavioPost, String kodKogaJeObjavljenPost, String tekstObjave) {
        this.koJeObjavioPost = koJeObjavioPost;
        this.kodKogaJeObjavljenPost = kodKogaJeObjavljenPost;
        this.tekstObjave = tekstObjave;
    }

    public int like() {
        return this.brojLajkova = this.brojLajkova + 1;
    }

    public int dislike() {
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova < 0) {
            this.brojLajkova = 0;
        }
        return this.brojLajkova;
    }

    public int share() {
        return this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println(this.koJeObjavioPost + " >>> " + this.kodKogaJeObjavljenPost);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);

    }


}
