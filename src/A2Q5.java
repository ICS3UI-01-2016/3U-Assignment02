
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
 * @author islai1669
 */
public class A2Q5 {

    private static City toronto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    }
        // Create a city for the robot
        City toronto = new City();
        //  Create a robot
        RobotSE Lamont = new RobotSE(toronto, 0, 1, Direction.SOUTH);
        // Create walls
        new Wall(toronto, 0, 0, Direction.EAST);
        new Wall(toronto, 1, 0, Direction.EAST);
        new Wall(toronto, 2, 0, Direction.EAST);
        new Wall(toronto, 3, 0, Direction.EAST);
        new Wall(toronto, 4, 0, Direction.EAST);
        new Wall(toronto, 5, 0, Direction.EAST);
        new Wall(toronto, 6, 0, Direction.EAST);
        new Wall(toronto, 7, 0, Direction.EAST);
        new Wall(toronto, 8, 0, Direction.EAST);
        new Wall(toronto, 9, 0, Direction.EAST);
        new Wall(toronto, 10, 0, Direction.EAST);
        new Wall(toronto, 0, 1, Direction.EAST);
        new Wall(toronto, 1, 2, Direction.NORTH);
        new Wall(toronto, 1, 3, Direction.NORTH);
        new Wall(toronto, 1, 4, Direction.NORTH);
        new Wall(toronto, 1, 5, Direction.NORTH);
        new Wall(toronto, 1, 5, Direction.EAST);
        new Wall(toronto, 2, 5, Direction.EAST);
        new Wall(toronto, 2, 5, Direction.SOUTH);
        new Wall(toronto, 2, 4, Direction.SOUTH);
        new Wall(toronto, 2, 3, Direction.SOUTH);
        new Wall(toronto, 2, 2, Direction.SOUTH);
        new Wall(toronto, 3, 1, Direction.EAST);
        new Wall(toronto, 4, 2, Direction.NORTH);
        new Wall(toronto, 4, 3, Direction.NORTH);
        new Wall(toronto, 4, 4, Direction.NORTH);
        new Wall(toronto, 4, 4, Direction.EAST);
        new Wall(toronto, 4, 4, Direction.SOUTH);
        new Wall(toronto, 4, 3, Direction.SOUTH);
        new Wall(toronto, 4, 2, Direction.SOUTH);
        new Wall(toronto, 5, 1, Direction.EAST);
        new Wall(toronto, 6, 1, Direction.EAST);
        new Wall(toronto, 7, 2, Direction.NORTH);
        new Wall(toronto, 7, 3, Direction.NORTH);
        new Wall(toronto, 7, 4, Direction.NORTH);
        new Wall(toronto, 7, 6, Direction.NORTH);
        new Wall(toronto, 7, 6, Direction.EAST);
        new Wall(toronto, 8, 6, Direction.EAST);
        new Wall(toronto, 8, 6, Direction.SOUTH);
        new Wall(toronto, 8, 4, Direction.SOUTH);
        new Wall(toronto, 8, 3, Direction.SOUTH);
        new Wall(toronto, 8, 2, Direction.SOUTH);
        new Wall(toronto, 9, 1, Direction.EAST);
        new Wall(toronto, 10, 1, Direction.SOUTH);
        new Wall(toronto, 10, 1, Direction.EAST);
        new Wall(toronto, 7, 5, Direction.NORTH);
        new Wall(toronto, 8, 5, Direction.SOUTH);

        // Create things
        new Thing(toronto, 1, 1);
        new Thing(toronto, 1, 2);
        new Thing(toronto, 1, 3);
        new Thing(toronto, 1, 4);
        new Thing(toronto, 2, 1);
        new Thing(toronto, 2, 3);
        new Thing(toronto, 2, 5);
        new Thing(toronto, 4, 1);
        new Thing(toronto, 4, 2);
        new Thing(toronto, 4, 3);
        new Thing(toronto, 7, 1);
        new Thing(toronto, 7, 1);
        new Thing(toronto, 7, 6);
        new Thing(toronto, 8, 2);
        new Thing(toronto, 8, 3);
        new Thing(toronto, 8, 5);

        while (Lamont.frontIsClear()) {
            Lamont.turnLeft();
            if (Lamont.frontIsClear()) {
                Lamont.move();
            }
            
        }
        
        while (!Lamont.frontIsClear()) {
            Lamont.turnAround();
            if (!Lamont.frontIsClear()) {
                Lamont.turnLeft();
            }
            if (Lamont.frontIsClear()) {
                Lamont.move();
            }
        }
        while (Lamont.isFacingEast()){
            if (!Lamont.frontIsClear()){
                Lamont.turnAround();
            }
        }
    }
}
