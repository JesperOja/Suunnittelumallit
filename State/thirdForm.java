package State;

public class thirdForm implements State{

    @Override
    public void next(Pokemon pokemon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void skill1(Pokemon pokemon) {
        System.out.println("Charizard, use Firestorm!");
        skill2(pokemon);
    }

    @Override
    public void skill2(Pokemon pokemon) {
        System.out.println("Charizard, use Dragon Breath!"); 
        victory(pokemon);       
    }

    @Override
    public void victory(Pokemon pokemon) {
        System.out.println("We did it mate, we won!");
        status();
    }

    @Override
    public void status() {
        System.out.println("You can now rest Charizard, our journey is at the end!");
        
    }

}
