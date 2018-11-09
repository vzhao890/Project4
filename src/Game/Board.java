package Game;
import People.Person;
import Rooms.*;

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
        //Create a random Villain room
        int a=0;
        int b=0;
        for(int i=0;i<rooms[a].length;i++)
        {
            a =(int) (Math.random() * rooms.length);
            b =(int) (Math.random() * rooms.length);
            rooms[a][b] = new Villain(a, b);
        }
        //Create a random Ally Room
        for(int i=0;i<rooms[a].length;i++)
        {
            a =(int) (Math.random() * rooms.length);
            b =(int) (Math.random() * rooms.length);
            rooms[a][b] = new Ally(a, b);
        }
        //Create a  Boss room.
        rooms[0][2] = new DrUniqueMath(0,2);
        rooms[5][5] = new BossRoom(5, 5);


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
