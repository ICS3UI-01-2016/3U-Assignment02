
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City aaa = new City();
        //Create a Robot
        RobotSE karl = new RobotSE (aaa,0,0,Direction.EAST);
        //Create the walls
        new Wall(aaa,1,1,Direction.NORTH);
        new Wall(aaa,1,1,Direction.EAST);
        new Wall(aaa,1,1,Direction.SOUTH);
        new Wall(aaa,1,1,Direction.WEST);
        new Wall(aaa,2,2,Direction.NORTH);
        new Wall(aaa,2,2,Direction.WEST);
        new Wall(aaa,2,3,Direction.NORTH);
        new Wall(aaa,2,3,Direction.EAST);
        new Wall(aaa,3,2,Direction.SOUTH);
        new Wall(aaa,3,2,Direction.WEST);
        new Wall(aaa,3,3,Direction.SOUTH);
        new Wall(aaa,3,3,Direction.EAST);
        new Wall(aaa,1,4,Direction.NORTH);
        new Wall(aaa,1,4,Direction.EAST);
        new Wall(aaa,1,4,Direction.SOUTH);
        new Wall(aaa,1,4,Direction.WEST);
        new Wall(aaa,4,1,Direction.NORTH);
        new Wall(aaa,4,1,Direction.EAST);
        new Wall(aaa,4,1,Direction.SOUTH);
        new Wall(aaa,4,1,Direction.WEST);
        new Wall(aaa,4,4,Direction.NORTH);
        new Wall(aaa,4,4,Direction.EAST);
        new Wall(aaa,4,4,Direction.SOUTH);
        new Wall(aaa,4,4,Direction.WEST);
        // Make the robot move
       while(karl.frontIsClear()){
           karl.move();
           karl.move();
           karl.turnRight();
           karl.move();
           karl.turnLeft();
           karl.move();
           karl.turnLeft();
           karl.move();
           karl.turnRight();
           karl.move();
           karl.move();
           
           karl.turnRight();
       }
 
    }
}
