package Rooms;

import People.Person;

import java.util.Scanner;

public class DrUniqueMath extends Room
{
    private boolean explore=false;
    public DrUniqueMath(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        Scanner in = new Scanner(System.in);
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have met Dr.Math" + "\n" + "What is the sum of 5+5");
        explore=true;
        int answer=Sum(5,5);
        String Banswer=in.nextLine();
        int result = Integer.valueOf(Banswer);
        if(result!=answer)
        {
            System.out.println("Bahumbug");
        }
        else{
            System.out.println("good jOB");
        }
        System.out.println("What is the sum of 5+7+236");
        answer=Sum(5,7,236);
        String Canswer=in.nextLine();
        result = Integer.valueOf(Canswer);
        if(result!=answer)
        {
            System.out.println("Bahumbug");
        }
        else{
            System.out.println("good jOB");
        }

    }
    public int Sum(int a, int b) {
        return Sum(a, b, 0);
    }

    public int Sum (int a, int b, int c) {
        return a + b + c;
    }
    public String toString()
    {
        if(occupant!=null)
        {
            return "[S]";
        }
        else if(explore==false)
        {
            return "[U]";
        }
        else
        {
            return "[ ]";
        }

    }
}
