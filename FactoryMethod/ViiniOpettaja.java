package FactoryMethod;

public class ViiniOpettaja extends AterioivaOtus {

    @Override
    protected Juoma createJuoma(){
        return new Viini();
    };

}