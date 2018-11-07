package Rooms;
import People.Person;
public class Ally extends Room{
    private boolean explore=false;

    public Ally(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have met Thor" + "\n" + "+10 Health");
        lifePoint=lifePoint+10;
    }
    public String toString()
    {
        if(occupant!=null)
        {
            return "[S]";
        }
        else if(explore==false)
        {
            return "[A]";
        }
        else
        {
            return "[ ]";
        }

    }
}
