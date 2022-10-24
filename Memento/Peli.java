package Memento;

public class Peli implements Runnable{
    Arvuuttaja arvuuttaja = new Arvuuttaja();
    public static void main(String[] args){
        

        int n = 5;
        for(int i = 0; i< n; i++){
            Thread pelaaja = new Thread(new Peli());
            pelaaja.start();
        }
    }

    @Override
    public void run() {
        LuvunTallentaja tallentaja = new LuvunTallentaja();
        tallentaja.liity(arvuuttaja);

        while(!arvuuttaja.endGame()){
            int arvaus = (int) Math.floor(Math.random()*20);
            tallentaja.arvaa(arvaus, arvuuttaja);
        }
        
    }
    
}
