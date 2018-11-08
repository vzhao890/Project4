package Rooms;
import Game.Runner;
import People.Person;

public class BossRoom extends Room{
    public BossRoom(int x, int y)
    {
        super(x, y);
    }


    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You Have Met Thanos");
        Runner.gameOff();
    }
    public String toString()
    {
        return "[T]";
    }

}
