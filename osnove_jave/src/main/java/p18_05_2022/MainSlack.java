package p18_05_2022;

public class MainSlack {
//Krairti klasu SlackMessage koja ima:
//tekst poruke
//ime i prezime osobe koja je stavila poruku
//datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

    public static void main(String[] args) {

        SlackMessage prva=new SlackMessage();

        prva.tekst="Danas je bio test iz jave";
        prva.imeIprezime="Aleksandra Markovic";
        prva.datumIvreme="18.05.2022. 21:49";

        System.out.println(prva.imeIprezime+" - "+prva.datumIvreme);
        System.out.println(prva.tekst);

        SlackMessage druga=new SlackMessage();
        druga.tekst="Odlicno smo uradili!";
        druga.imeIprezime="Marko Markovic";
        druga.datumIvreme="18.05.2022. 21:51";

        System.out.println(druga.imeIprezime+" - "+druga.datumIvreme);
        System.out.println(druga.tekst);


    }


}
