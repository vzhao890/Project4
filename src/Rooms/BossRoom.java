package Rooms;
import Game.Runner;
import People.Person;

import java.util.Scanner;

public class BossRoom extends Room{
    public BossRoom(int x, int y)
    {
        super(x, y);
    }


    public void enterRoom(Person x)
    {
        Scanner in = new Scanner(System.in);
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You Have Met Thanos");
        System.out.println("Thanos is gravely wounded"+"\n"+"Do You Finish Him Off?"+"\n"+"Answer with yes or no");
        String answer="";
        while(!answer.equalsIgnoreCase("yes")&&(!answer.equalsIgnoreCase("no")))
        {
            answer=in.nextLine();
            if(answer.equalsIgnoreCase("yes"))
            {
                System.out.println("You have won the game!");
                in.close();
                Runner.gameOff();
            }
            else if(answer.equalsIgnoreCase("no"))
            {
                System.out.println("You have made the wrong decision"+"\n"+"You feel a great disturbance in the Universe, as if millions of voices suddenly cried out in terror and were suddenly silenced."+"\n"+"You fear something terrible has happened");
               in.close();
                Runner.gameOff();
            }
        }

    }
    public String toString()
    {
        return "[T]";
    }

}
