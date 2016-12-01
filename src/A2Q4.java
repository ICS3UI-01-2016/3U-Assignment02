
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author islai1669
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot Lamont = new Robot(tdot,3,1,Direction.NORTH);
        // Top Left square
        new Wall(tdot,1,1,Direction.SOUTH);
        new Wall(tdot,1,1,Direction.WEST);
        new Wall(tdot,1,1,Direction.NORTH);
        new Wall(tdot,1,1,Direction.EAST);
        // Top Right square
        new Wall(tdot,1,4,Direction.SOUTH);
        new Wall(tdot,1,4,Direction.WEST);
        new Wall(tdot,1,4,Direction.NORTH);
        new Wall(tdot,1,4,Direction.EAST);
        // Bottom Left Square        
        new Wall(tdot,4,1,Direction.SOUTH);
        new Wall(tdot,4,1,Direction.EAST);
        new Wall(tdot,4,1,Direction.NORTH);
        new Wall(tdot,4,1,Direction.WEST);
        // Bottom Right square
        new Wall(tdot,4,4,Direction.SOUTH);
        new Wall(tdot,4,4,Direction.EAST);
        new Wall(tdot,4,4,Direction.NORTH);
        new Wall(tdot,4,4,Direction.WEST);
        // Middle Square
        new Wall(tdot,2,2,Direction.NORTH);
        new Wall(tdot,2,2,Direction.WEST);
        new Wall(tdot,2,3,Direction.NORTH);
        new Wall(tdot,2,3,Direction.EAST);
        new Wall(tdot,3,2,Direction.SOUTH);
        new Wall(tdot,3,2,Direction.WEST);
        new Wall(tdot,3,3,Direction.SOUTH);
        new Wall(tdot,3,3,Direction.EAST);
        
            while(Lamont.frontIsClear()){
                Lamont.move();
            if (!Lamont.frontIsClear()){
                Lamont.turnLeft();
                Lamont.move();
                Lamont.turnLeft();
                Lamont.turnLeft();
                Lamont.turnLeft();
                Lamont.move();
                Lamont.move();
                Lamont.turnLeft();
                Lamont.turnLeft();
                Lamont.turnLeft();
                Lamont.move();
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
                
       
        
        
        
    

