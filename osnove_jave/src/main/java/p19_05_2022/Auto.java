package p19_05_2022;

public class Auto {

    public String imeIprezime;
    public String marka;
    public int brVrata;
    public double potrosnja;
    public double brzina;

    public int brojRegistracije;

    public boolean klimaOnOff;

    public int godinaProizvodnje;
    public int mesecDoKadJeRegistrovan;
    public int kubikaza;
    public double kapacitetRezervoara;

    public double trenutnaKolGoruRezervoaru;

    public void print() {       //(int mesec) {ovo treba ovde da bude da bi radilo sa da li je istekla registracija

        System.out.println(this.imeIprezime);
        System.out.println(this.marka + " - " + this.brVrata + " -ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(this.brzina + " km/h je trenutna brzina");
        // System.out.println("Da li je istekla registracija?"+this.daLiJeIsteklaRegistracija(mesec));
        System.out.println("Da li je oldtimer? " + this.oldtimer());
        System.out.println("Cena registracije je" + this.cenaRegistracije());
    }


    // //metoda koja vraca informaciju da li je vozac prekoracio brzinu.
    //        // Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false ako je
    //        // trenutna brzina veca od ogranicenja.

    public boolean prekoracenje(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    //metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
    //        // Metoda od parametara prima ogranicenje brzine

    public double kazna(double ogranicenje) {
        double jedinica = this.brzina - ogranicenje;//100-68=32
        if (jedinica > 0) {  //if(brzina>ogranicenje)
            return jedinica * 1000;
        } else {
            return 0;
        }
    }

    //metodu dodajGas, koja povecava trenutnu brzinu za 10.

    public void dodajGas() {
        this.brzina = this.brzina + 10;
    }

    //metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.

    public void koci() {
        this.brzina = this.brzina - 10;
        if (this.brzina < 0) {
            this.brzina = 0;
        }
    }

    ////metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
    //faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
    //(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

    public double potrosnjaAuta() {
        double faktor = 1.0;
        if (klimaOnOff) {
            faktor = 1.2;
        }
        potrosnja = (this.brzina / 100.0 * this.potrosnja) * faktor;
        return potrosnja;
    }

    //metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.

    public boolean oldtimer() {
        if (this.godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    //metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec
// i na osnovu toga vraca true ili false.


    public boolean daLiJeIsteklaRegistracija(int trenutniMesec) {
        if (this.mesecDoKadJeRegistrovan <= trenutniMesec) {
            return true;
        } else {
            return false;
        }

    }

    //metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije
// kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

    public double cenaRegistracije() {
        double cena = 0;
        if (this.kubikaza <= 2000) {
            cena = this.kubikaza * 100;
        } else {
            cena = (this.kubikaza * 100) + (this.kubikaza * 30 / 100);
        }
        return cena;
    }

//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
// Litar goriva je 170din. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.

    public double natociGorivo(double kolikoSeToci) {
        double cenaGoriva;
        if (kolikoSeToci + this.trenutnaKolGoruRezervoaru >= this.kapacitetRezervoara) {

           // this.trenutnaKolGoruRezervoaru = this.kapacitetRezervoara;
            return cenaGoriva = (this.kapacitetRezervoara - this.trenutnaKolGoruRezervoaru) * 170;
        } else {
            //this.trenutnaKolGoruRezervoaru = this.trenutnaKolGoruRezervoaru + kolikoSeToci;
            return cenaGoriva = kolikoSeToci * 170;
        }




    }

////metodu koja vraca da li auto nad kojim je pozvana metoda ide istom brzinom kao i auto sa kojim se poredi.
//// Ova metoda poredi brzinu sa drugim autom, i parametar metode treba da bude tipa Auto.
////HINT: Ova metoda treba da se ponasa kao metoda equals za stringove. Zovemo metodu nad jednim stringom i
//// poredimo ga sa drugim, tako i ovde zovemo metodu nad jednim autom i poredimo ga sa drugim
//// (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)

    public boolean daLiIduIstomBrzinom(Auto noviAuto){
        if(this.brzina> noviAuto.brzina){
            return true;
        }else{
            return false;
        }


    }




}


