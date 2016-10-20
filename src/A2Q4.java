
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
        City as = new City();
        Robot zoom = new Robot (as, 0, 0, Direction.EAST);
        
        //Create Walls
        new Wall (as, 1, 1,Direction.NORTH);
        new Wall (as, 1, 1,Direction.WEST);
        new Wall (as, 1, 1,Direction.SOUTH);
        new Wall (as, 1, 1,Direction.EAST);
        new Wall (as, 1, 1,Direction.NORTH);
        new Wall (as, 2, 2,Direction.NORTH);
        new Wall (as, 2, 2,Direction.WEST);
        new Wall (as, 3, 2,Direction.WEST);
        new Wall (as, 3, 2,Direction.SOUTH);
        new Wall (as, 3, 3,Direction.SOUTH);
        new Wall (as, 3, 3,Direction.EAST);
        new Wall (as, 2, 3,Direction.EAST);
        new Wall (as, 2, 3,Direction.NORTH);
        new Wall (as, 1, 4,Direction.SOUTH);
        new Wall (as, 1, 4,Direction.EAST);
        new Wall (as, 1, 4,Direction.NORTH);
        new Wall (as, 1, 4,Direction.WEST);
        new Wall (as, 4, 1,Direction.NORTH);
        new Wall (as, 4, 1,Direction.SOUTH);
        new Wall (as, 4, 1,Direction.EAST);
        new Wall (as, 4, 1,Direction.WEST);
        new Wall (as, 4, 4,Direction.NORTH);
        new Wall (as, 4, 4,Direction.SOUTH);
        new Wall (as, 4, 4,Direction.WEST);
        new Wall (as, 4, 4,Direction.EAST);
        
        // When the front is clear move around the corner into the divot and back up around the second corner.
        while (zoom.frontIsClear()){
               zoom.move();
               zoom.move();
               zoom.turnLeft();
               zoom.turnLeft();
               zoom.turnLeft();
               zoom.move();
               zoom.turnLeft();
               zoom.move();
               zoom.turnLeft();
               zoom.move();
               zoom.turnLeft();
               zoom.turnLeft();
               zoom.turnLeft();
               zoom.move();
               // Get zoom to move and turn right in order to be in the same postion that he started in.
               zoom.move();
               zoom.turnLeft();
               zoom.turnLeft();
               zoom.turnLeft();
            
                    
                   
            
        }
            
            
            
           
                
                
                
                
            }
        }       
                
            
            
        
        
                
    

