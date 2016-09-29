
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
 * @author lawd8918
 */
public class A2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city
        City kw = new City();
        //Create things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        //Create a robot
        Robot dave = new Robot(kw, 1, 1, Direction.EAST);
        //Move robot while picking up 7 things
        while (dave.getAvenue() <= 7) {
            dave.move();
            dave.pickThing();
            //move to end of path
            if (dave.getAvenue() > 7) {
                dave.move();
                dave.move();
                dave.move();
                dave.move();

            }
        }




    }
}
