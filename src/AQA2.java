
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
 * @author islai1669
 */
public class AQA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot Lamont = new Robot(tdot,4,1,Direction.EAST);
        new Wall(tdot,4,1,Direction.SOUTH);
        new Wall(tdot,4,1,Direction.EAST);
        new Wall(tdot,4,2,Direction.SOUTH);
        new Wall(tdot,4,2,Direction.EAST);
        new Wall(tdot,4,3,Direction.SOUTH);
        new Wall(tdot,4,4,Direction.SOUTH);
        new Wall(tdot,4,4,Direction.EAST);
        new Wall(tdot,4,5,Direction.SOUTH);
        new Wall(tdot,4,6,Direction.SOUTH);
        new Wall(tdot,4,7,Direction.SOUTH);
        new Wall(tdot,4,7,Direction.EAST);
        new Wall(tdot,4,8,Direction.SOUTH);
        new Wall(tdot,4,9,Direction.SOUTH);
        // create a thing
         new Thing (tdot,4,9);
       // If path is clear move
       while (!Lamont.canPickThing()) {
        if (Lamont.frontIsClear()){ 
            Lamont.move();
            }
       
         // Get robot to move around wall
           while (!Lamont.frontIsClear()){   
            Lamont.turnLeft();
            Lamont.move();
            Lamont.turnLeft();
            Lamont.turnLeft();
            Lamont.turnLeft();
            Lamont.move();
            Lamont.turnLeft();
            Lamont.turnLeft();
            Lamont.turnLeft();
            Lamont.move();
            Lamont.turnLeft();
        }
        }
   }
}
