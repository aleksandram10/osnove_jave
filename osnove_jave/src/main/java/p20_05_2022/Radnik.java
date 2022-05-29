package p20_05_2022;

public class Radnik {
    //Zad Kreirati klasu Radnik koja ima:
    //jmbg radnika
    //ime i prezime
    //broj dece (1,2,3,... ili 0 ako nema dece)
    //stepen strucne spreme (od 1 do 8)
    //godine radnog staza

    public String jmbg;
    public String punoIme;
    public int brojDece;
    public String stepenStrucneSpreme;
    public double godineStaza;


    //konstuktor koji postavlja samo jmbg

    public Radnik(String jmbg){
        this.jmbg=jmbg;
    }

    //konstuktor koji postavlja sve atribute

    public Radnik(String jmbg,String punoIme,int brojDece,String stepenStrucneSpreme,double godineStaza){
        this.jmbg=jmbg;
        this.punoIme=punoIme;
        this.brojDece=brojDece;
        this.stepenStrucneSpreme=stepenStrucneSpreme;
        this.godineStaza=godineStaza;
    }
    //metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
    //Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
    //- do 10 godina 0.05
    //- od 10-20 godina 0.075
    //- preko 20 godina 0.1

    public double minuliRad(){
        if(this.godineStaza<=10){return 0.05;}
        else if(this.godineStaza>10&&this.godineStaza<=20){return 0.075;}
        else{return 0.1;}
    }


    //metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
    //Koeficijent slozenosti
    //- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
    //- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
    //- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
    //- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
    //- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
    //- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
    //- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
    //- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

    public double koeficijentSlozenosti(){
        if(this.stepenStrucneSpreme.equals("I")){return 1.03;}
        else  if(this.stepenStrucneSpreme.equals("II")){return 1.65;}
        else  if(this.stepenStrucneSpreme.equals("III")){return 2.00;}
        else  if(this.stepenStrucneSpreme.equals("IV")){return 2.27;}
        else  if(this.stepenStrucneSpreme.equals("V")){return 2.88;}
        else  if(this.stepenStrucneSpreme.equals("VI")){return 3.09;}
        else  if(this.stepenStrucneSpreme.equals("VII")){return 3.40;}
        else  if(this.stepenStrucneSpreme.equals("VIII")){return 4.12;}
        else return 0;

    }

    //metodu koja racuna platu radnika, plata se racuna po formuli:
    //25000 + (koeficijent slozenosti + minuli rad) * 10000

    public double plataRadnika(){
        return 25000+(koeficijentSlozenosti()+minuliRad())*10000;
    }

    //metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

    public boolean daLiJeKreditnoSposoban(){
        return this.plataRadnika()>50000;
    }


    //metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.
    // Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2 dana

    public int brojSlobodnihDana(){
        return 22+this.brojDece*2;
    }

    }



