public class Vaatteet {

    String merkki = "";

    public Vaatteet(String merkki){
        this.merkki = merkki;
        createVaatteet(merkki);
    }

    

    private void createVaatteet(String merkki){
        Paita paitaMerkki = new Paita(merkki);
        Kengät kenkäMerkki = new Kengät(merkki);
        Lippis lippiMerkki = new Lippis(merkki);
        Housut housuMerkki = new Housut(merkki);
        
        paitaMerkki.kerroMinusta();
        kenkäMerkki.kerroMinusta();
        lippiMerkki.kerroMinusta();
        housuMerkki.kerroMinusta();
        System.out.println("");
    }



}
