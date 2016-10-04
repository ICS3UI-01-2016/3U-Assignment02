
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
 * @author slatz8075
 */
public class A2Q5 {

    private static City A2Q5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A2Q5 = new City();
        //Create robot
        Robot karel = new Robot(A2Q5, 1, 3, Direction.SOUTH);

        //create the drive way and the things
        new Wall(A2Q5, 1, 2, Direction.EAST);
        new Wall(A2Q5, 2, 2, Direction.EAST);
        new Wall(A2Q5, 3, 2, Direction.EAST);
        new Wall(A2Q5, 4, 2, Direction.EAST);
        new Wall(A2Q5, 5, 2, Direction.EAST);
        new Wall(A2Q5, 6, 2, Direction.EAST);
        new Wall(A2Q5, 7, 2, Direction.EAST);
        new Wall(A2Q5, 8, 2, Direction.EAST);
        new Wall(A2Q5, 9, 2, Direction.EAST);
        new Wall(A2Q5, 10, 2, Direction.EAST);
        new Wall(A2Q5, 1, 3, Direction.EAST);
        new Wall(A2Q5, 4, 3, Direction.EAST);
        new Wall(A2Q5, 6, 3, Direction.EAST);
        new Wall(A2Q5, 7, 3, Direction.EAST);
        new Wall(A2Q5, 10, 3, Direction.EAST);
        new Wall(A2Q5, 10, 3, Direction.SOUTH);

        new Wall(A2Q5, 2, 4, Direction.NORTH);
        new Wall(A2Q5, 2, 5, Direction.NORTH);
        new Wall(A2Q5, 2, 6, Direction.NORTH);
        new Wall(A2Q5, 2, 7, Direction.NORTH);
        new Wall(A2Q5, 2, 7, Direction.EAST);
        new Wall(A2Q5, 3, 7, Direction.EAST);
        new Wall(A2Q5, 3, 7, Direction.SOUTH);
        new Wall(A2Q5, 3, 6, Direction.SOUTH);
        new Wall(A2Q5, 3, 5, Direction.SOUTH);
        new Wall(A2Q5, 3, 4, Direction.SOUTH);

        new Wall(A2Q5, 5, 4, Direction.NORTH);
        new Wall(A2Q5, 5, 4, Direction.SOUTH);
        new Wall(A2Q5, 5, 5, Direction.NORTH);
        new Wall(A2Q5, 5, 5, Direction.SOUTH);
        new Wall(A2Q5, 5, 6, Direction.NORTH);
        new Wall(A2Q5, 5, 6, Direction.SOUTH);
        new Wall(A2Q5, 5, 6, Direction.EAST);

        new Wall(A2Q5, 8, 4, Direction.NORTH);
        new Wall(A2Q5, 8, 5, Direction.NORTH);
        new Wall(A2Q5, 8, 6, Direction.NORTH);
        new Wall(A2Q5, 8, 7, Direction.NORTH);
        new Wall(A2Q5, 8, 8, Direction.NORTH);
        new Wall(A2Q5, 8, 8, Direction.EAST);
        new Wall(A2Q5, 9, 8, Direction.EAST);
        new Wall(A2Q5, 9, 8, Direction.SOUTH);
        new Wall(A2Q5, 9, 7, Direction.SOUTH);
        new Wall(A2Q5, 9, 6, Direction.SOUTH);
        new Wall(A2Q5, 9, 5, Direction.SOUTH);
        new Wall(A2Q5, 9, 4, Direction.SOUTH);

        //Create the things

        new Thing(A2Q5, 2, 3);
        new Thing(A2Q5, 3, 3);
        new Thing(A2Q5, 2, 4);
        new Thing(A2Q5, 2, 5);
        new Thing(A2Q5, 2, 6);
        new Thing(A2Q5, 3, 7);
        new Thing(A2Q5, 3, 5);

        new Thing(A2Q5, 5, 3);
        new Thing(A2Q5, 5, 4);
        new Thing(A2Q5, 5, 5);

        new Thing(A2Q5, 8, 3);
        new Thing(A2Q5, 8, 4);
        new Thing(A2Q5, 9, 4);
        new Thing(A2Q5, 9, 5);
        new Thing(A2Q5, 9, 7);
        new Thing(A2Q5, 8, 8);

        //overall loop
        while (karel.frontIsClear()) {
            //determine if there is a driveway
            karel.turnLeft();
            if (karel.frontIsClear() != true) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else {
                //found driveway
                while (karel.frontIsClear()) {
                    if (karel.canPickThing() == true) {
                        karel.pickThing();
                    }
                    karel.move();
                }
                karel.turnLeft();
                karel.turnLeft();
                while (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                karel.move();
            }//end of else
        }//end  of while
    }
}
