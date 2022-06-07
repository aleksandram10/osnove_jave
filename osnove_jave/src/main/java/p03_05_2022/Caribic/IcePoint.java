package p03_05_2022.Caribic;

public class IcePoint extends Proizvod {
    //Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
    // tip sladoleda (vanila, cokolada)
    // atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
    // override uje metodu koja ukupnu cenu racuna:
    //ako je mali ice point na cenu svih dodataka doda 100
    //ako je veliki ice point cenu svih dodataka doda 130
    //override uje metodu stampaj da stampa sve podatke


    private String tipSladoleda;
    private boolean maliIliVeliki;

    public IcePoint(String tipSladoleda, boolean maliIliVeliki) {
        this.tipSladoleda = tipSladoleda;
        this.maliIliVeliki = maliIliVeliki;
    }

    public String getTipSladoleda() {
        return tipSladoleda;
    }

    public void setTipSladoleda(String tipSladoleda) {
        this.tipSladoleda = tipSladoleda;
    }

    public boolean isMaliIliVeliki() {
        return maliIliVeliki;
    }

    public void setMaliIliVeliki(boolean maliIliVeliki) {
        this.maliIliVeliki = maliIliVeliki;
    }

    @Override
    public double racunajCenu() {

        if (maliIliVeliki == true) {
            return cenaSvihDodatakaProizvoda() + 100;
        } else {
            return cenaSvihDodatakaProizvoda() + 130;
        }
    }

    @Override
    public void print() {
        System.out.println("Sastojci sladoleda su: ");
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.print(sastojci.get(i).getNazivDodatka());
            System.out.println(" "+sastojci.get(i).getCenaDodatka());
        }
        if (maliIliVeliki == true) {
            System.out.println("Izabran je veliki kornet");
        } else {
            System.out.println("Izabran je mali kornet.");
        }
        System.out.println("Cena sladoleda je " + racunajCenu());
        System.out.println("Cena svih dodataka je " + cenaSvihDodatakaProizvoda());
    }

}
