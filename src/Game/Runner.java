package Game;

import People.Person;
import Rooms.Room;
import Game.Board;
import java.util.Scanner;

public class Runner {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int LengthA = 0;
        int WidthA = 0;
        System.out.println("Welcome To The Finite Wars BattleField");
        System.out.println("Please Choose a Map Size" + "\n"
                + "Type S for Small Map(7x7)" + "\n"
                + "Type M for Medium Map(9x9)" + "\n"
                + "Type L for Large Map(12x12)"
        );

        String mapchoice = "";

        while(!mapchoice.equalsIgnoreCase("s")&&(!mapchoice.equalsIgnoreCase("m"))&&(!mapchoice.equalsIgnoreCase("l"))) {
            mapchoice=in.nextLine();
            if (mapchoice.equalsIgnoreCase("S")) {
                LengthA = 7;
                WidthA = 7;
            } else if (mapchoice.equalsIgnoreCase("M")) {
                LengthA = 9;
                WidthA = 9;
            } else if (mapchoice.equalsIgnoreCase("L")) {
                LengthA = 12;
                WidthA = 12;
            //}else if(mapchoice.equalsIgnoreCase("secret")) {}
            } else {
                System.out.println("Please Type S , M , L");
                mapchoice = in.nextLine();
            }
        }
        Board building = new Board(LengthA,WidthA);
        building.generateSpecial();
        building.print();



        int lifePoint=100;




        Person player1 = new Person("FirstName", "FamilyName", 0,0,100);
        building.enterRoom(player1,0,0);




        while(gameOn&&lifePoint!=0)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building.getRooms()))
            {
                building.print();
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
