package People;
import People.Person;
import Rooms.Ally;
public class SBoy extends Person{
    private int atkPower;
    public SBoy(String firstName, String familyName, int xLoc, int yLoc, int SlifePoint,int SatkPower,int TlifePoint, int TatkPower)
    {
        super(firstName, familyName, xLoc, yLoc, SlifePoint,SatkPower,TlifePoint,  TatkPower);
        this.atkPower=SatkPower;
    }


}
