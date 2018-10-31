package Game;

import People.Person;
import Rooms.Room;
import Rooms.Thanos;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int LengthA = 0;
        int WidthA = 0;
        Room[][] building = new Room[LengthA][WidthA];
        System.out.println("Welcome To The Infinity Wars BattleField");
        System.out.println("Please Choose a Map Size" + "\n"
                + "Type S for Small Map(7x7)" + "\n"
                + "Type M for Medium Map(9x9)" + "\n"
                + "Type L for Large Map(12x12)"
        );
        String mapchoice = in.nextLine();
        if (mapchoice.equalsIgnoreCase("S")) {
            LengthA = 7;
            WidthA = 7;
        } else if (mapchoice.equalsIgnoreCase("M")) {
            LengthA = 9;
            WidthA = 9;
        } else if (mapchoice.equalsIgnoreCase("L")) {
            LengthA = 12;
            WidthA = 12;
        }
        for(int i=0;i<building.length;i++)
        {
            for(int k=0;k<building[i].length;k++)
            {
                System.out.print(building[i][k]);
            }
            System.out.println();
        }




        int lifePoint = 100;

        //Fill the building with normal rooms
        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Room(x,y);
            }

        }

        //Create a random winning room.
        int x = (int)(Math.random()*building.length);
        int y = (int)(Math.random()*building.length);
        building[x][y] = new WinningRoom(x, y);
        x = (int)(Math.random()*building.length);
        y = (int)(Math.random()*building.length);
        building[x][y] = new Thanos(x,y);
        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        building[0][0].enterRoom(player1);




        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
    */
    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }

}
