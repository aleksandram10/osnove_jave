package p30_05_2022.Pasta;

import java.util.ArrayList;

public class Pasta {

    //	Kreirati klasu Pasta koja ima:
    //niz sastojaka
    //metodu za dodavanje sastojka



    private ArrayList<Sastojak> sastojci= new ArrayList<>();

    public void dodajSastojak(Sastojak noviSastojak){
            sastojci.add(noviSastojak);
        }

    public Pasta() {
    }

    //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka

    public double cenaPaste(){
        double suma=0;
        for(int i=0;i<sastojci.size();i++){
            suma=suma+sastojci.get(i).getCena();
        }
        return suma;
        }

    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din

    public void print(){
        for (int i=0;i< sastojci.size();i++){
            sastojci.get(i).print();
        }
        System.out.println("Cena paste je "+cenaPaste());
    }

    //(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
    //defaultni konstruktor


//    public void brisiSastojak(Sastojak noviSastojak){
//        for (int i=0;i<sastojci.size();i++){
//            if(noviSastojak.getNaziv().equals(sastojci.get(i).getNaziv()))
//            {
//                sastojci.remove(i);
//            }
//        }
//    }

       public void brisiSastojak(String noviSastojak){
        for (int i=0;i<sastojci.size();i++){
         if(noviSastojak.equals(sastojci.get(i).getNaziv()))
            {sastojci.remove(i);}
        }
    }







}