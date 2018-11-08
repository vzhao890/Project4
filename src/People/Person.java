package People;

public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int lifePoint;
    int atkPower;

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

    public Person (String firstName, String familyName, int xLoc, int yLoc, int lifePoint, int atkPower)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.lifePoint=lifePoint;
        this.atkPower=atkPower;
    }
}
