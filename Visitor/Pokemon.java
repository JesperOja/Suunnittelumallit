package Visitor;

public class Pokemon implements StateVisitor {
    private State state = new firstForm();

    public void setState(State newState) {
        this.state = newState;
    }

    public void fight(){
        visit(state);
    }

    @Override
    public void visit(State state) {
        state.skill1(this);
    }

    @Override
    public void next() {
        if(state.name().equals("Charmander")){
            setState(new secondForm());
            fight();
        }else if(state.name().equals("Charmaleon")){
            setState(new thirdForm());
            fight();
        }
    }

}
