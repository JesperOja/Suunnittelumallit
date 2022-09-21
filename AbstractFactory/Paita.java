public class Paita {

    String merkki = "";
    public Paita(String merkki) {
        this.merkki = merkki;
    }
    
    public void kerroMinusta(){
        System.out.println("Minulla on todella hieno " + merkki + " paita");
    }
}
