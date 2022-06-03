package p24_05_2022.FizickoLice;

public class Ugovor {
    ////	Kreirati klasu Ugovor koja ima:
    //        //godinu, dan i mesec sklapanja ugovora
    //        //osobu koja prodaje nekretninu (fizicko lice)
    //        //osobu koja kupuje nekretninu (fizicko lice)
    //        //cenu za koju se prodaje nekretnina
    //        //adresu nekretnine (ulica br., grad)

    private String kadJeSklopljenUgovor;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresa;



    public Ugovor(String kadJeSklopljenUgovor, FizickoLice prodavac, FizickoLice kupac,double cena,String adresa){
        this.kadJeSklopljenUgovor=kadJeSklopljenUgovor;
        this.cena=cena;
        this.adresa=adresa;

    }

    public String getKadJeSklopljenUgovor() {
        return kadJeSklopljenUgovor;
    }

    public void setKadJeSklopljenUgovor(String kadJeSklopljenUgovor) {
        this.kadJeSklopljenUgovor = kadJeSklopljenUgovor;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
//        //metodu koja vraca procenat zarade
    //        //za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03

    public double procenatZarade(){
        if(this.kupac.isDaLiJePrethodnoKupovao()){return 0.02;}
        else {return 0.03;}

    }


   //metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije,
    // prema formuli:
    //1000 + cena za koju se prodaje * procenat zarade

 public double zaradaAgencije(){
        return 1000+this.cena*procenatZarade();
 }



    //        //metodu koja stampa ugovor u formatu:
    //        //Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini
    //        // nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati
    //        // novcanu vrednost u iznosu od (zarada agencije)


    public void stampaj(){
        System.out.print("Dana "+this.kadJeSklopljenUgovor+"god. je sklopljen ugovor izmedju ");
        this.kupac.stampaj();
        System.out.print(" i ");
        this.prodavac.stampaj();
        System.out.print(" o kupovini nekretnine "+this.adresa+" po ceni "+this.cena+
                " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost od "+ zaradaAgencije());


    }
}
