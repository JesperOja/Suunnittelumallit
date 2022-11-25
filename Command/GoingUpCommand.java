package Command;

public class GoingUpCommand implements Command{
    private WhiteScreen ws;

    public GoingUpCommand(WhiteScreen ws){
        this.ws = ws;
    }

    @Override
    public void execute(){
        ws.goingUp();
    }
}
