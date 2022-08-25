package FactoryMethod;

public class Opettaja extends AterioivaOtus {

    @Override
    protected Juoma createJuoma(){
        return new Vesi();
    };

}
