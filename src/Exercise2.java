
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
 * @author macdt8987
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City aaa = new City();
        //Make a robot
        RobotSE xxx = new RobotSE (aaa,1,1,Direction.EAST);
        //Make the walls
        new Wall (aaa,1,1,Direction.SOUTH);
        new Wall (aaa,1,1,Direction.EAST);
        new Wall (aaa,1,2,Direction.SOUTH);
        new Wall (aaa,1,3,Direction.SOUTH);
        new Wall (aaa,1,2,Direction.EAST);
        new Wall (aaa,1,3,Direction.EAST);
        new Wall (aaa,1,4,Direction.SOUTH);
        new Wall (aaa,1,4,Direction.EAST);
        new Wall (aaa,1,5,Direction.SOUTH);
        new Wall (aaa,1,5,Direction.EAST);
        //Make the thing
        new Thing (aaa,1,6);
        //Make the robot move
        while(!xxx.frontIsClear())
        {
            xxx.turnLeft();
            xxx.move();
            xxx.turnRight();
            xxx.move();
            xxx.turnRight();
            xxx.move();
            xxx.turnLeft();
        
                
        
        
            
        }
        
    }
}
