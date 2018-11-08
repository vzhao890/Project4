package People;

import Game.Runner;
import Rooms.Ally;

public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int SlifePoint;
    int TlifePoint;
    int SatkPower;
    int TatkPower;

    public int getxLoc()
    {
        return xLoc;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }
    public void minusS()
    {
        SlifePoint=SlifePoint-10;
        if(SlifePoint==0)
        {
            Runner.gameOff();
        }
    }
    public void healS()
    {
        SlifePoint=SlifePoint+10;
    }
    public Person (String firstName, String familyName, int xLoc, int yLoc, int SlifePoint, int SatkPower, int TlifePoint, int TatkPower)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.SlifePoint=SlifePoint;
        this.SatkPower=SatkPower;
    }
}
