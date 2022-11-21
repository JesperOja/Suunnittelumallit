package Prototype;

public class pikkuViisari implements Cloneable{
    private int paikka = 0;

    public pikkuViisari(int paikka){
        this.paikka = paikka;
    }

    public void setPaikka(int paikka){
        this.paikka = paikka;
    }

    public int getPaikka(){
        return paikka;
    }

    public Object clone(){
        try {
            return super.clone();
            } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            }
            return null;
    }
}
