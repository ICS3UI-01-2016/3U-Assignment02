
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //Create the walls
        new Wall(kw, 1, 0, Direction.EAST);
        new Wall(kw, 2, 0, Direction.EAST);
        new Wall(kw, 3, 0, Direction.EAST);
        new Wall(kw, 4, 0, Direction.EAST);
        new Wall(kw, 5, 0, Direction.EAST);
        new Wall(kw, 6, 0, Direction.EAST);
        new Wall(kw, 7, 0, Direction.EAST);
        new Wall(kw, 8, 0, Direction.EAST);
        new Wall(kw, 9, 0, Direction.EAST);
        new Wall(kw, 10, 0, Direction.EAST);

        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 10, 1, Direction.EAST);
        new Wall(kw, 10, 1, Direction.SOUTH);

        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);

        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);

        new Wall(kw, 5, 2, Direction.NORTH);
        new Wall(kw, 5, 3, Direction.NORTH);
        new Wall(kw, 5, 4, Direction.NORTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.EAST);

        new Wall(kw, 8, 2, Direction.NORTH);
        new Wall(kw, 8, 3, Direction.NORTH);
        new Wall(kw, 8, 4, Direction.NORTH);
        new Wall(kw, 8, 5, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.EAST);

        new Wall(kw, 9, 2, Direction.SOUTH);
        new Wall(kw, 9, 3, Direction.SOUTH);
        new Wall(kw, 9, 4, Direction.SOUTH);
        new Wall(kw, 9, 5, Direction.SOUTH);
        new Wall(kw, 9, 6, Direction.SOUTH);
        new Wall(kw, 9, 6, Direction.EAST);

        //Create the cleaning robots
        RobotSE ross = new RobotSE(kw, 1, 1, Direction.SOUTH);
        RobotSE rachel = new RobotSE(kw, 1, 1, Direction.SOUTH);
        ross.setLabel("Ross");
        rachel.setLabel("Rachel");
        rachel.setColor(Color.PINK);

        // Make Snooooww!!
        new Thing(kw, 2, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 6, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 1);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 5);
        new Thing(kw, 3, 3);
        new Thing(kw, 5, 3);
        new Thing(kw, 5, 4);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 5);
        new Thing(kw, 8, 6);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 5);

        //Lets start shoveling!! lets get rachel to clean the driveways        

        //overall loop
        while (rachel.frontIsClear()) {
            //determine if there's a driveway
            rachel.turnLeft();
            if (!rachel.frontIsClear()) {
                rachel.turnRight();
                rachel.move();
            } else {
                //found drivewaaaay!!!
                while (rachel.frontIsClear()) {
                    rachel.move();
                    if (rachel.canPickThing()) {
                        rachel.pickThing();
                    }
                }
                rachel.turnAround();
                while (rachel.frontIsClear()) {
                    rachel.move();
                }
                rachel.turnLeft();
                rachel.move();
            }
        }
        while (rachel.countThingsInBackpack() > 0) {
            rachel.putAllThings();
        }

        while (ross.frontIsClear()) {
            ross.move();
            if (ross.canPickThing()) {
                ross.pickThing();
            }
        }
        while (ross.countThingsInBackpack() > 0) {
            ross.putAllThings();
        }
    }
}