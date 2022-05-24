package d19_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    public void stampaj() {
        System.out.println("{{ " + this.naziv + " }} " + "{{" + this.cena + "}}" + " {{ " + this.tezina + " }}");
    }

    //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
    // Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.

    public double povecajCenu(double zaKolikoPovecati) {
        return this.cena = this.cena + zaKolikoPovecati;
    }

    //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
    //a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
    //Smatrati da je parametar popust u opsegu od 0 do 100.

    public double vratiCenuSaPopustom(double popust) {
        return this.cena = this.cena-(this.cena * popust) / 100;
    }

    //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
    // Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
    //za tezinu do 100g, postarina iznosi 200din
    //za tezinu od 101g do 500g, postarina iznosi 400din
    //za tezinu preko 500g, postarina iznosi 1000din

    public double racunajPostarinu(){
        double postarina=0;
        if(this.tezina<=100){ postarina=200;}
        else if(this.tezina<=500){postarina=400;}
        else if(this.tezina>500){postarina=1000;}
        return postarina;
    }




}
