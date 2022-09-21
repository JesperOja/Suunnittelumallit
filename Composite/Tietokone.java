import java.util.ArrayList;
import java.util.List;

public class Tietokone implements Laiteosa{
    double kokonaishinta;
    List<Laiteosa> osat = new ArrayList<Laiteosa>();

    public void lisääOsa(Laiteosa osa, double hinta){
        osat.add(osa);
        this.kokonaishinta += hinta;
    }
    
    @Override
    public double hinta() {
       
        return kokonaishinta;
    }
    
    public void tulostaOsat(){
        
    }

    @Override
    public void tulosta() {
        System.out.println("Tietokone sisältää seuraavia osia: ");
        osat.forEach(Laiteosa::tulosta);
        System.out.println("Tietokoneen kokonaishinta osineen: " +hinta());
        
    }
}
