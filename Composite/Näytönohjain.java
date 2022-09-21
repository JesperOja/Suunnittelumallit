public class Näytönohjain implements Laiteosa{

    double hinta;

    public Näytönohjain(double hinta){
        this.hinta = hinta;
    }

    @Override
    public double hinta() {
        
        return hinta;
    }

    @Override
    public void lisääOsa(Laiteosa osa, double hinta) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tulosta() {
        System.out.println("Näytönohjaimen hinta:" +hinta());
        
    }
    
}
