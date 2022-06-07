package p03_05_2022.Caribic;

public class Pica extends Proizvod{
    //Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
    // cena podloge
    // override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
    //override uje metodu stampaj da stampa sve podatke

    private double cenaPodloge;

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public double getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double racunajCenu(){
        return cenaSvihDodatakaProizvoda()+this.cenaPodloge;
    }
    @Override
    public  void print(){
        System.out.println("Sastojci pice su: ");
        for (int i=0;i< sastojci.size();i++){
            System.out.println(sastojci.get(i).getNazivDodatka()+" "+sastojci.get(i).getCenaDodatka());
        }
        System.out.println("Cena podloge je"+this.cenaPodloge);
        System.out.println("Cena sladoleda je "+racunajCenu());
        System.out.println("Cena svih dodataka je "+cenaSvihDodatakaProizvoda());
    }
    }







    //U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

