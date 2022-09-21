public class Kokoa {
    public static void main(String[] args){
        Laiteosa tietokone = new Tietokone();

        Laiteosa emolevy = new Emolevy(200);
        Laiteosa muisti = new Muistipiiri(100);
        emolevy.lisääOsa(muisti,muisti.hinta());

        Laiteosa näyttis = new Näytönohjain(1400);
        emolevy.lisääOsa(näyttis, näyttis.hinta());

        Laiteosa prosessori = new Prosessori(652);
        emolevy.lisääOsa(prosessori, prosessori.hinta());

        Laiteosa verkkokortti = new Verkkokortti(62);
        
        Laiteosa kotelo = new Kotelo(100);
        kotelo.lisääOsa(verkkokortti, verkkokortti.hinta());
        kotelo.lisääOsa(emolevy, emolevy.hinta());

        tietokone.lisääOsa(kotelo, kotelo.hinta());
        tietokone.tulosta();


    }
}
