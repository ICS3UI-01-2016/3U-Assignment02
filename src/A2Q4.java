
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city for robot
        City As = new City();
        Robot Zoom = new Robot (As, 0, 0, Direction.EAST);
        
        //Create Walls
        new Wall (As, 1, 1,Direction.NORTH);
        new Wall (As, 1, 1,Direction.WEST);
        new Wall (As, 1, 1,Direction.SOUTH);
        new Wall (As, 1, 1,Direction.EAST);
        new Wall (As, 1, 1,Direction.NORTH);
        new Wall (As, 2, 2,Direction.NORTH);
        new Wall (As, 2, 2,Direction.WEST);
        new Wall (As, 3, 2,Direction.WEST);
        new Wall (As, 3, 2,Direction.SOUTH);
        new Wall (As, 3, 3,Direction.SOUTH);
        new Wall (As, 3, 3,Direction.EAST);
        new Wall (As, 2, 3,Direction.EAST);
        new Wall (As, 2, 3,Direction.NORTH);
        new Wall (As, 1, 4,Direction.SOUTH);
        new Wall (As, 1, 4,Direction.EAST);
        new Wall (As, 1, 4,Direction.NORTH);
        new Wall (As, 1, 4,Direction.WEST);
        new Wall (As, 4, 1,Direction.NORTH);
        new Wall (As, 4, 1,Direction.SOUTH);
        new Wall (As, 4, 1,Direction.EAST);
        new Wall (As, 4, 1,Direction.WEST);
        new Wall (As, 4, 4,Direction.NORTH);
        new Wall (As, 4, 4,Direction.SOUTH);
        new Wall (As, 4, 4,Direction.WEST);
        new Wall (As, 4, 4,Direction.EAST);
        
        //Get Zoom to move
        while (Zoom.frontIsClear()){
            Zoom.move();
            Zoom.move();
            Zoom.turnLeft();
            Zoom.turnLeft();
            Zoom.turnLeft();
            Zoom.move();
            Zoom.turnLeft();
            Zoom.move();
            Zoom.turnLeft();
            Zoom.move();
            Zoom.turnLeft();
            Zoom.turnLeft();
            Zoom.turnLeft();
            Zoom.move();
            Zoom.move();
            Zoom.turnLeft();
            Zoom.turnLeft();
            Zoom.turnLeft();
            
                    
                   
            
        }
            
            
            
           
                
                
                
                
            }
        }       
                
            
            
        
        
                
    

