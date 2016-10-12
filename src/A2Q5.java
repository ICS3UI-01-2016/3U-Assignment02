
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        // new robot
        RobotSE karel = new RobotSE(kw, 0, 2, Direction.SOUTH);
        Robot tina = new Robot(kw, 0, 2, Direction.SOUTH);


        // Make a ton of walls
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);
        new Wall(kw, 10, 0, Direction.WEST);

        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);
        new Wall(kw, 10, 1, Direction.EAST);

        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 2, Direction.EAST);
        new Wall(kw, 10, 2, Direction.EAST);

        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);

        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);

        new Wall(kw, 5, 3, Direction.NORTH);
        new Wall(kw, 5, 4, Direction.NORTH);
        new Wall(kw, 5, 5, Direction.NORTH);
        new Wall(kw, 5, 5, Direction.EAST);

        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);

        new Wall(kw, 9, 3, Direction.SOUTH);
        new Wall(kw, 9, 4, Direction.SOUTH);
        new Wall(kw, 9, 5, Direction.SOUTH);
        new Wall(kw, 9, 6, Direction.SOUTH);
        new Wall(kw, 9, 7, Direction.SOUTH);

        new Wall(kw, 8, 3, Direction.NORTH);
        new Wall(kw, 8, 4, Direction.NORTH);
        new Wall(kw, 8, 5, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.NORTH);
        new Wall(kw, 8, 7, Direction.NORTH);

        new Wall(kw, 9, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 10, 2, Direction.SOUTH);

        // create a thing
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 5, 2);
        new Thing(kw, 5, 3);
        new Thing(kw, 5, 4);
        new Thing(kw, 8, 2);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 7);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 6);
        new Thing(kw, 9, 4);

        // Loop while front is clear
        while (karel.frontIsClear()) {

            // if there is a driveway
            karel.turnLeft();
            if (!karel.frontIsClear()) {
                karel.turnRight();
                karel.move();
            } else {
                while (karel.frontIsClear()) {
                    karel.move();
                    if (karel.canPickThing()) {
                        karel.pickThing();
                    }
                }
                karel.turnAround();
                while (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                karel.move();
            }
        }
        while (tina.frontIsClear()) {
            tina.move();
            if (tina.canPickThing()) {
                tina.pickThing();
            }
        }
        karel.putAllThings();
        tina.putThing();



    }
}