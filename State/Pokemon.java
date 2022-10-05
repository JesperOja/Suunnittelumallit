package State;

public class Pokemon {
    private State state = new firstForm();

    public void setState(State newState) {
        this.state = newState;
    }

    public void fight(){
        state.skill1(this);
    }

}
