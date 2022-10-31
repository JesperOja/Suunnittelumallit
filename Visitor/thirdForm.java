package Visitor;

public class thirdForm implements State{

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("" +name() + ", use Firestorm!");
        skill2(pokemon);
    }

    @Override
    public void skill2(Pokemon pokemon) {
        System.out.println("" +name() + ", use Dragon Breath!"); 
        victory(pokemon);       
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("We did it mate, we won!");
        status();
    }

    @Override
    public void status() {
        System.out.println("You can now rest " +name() + ", our journey is at the end!");
        
    }

    @Override
    public String name() {
        
        return "Charizard";
    }

}
