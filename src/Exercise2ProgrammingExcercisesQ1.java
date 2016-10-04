
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
 * @author manok5757
 */
public class Exercise2ProgrammingExcercisesQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        // create a robot
        Robot red = new Robot(km, 1, 1, Direction.EAST);
        // create row of items
        new Thing(km, 1, 2);
        new Thing(km, 1, 3);
        new Thing(km, 1, 4);
        new Thing(km, 1, 5);
        new Thing(km, 1, 6);
        new Thing(km, 1, 7);
        new Thing(km, 1, 8);
        new Thing(km, 1, 9);
        new Thing(km, 1, 10);
        new Thing(km, 1, 11);
        // create conditions for robot to pick thngs
        while (red.countThingsInBackpack() != 7) {
            red.move();
            if (red.canPickThing()) {
                red.pickThing();
                if (red.countThingsInBackpack() == 7) {
                    red.move();
                    if (red.getAvenue() != 12) {
                        red.move();
                    }
                    red.move();
                    red.move();
                    break;


                }
            }

        }
    }
}
