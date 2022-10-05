package State;

public class firstForm implements State {

    @Override
    public void next(Pokemon pokemon) {
        status();
        pokemon.setState(new secondForm());
        pokemon.fight();
    }

    @Override
    public void status() {
        System.out.println("Charmander is evolving..!");
        
    }

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("Charmander, Cast ember!");
        skill2(pokemon);
        
    }

    @Override
    public void skill2(Pokemon pokemon) {
        
        System.out.println("Charmander, cast swipe!");
        victory(pokemon);
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("Well done Charmander, we won!");
        next(pokemon);
        
    }
    
}
