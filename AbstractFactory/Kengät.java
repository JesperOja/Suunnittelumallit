public class Kengät {

    String merkki = "";
    public Kengät(String merkki) {
        this.merkki = merkki;
    }
    
    public void kerroMinusta(){
        System.out.println("Nämä kengät ovat " + merkki + " merkkiset");
    }
}
