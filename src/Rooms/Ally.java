package Rooms;
import People.Person;
import People.SBoy;
public class Ally extends Room{
    private boolean explore=false;
    private int howMany=0;
    public Ally(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have met Thor" + "\n" + "+10 Health");
        //SlifePoint=SlifePoint+10;
        explore=true;
        howMany++;
/*
        if(howMany==5)
        {
          System.out.println("You have received Mjolnir+"Atk Increased to 100");
          atkPower=atkPower*20;
        }
*/
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
