package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus viiniOpettaja = new ViiniOpettaja();
        AterioivaOtus kaljaOpettaja = new KaljaOpettaja();
        opettaja.aterioi();
        viiniOpettaja.aterioi();
        kaljaOpettaja.aterioi();
    }
}
