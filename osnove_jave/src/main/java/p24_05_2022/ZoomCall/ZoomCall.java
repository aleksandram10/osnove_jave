package p24_05_2022.ZoomCall;

public class ZoomCall {
    ////	Kreirati klasu ZoomCall koja ima:
    ////link za poziv
    ////password
    ////korisnika koji je host
    ////korisnika koji je guest

    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    ////gettere za sve atribute
    ////setter samo za guest-a


    public ZoomCall(String linkZaPoziv,String password, Korisnik host){
        this.linkZaPoziv=linkZaPoziv;
        this.password=password;
        this.host=host;
    }


    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }


    ////metodu pokreni poziv koja stampa podatke u formatu:
    ////		Zoom Call: url
    ////		Password: password
    ////		Host: ime i prezime
    ////		Guest: ime i prezime
    ////		Maksimalno trajanje poziva je (broj minuta)min
    ////
    ////		Maksimalno trajanje poziva se cita od korisnika koji je host!


    public void print(){
        System.out.println("Zoom Call: "+this.linkZaPoziv);
        System.out.println("Password: "+this.password);
        System.out.println("Host: "+this.host.getPunoIme());//LAKSE JE OVAKO NEGO this.getHost().getPunoIme();
        System.out.println("Guest: "+this.guest.getPunoIme());//isto !!!
        System.out.println("Maksimalno trajanje poziva je "+ getHost().maksimalnaDuzinaVideoPoziva()+" min");
    }


}
