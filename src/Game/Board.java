package Game;
import People.Person;
import Rooms.Room;
import Rooms.Thanos;
import Game.Runner;
import Rooms.Villain;
import People.Person;
public class Board
{
    private Room[][] rooms;

    public Board(Room[][] a)
    {
        this.rooms = a;
    }
    public Board(int height, int width)
    {
        rooms=new Room[height][width];
        for(int i=0;i<rooms.length;i++)
        {
            for(int k=0;k<rooms[i].length;k++)
            {
                rooms[i][k]=new Room(i,k);
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void enterRoom(Person a, int x, int y)
    {
      rooms[x][y].enterRoom(a);
    }
    public void generateSpecial()
    {
        //Create a random Boss room.
        int x = 0;
        int y = 0;
        while (x == 0 && y == 0) {
            x = (int) (Math.random() * rooms.length);
            y = (int) (Math.random() * rooms.length);
        }
        rooms[x][y] = new Thanos(x, y);
        //Create a random Villain room
        int a = 0;
        int b = 0;
        while (a == 0 && b == 0)
        {
            a =(int) (Math.random() * rooms.length);
            b =(int) (Math.random() * rooms.length);
            if(a == x && b ==x)
            {
                a=0;
                b=0;
            }
        }
        rooms[a][b] = new Villain(a, b);
    }
    public String toString()
    {
        String str ="";
        for(Room[] a : rooms)
        {
            for(Room x:a)
            {
                str =str + x;
            }
            str = str + "\n";
        }
        return str;
    }
    public void print()
    {
        for(int i=0; i<rooms.length;i++)
        {
            for(int k=0;k<rooms[i].length;k++)
            {
                System.out.print(rooms[i][k]);
            }
            System.out.println();
        }
    }



}
