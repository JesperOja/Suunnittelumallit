package Prototype;

public class Kloonaus {
    public static void main(String[] args){
        kello k = new kello(3, 30);
        k.getTime();

        kello k2 = (kello)k.clone();

        k2.getTime();

        k2.getIso().setPaikka(6);
        k2.getPikku().setPaikka(12);

        k.getTime();
        k2.getTime();

        k.getIso().setPaikka(1);
        k.getPikku().setPaikka(55);

        k.getTime();
        k2.getTime();
    }
}
