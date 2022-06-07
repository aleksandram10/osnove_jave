package p03_05_2022.Atleticar;

public class Main {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("Skok u dalj", "skakaci");
        Disciplina sprint = new Disciplina("110m s preponama", "trakaci");

        skok.dodajAtleticara(new Skakac("Marko Markovic", 9));
        skok.dodajAtleticara(new Skakac("Darko Darkovic", 7));
        skok.dodajAtleticara(new Skakac("Zarko Zarkovic", 6));

        skok.diskvalifikuj("Marko Markovic");

        skok.stampajPobednika();


        sprint.dodajAtleticara(new Trkac("Nikola Nikolic", 10));
        sprint.dodajAtleticara(new Trkac("Usain Bolt", 9));
        sprint.dodajAtleticara(new Trkac("Dragan Jankovic", 7));
        sprint.diskvalifikuj("Dragan Jankovic");
        sprint.stampajPobednika();


//		String a = "09i340934";
//		String b = "klsdlkew09";
//		a.equals(b);
//
//		public boolean equals(String b)

    }
}
