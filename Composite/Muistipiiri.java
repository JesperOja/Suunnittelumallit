public class Muistipiiri implements Laiteosa {

    private double hinta;
    
    public Muistipiiri(double hinta){
        this.hinta = hinta;
    }
    @Override
    public double hinta() {
        return hinta;
    }
    @Override
    public void lisääOsa(Laiteosa osa, double hinta) {
        
    }
    @Override
    public void tulosta() {
        System.out.println("Muistipiirin hinta: " +hinta());
        
    }
    
}
