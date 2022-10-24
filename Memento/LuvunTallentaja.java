package Memento;

public class LuvunTallentaja {
    private Object obj;

    public void liity(Arvuuttaja arvuuttaja){
        this.obj = arvuuttaja.liityPeliin();
    }

    public void arvaa(int i, Arvuuttaja arvuuttaja){
        arvuuttaja.arvaaLuku(i, obj);
    }
}
