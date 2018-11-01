package Rooms;
import Game.Runner;
import People.Person;

public class Thanos extends Room{
    public Thanos(int x, int y)
    {
        super(x, y);
    }


    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        Runner.gameOff();
    }
}
