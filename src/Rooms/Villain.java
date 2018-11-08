package Rooms;

import People.Person;
import People.SBoy;
public class Villain extends Room {

    private boolean explore=false;

    public Villain(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have met have been struck by a goon." + "\n" + "-10 Health");
        explore=true;
        //lifePoint=lifePoint-50;
    }
    public String toString()
    {
        if(occupant!=null)
        {
            return "[S]";
        }
        else if(explore==false)
        {
            return "[V]";
        }
        else
        {
            return "[ ]";
        }


    }
}
