import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa{
    List<Laiteosa> osat = new ArrayList<Laiteosa>();
    private double hinta;
    double omaHinta;

    public Kotelo(double hinta){
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
        System.out.println("Kotelon hinta: " +omaHinta);
        System.out.println("Kotelon osat:");
        osat.forEach(Laiteosa::tulosta);
        System.out.println("Kotelon kokonaishinta osineen: " +hinta);
    }
}
