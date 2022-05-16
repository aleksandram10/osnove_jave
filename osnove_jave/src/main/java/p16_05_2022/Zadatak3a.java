package p16_05_2022;

public class Zadatak3a {

    public static void main(String[] args) {
    star(8);
    }


    static void star(int broj) {

        for (int i = broj; i >= 0; i--) {
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


