import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    List<Laiteosa> osat = new ArrayList<Laiteosa>();
    double omaHinta;
    private double hinta;

    public Emolevy(double hinta){
        this.hinta = hinta;
        omaHinta = hinta;
    }

    public void lisääOsa(Laiteosa osa, double hinta){
        osat.add(osa);
        this.hinta += hinta;
    }

    @Override
    public double hinta() {
        
        return hinta;
    }

    @Override
    public void tulosta() {
        System.out.println("Emolevyn hinta: "+omaHinta );
        System.out.println("Emolevyn osat:");
        osat.forEach(Laiteosa::tulosta);
        System.out.println("Emolevyn kokonaishinta osineen: " +hinta);
        
    }
    
}
