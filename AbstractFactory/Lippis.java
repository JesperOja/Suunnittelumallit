public class Lippis {

    String merkki = "";
    public Lippis(String merkki) {
        this.merkki = merkki;
    }
    
    public void kerroMinusta(){
        System.out.println("Minulla on " + merkki + " lippis.");
    }
}
