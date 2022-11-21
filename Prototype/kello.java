package Prototype;

public class kello implements Cloneable {
    private pikkuViisari pikkuViisari;
    private isoViisari isoViisari;

    public void getTime(){
        System.out.println("Clock is " + isoViisari.getPaikka() + ":" +pikkuViisari.getPaikka());
    }

    public kello(int isoviisari, int pikkuviisari){
        this.pikkuViisari = new pikkuViisari(pikkuviisari);
        this.isoViisari = new isoViisari(isoviisari);
    }

    /* 
    public kello clone(){
        kello k = null;
        try{
            k = (kello)super.clone();
            k.isoViisari = (isoViisari)isoViisari.clone();
            k.pikkuViisari = (pikkuViisari)pikkuViisari.clone();
        }catch (CloneNotSupportedException e) {
            return null;
            }

        return k;
    }*/

    public Object clone() {
        //matalakopio:
        try {
        return super.clone();
        } catch (CloneNotSupportedException e) {
        return null;
        }
        }

    public isoViisari getIso(){
        return isoViisari;
    }

    public pikkuViisari getPikku(){
        return pikkuViisari;
    }
}
