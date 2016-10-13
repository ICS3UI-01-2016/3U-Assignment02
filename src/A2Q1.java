
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
 * @author slatz8075
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A2Q1 = new City();
        //Create robot
        Robot karel = new Robot(A2Q1, 1, 1, Direction.EAST);
        //Create the things
        new Thing(A2Q1, 1, 2);
        new Thing(A2Q1, 1, 3);
        new Thing(A2Q1, 1, 4);
        new Thing(A2Q1, 1, 5);
        new Thing(A2Q1, 1, 6);
        new Thing(A2Q1, 1, 7);
        new Thing(A2Q1, 1, 8);
        new Thing(A2Q1, 1, 9);
        new Thing(A2Q1, 1, 10);
        new Thing(A2Q1, 1, 11);
        //Get karel to pick up 7 of the things
        //create a variable to stop the movement
        int moves = 0;
        //loop 7 times
        while (moves < 7) {
            karel.move();
            karel.pickThing();
            //add 1 to the movement counter
            moves = moves + 1;
        }

        //End loop
        karel.move();
        karel.move();
        karel.move();
        karel.move();
    }
}