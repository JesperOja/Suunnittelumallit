package State;

public class secondForm implements State{

    @Override
    public void next(Pokemon pokemon) {
        status();
        pokemon.setState(new thirdForm());
        pokemon.fight();
    }

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("Charmaloen, use flamethrower!");
        skill2(pokemon);
    }

    @Override
    public void skill2(Pokemon pokemon) {
        System.out.println("Charmaloen, use scratch!");
        victory(pokemon);
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("Awesome job Charmaloen, you did it!");
        next(pokemon);
    }

    @Override
    public void status() {
        System.out.println("OMG, Charmaloen is evolving..!");
    }

    
}
