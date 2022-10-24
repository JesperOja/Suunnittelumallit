package Memento;

public class Arvuuttaja {
    
    private boolean end = false;

    public void arvaaLuku(int luku, Object memento){
        Memento mento = (Memento) memento;
        if(luku == mento.luku){
            System.out.println("Pelaaja " + Thread.currentThread().getName() + " Arvasit oikein! " + luku);
            end = true;
            endGame();
        }else{
            System.out.println("Pelaaja " + Thread.currentThread().getName() + " Arvasit: " +luku+ " Ei ollut oikea numero!");
        }
    }

    public boolean endGame(){
        if(end){
            System.out.println("Peli päättyi sinun osaltasi pelaaja "+ Thread.currentThread().getName());
        return end;
        }
        return end;
    }

    public Memento liityPeliin(){
        System.out.println("Tervetuloa mukaan peliin pelaaja " + Thread.currentThread().getName());
        return new Memento();
    }
    
    private class Memento {
        private int luku;
        
        public Memento(){
            this.luku = (int)Math.floor(Math.random()*20);
        }
    }
}
