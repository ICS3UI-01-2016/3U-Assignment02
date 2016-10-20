
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City  for robot
        City nm = new City();
         Robot bob = new Robot(nm, 1, 5, Direction.EAST);

        // Create Walls 
        new Wall(nm, 1, 2, Direction.SOUTH);
        new Wall(nm, 1, 2, Direction.EAST);
        new Wall(nm, 1, 3, Direction.SOUTH);
        new Wall(nm, 1, 3, Direction.EAST);
        new Wall(nm, 1, 4, Direction.SOUTH);
        new Wall(nm, 1, 5, Direction.SOUTH);
        new Wall(nm, 1, 5, Direction.EAST);
        new Wall(nm, 1, 6, Direction.SOUTH);
        new Wall(nm, 1, 7, Direction.SOUTH);
        new Wall(nm, 1, 8, Direction.SOUTH);
        new Wall(nm, 1, 8, Direction.EAST);
        new Wall(nm, 1, 9, Direction.SOUTH);
        new Wall(nm, 1, 10, Direction.SOUTH);
        new Thing(nm, 1, 10);


        //while loop with conditon.
        //The end of this java code is when the bob can pick pick something up. Thus he will keep moving when he cant keep a THing up. 
        while (!bob.canPickThing()) {
        // When there is an option of the front is not clear turn left and move around the wall and turn right so the robot is facing west.  
            if (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
            }
        // When there is an option of the front being clear get bob to move.   
            if (bob.frontIsClear()) {
                bob.move();
            }

        }

    }
}
