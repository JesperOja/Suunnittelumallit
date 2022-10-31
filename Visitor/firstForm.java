package Visitor;

public class firstForm implements State {

    @Override
    public void status() {
        System.out.println("" +name() + " is evolving..!");
        
    }

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("" +name() + ", Cast ember!");
        skill2(pokemon);
        
    }

    @Override
    public void skill2(Pokemon pokemon) {
        
        System.out.println("" +name() + ", cast swipe!");
        victory(pokemon);
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("Well done " +name() + ", we won!");
        status();
        pokemon.next();
    }

    @Override
    public String name() {
        
        return "Charmander";
    }
    
}
