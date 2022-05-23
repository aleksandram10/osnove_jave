package p19_05_2022;

public class Zadatak1 {
    //Kreirati klasu Auto koja ima:
    //ime i prezime vozaca
    //marku automobila
    //broj vrata
    //potrosnju na 100km (npr: 10)
    //trenutnu brzinu kojom se auto krece
    //metodu za stampu koja stampa podatke u formatu:
    //[Vozac]
    //	[Marka] - [br vrata]-ro vrata
    //	Sa potrosnjom od [potrosnja] l na 100km
    //	[Trenutna brzina auta] km/h je trenutna brzina.
    //
    //	Primer:
    //	Milan Jovanovic
    //	BMW - 5-ro vrata
    //	Sa potrosnjom od 10 l na 100km
    //	200 km/h je trenutna brzina

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.imeIprezime = "Aleksandra Markovic";
        auto1.marka = "BMW";
        auto1.brVrata = 5;
        auto1.brzina = 100;
        auto1.potrosnja = 10;

        auto1.print();

        Auto auto2 = new Auto();
        auto2.imeIprezime = "Marko Markovic";
        auto2.marka = "BMW";
        auto2.brVrata = 5;
        auto2.brzina = 30;
        auto2.potrosnja = 13;

        auto2.print();
        //(Dopuna 2)
        //U okviru klase Auto, implementirati jos 2 metode:
        //metoda koja vraca informaciju da li je vozac prekoracio brzinu.
        // Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false ako je
        // trenutna brzina veca od ogranicenja.
        //metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
        // Metoda od parametara prima ogranicenje brzine
        //U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

        System.out.println("");
        if (auto1.prekoracenje(80)) {
            System.out.println("Brzina je veca od ogranicenja");
        } else {
            System.out.println("Nije prekoracio brzinu.");
        }

        double x = auto1.kazna(68);
        System.out.println("Kazna je " + x);

        //Dopuniti klasu Auto tako da ima:
        //atribut broj registracije
        //da li je ukljucena klima u autu
        //metodu dodajGas, koja povecava trenutnu brzinu za 10.
        //metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
        //metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
        //faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
        //(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
        System.out.println("");
        auto1.klimaOnOff = true;
        auto2.klimaOnOff = false;

        auto1.dodajGas();
        auto2.koci();
        auto2.koci();
        auto2.koci();
        auto2.koci();


        System.out.println("Potrosnja automobila 1 je " + auto1.potrosnjaAuta());
        System.out.println("Potrosnja automobila 2 je " + auto2.potrosnjaAuta());

        //Dopuniti klasu Auto tako da ima:
        //atribut godinu proizvodnje
        // aatribut mesec do kad je registrovan auto (int)
        //atribut kubikaza auta (npr: 1600 - 5000)
        //metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
        //metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec
        // i na osnovu toga vraca true ili false.
        //metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije
        // kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.


        auto1.godinaProizvodnje = 1988;
        auto2.godinaProizvodnje = 1920;
        auto1.mesecDoKadJeRegistrovan = 3;
        auto2.mesecDoKadJeRegistrovan = 12;

        auto1.print();
        auto2.print();

        auto1.oldtimer();
        auto2.oldtimer();


        auto1.print();
        auto2.print();

        auto1.cenaRegistracije();
        auto2.cenaRegistracije();

        auto1.daLiJeIsteklaRegistracija(6);
        auto2.daLiJeIsteklaRegistracija(4);
        System.out.println("Da li je istekla registracija?" + auto1.daLiJeIsteklaRegistracija(6));
        System.out.println("Da li je istekla registracija?" + auto2.daLiJeIsteklaRegistracija(4));


        auto1.print();
        auto2.print();
//(Dopuna 5)
//Dopuniti klasu Auto tako da ima:
//kapacitet rezervoara
//trenutnu kolicinu goriva u rezervoaru (u litrima)
//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
// Litar goriva je 170din. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.


        auto1.kapacitetRezervoara = 80;
        auto2.kapacitetRezervoara = 100;
        auto1.trenutnaKolGoruRezervoaru = 50;
        auto2.trenutnaKolGoruRezervoaru = 90;

        System.out.println(auto1.natociGorivo(34));
        System.out.println(auto2.natociGorivo(20));

      System.out.println(auto1.trenutnaKolGoruRezervoaru);
        System.out.println(auto2.trenutnaKolGoruRezervoaru);


//Dopuniti klasu Auto, tako da ima
//metodu koja vraca da li auto nad kojim je pozvana metoda ide istom brzinom kao i auto sa kojim se poredi.
// Ova metoda poredi brzinu sa drugim autom, i parametar metode treba da bude tipa Auto.
//HINT: Ova metoda treba da se ponasa kao metoda equals za stringove. Zovemo metodu nad jednim stringom i
// poredimo ga sa drugim, tako i ovde zovemo metodu nad jednim autom i poredimo ga sa drugim
// (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)


        System.out.println(auto1.daLiIduIstomBrzinom(auto2));
    }


}



