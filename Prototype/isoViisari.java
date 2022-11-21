package Prototype;

public class isoViisari implements Cloneable{
    private int paikka = 12;

    public isoViisari(int paikka){
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
