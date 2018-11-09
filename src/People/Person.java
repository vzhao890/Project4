package People;

import Game.Runner;
import Rooms.Ally;

public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int lifePoint;



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
        lifePoint=lifePoint-10;
        if(lifePoint==0)
        {
            Runner.gameOff();
        }
    }
    public void healS()
    {
        lifePoint=lifePoint+10;
    }
    public Person (String firstName, String familyName, int xLoc, int yLoc, int lifePoint)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.lifePoint=lifePoint;

    }
}
