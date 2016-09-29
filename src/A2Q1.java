
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //integers
        int things = -1;
        //basic startup for a single robot
        City kw = new City();
        Robot Karel = new Robot(kw, 1, 0, Direction.EAST);
        //create a line of things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        //picking up 7 things then stopping on the 11 space
        while (things < 10) {
            Karel.move();
            things = things + 1;
            if (things < 7) {
                Karel.pickThing();

            }
        }
    }
}
