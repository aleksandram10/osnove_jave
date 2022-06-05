package d31_05_2022.Zadatak1;

import d31_05_2022.Zadatak1.Osoba;

public class Trener extends Osoba {
    //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
    //godine iskustva
    //tip trenera (kondicioni, za igru, pomocni, personalni)
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

    private int godIskustva;
    private String tipTrenera;



    public Trener(String punoIme, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(punoIme, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void print(){
        System.out.println("Trener: ");
        super.print();
        System.out.println("Tip trenera je "+tipTrenera);
        System.out.println("Godine iskustva:  "+godIskustva);}




}
