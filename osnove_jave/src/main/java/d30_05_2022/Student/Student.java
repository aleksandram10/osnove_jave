package d30_05_2022.Student;

import java.util.ArrayList;

public class Student {
    //Napisati klasu Student koja ima
    //broj indeksa
    //ime i prezime
    //tip studija (osnovne, master, doktorske)
    //niz ispita
    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za indeks, ime i prezime, tip studija
    //getter za niz predmeta

    private String brojIndeksa;
    private String punoImeStudenta;
    private String tipStudija;

    private ArrayList<Ispit> ispiti=new ArrayList<>();

    public Student(String brojIndeksa, String punoImeStudenta, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.punoImeStudenta = punoImeStudenta;
        this.tipStudija = tipStudija;
    }

    public Student() {
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

//metodu dodaj ispit u niz ispita

    public void dodajIspit(Ispit ispit){
        ispiti.add(ispit);
    }

    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    public double prosecnaOcena(){
        double suma=0;
        int broj=0;
        for(int i=0;i<ispiti.size();i++){
            if(ispiti.get(i).ispitPolozen()==true){
                suma=suma+ispiti.get(i).getOcena();
                broj=broj+1;
            }
        }
        return suma/broj;
    }



    //metodu stampaj koja stampa u formatu:
    //(broj indeksa) - (ime i prezime) - (tip studija)
    //Predmeti:
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //Prosecna ocena: (prosecna ocena)
    public void print(){
        System.out.println(this.brojIndeksa+" - "+this.punoImeStudenta+" - "+this.tipStudija);
        for(int i=0;i<ispiti.size();i++){
            ispiti.get(i).print();
        }
        System.out.println("Prosecna ocena je "+prosecnaOcena());
    }

}
