package Rooms;

import People.Person;
import Game.Runner;
public class Room {
    Person occupant;
    int xLoc,yLoc;
    int lifePoint;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }


    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You have arrived at the BattleFieldM");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }


    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public String toString()
    {
        if(occupant==null)
        {
            return "[ ]";
        }
        return "[S]";
    }
}
