package FactoryMethod;
public class KaljaOpettaja extends AterioivaOtus{

    @Override
    protected Juoma createJuoma(){
        return new Kalja();
    }
}
