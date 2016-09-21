
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 Get karel to pick up 7 things then move over he last 3 using loops
 */
/**
 *
 * @author micla1676
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Thingcity = new City();

        //create robot

        Robot karel = new Robot(Thingcity, 1, 1, Direction.EAST);

        //create things

        new Thing(Thingcity, 1, 2);
        new Thing(Thingcity, 1, 3);
        new Thing(Thingcity, 1, 4);
        new Thing(Thingcity, 1, 5);
        new Thing(Thingcity, 1, 6);
        new Thing(Thingcity, 1, 7);
        new Thing(Thingcity, 1, 8);
        new Thing(Thingcity, 1, 9);
        new Thing(Thingcity, 1, 10);
        new Thing(Thingcity, 1, 11);

        //allow movement while moves < 7
        while (karel.countThingsInBackpack() < 7) {
            karel.move();
            karel.pickThing();
        }
        //move 1 space
        karel.move();

        //move while Karel can pick up a "thing"
        while (karel.canPickThing()) {
            karel.move();

        }


    }
}
