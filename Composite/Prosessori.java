public class Prosessori implements Laiteosa {

    double hinta;

    public Prosessori(double hinta){
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
        System.out.println("Prosessorin hinta:" +hinta());
        
    }
    
}
