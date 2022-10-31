package Visitor;

public class secondForm implements State{

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("" +name() + ", use flamethrower!");
        skill2(pokemon);
    }

    @Override
    public void skill2(Pokemon pokemon) {
        System.out.println("" +name() + ", use scratch!");
        victory(pokemon);
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("Awesome job " +name() + ", you did it!");
        status();
        pokemon.next();
    }

    @Override
    public void status() {
        System.out.println("OMG, " +name() + " is evolving..!");
    }

    @Override
    public String name() {
        return "Charmaleon";
    }

    
}
