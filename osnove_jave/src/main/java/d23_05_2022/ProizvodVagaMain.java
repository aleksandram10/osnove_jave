package d23_05_2022;

public class ProizvodVagaMain {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod("ab123", "jagode", 200);
        Proizvod proizvod2 = new Proizvod("ab456", "tresnje", 150);

        proizvod1.print();
        proizvod2.print();


        Vaga vaga1 = new Vaga();
        Vaga vaga2 = new Vaga();
        vaga1.setMernaJedinica("kg");
        vaga2.setMernaJedinica("lb");
        vaga1.setProizvod(proizvod1);
        vaga2.setProizvod(proizvod2);

        vaga1.stampaj(3);
        vaga2.stampaj(4);

    }
}
