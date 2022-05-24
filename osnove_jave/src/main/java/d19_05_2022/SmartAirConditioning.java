package d19_05_2022;

public class SmartAirConditioning {
    //(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
    //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)

    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int temperatura;
    public String mod;

    //metodu za stampu - stampa u formatu
    //marka - mod - termperatura
    public void print(){
        System.out.println(this.marka+" - "+this.mod+" - "+this.temperatura);
    }


    //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)

    public double mesecnaPotrosnja(){
        if((this.mod).equals("greje")){
            return 30 * 15 * potrosnjaDokGreje;
        }else if(this.mod.equals("hladi")){
            return 30 * 15 * potrosnjaDokHladi;
        }return 0;
    }


    //metodu koja racuna koliko klima novca potrosi za mesec dana
    //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
    //Metoda vraca ukupnu cenu za taj mesec

    public double potrosnjaZaMesecDana(){
        if ( this.mesecnaPotrosnja()<=350){return 6*this.mesecnaPotrosnja();}
        else return 6*this.mesecnaPotrosnja();

    }



}
