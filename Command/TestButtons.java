package Command;

public class TestButtons {
    public static void main(String[] args){

        WhiteScreen ws = new WhiteScreen();
        Command screenUp = new GoingUpCommand(ws);
        Command screenDown = new GoingDownCommand(ws);

        WallButton upButton = new WallButton(screenUp);
        WallButton downButton = new WallButton(screenDown);

        downButton.push();
        upButton.push();
    }
}
