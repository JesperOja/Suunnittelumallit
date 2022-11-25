package Command;

public class GoingDownCommand implements Command{
    private WhiteScreen ws;

    public GoingDownCommand(WhiteScreen ws){
        this.ws = ws;
    }

    @Override
    public void execute(){
        ws.goingDown();
    }
}
