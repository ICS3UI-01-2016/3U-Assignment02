
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
 * @author fabed2976
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City PH = new City ();
        Robot Kris = new Robot (PH, 0,0, Direction. EAST);
        
        new Wall (PH, 1,1, Direction.EAST);
        new Wall (PH, 1,1, Direction. WEST);
        new Wall (PH, 1,1, Direction. NORTH);
        new Wall (PH, 1,1, Direction. SOUTH);
        new Wall (PH, 1,4, Direction. EAST);
        new Wall (PH, 1,4, Direction. WEST);
        new Wall (PH, 1,4, Direction. NORTH);
        new Wall (PH, 1,4, Direction. SOUTH);
        new Wall (PH, 4,4, Direction. EAST);
        new Wall (PH, 4,4, Direction. WEST);
        new Wall (PH, 4,4, Direction. NORTH);
        new Wall (PH, 4,4, Direction. SOUTH);
        new Wall (PH, 4,1, Direction.EAST);
        new Wall (PH, 4,1, Direction. WEST);
        new Wall (PH, 4,1, Direction. NORTH);
        new Wall (PH, 4,1, Direction. SOUTH);
        new Wall (PH, 2,2, Direction. WEST);
        new Wall (PH, 2,3, Direction. EAST);
        new Wall (PH, 2,2, Direction. WEST);
        new Wall (PH, 2,2, Direction. NORTH);
        new Wall (PH, 2,3, Direction. NORTH);
        new Wall (PH, 3,3, Direction. EAST);
        new Wall (PH, 3,2, Direction. WEST);
        new Wall (PH, 3,2, Direction. SOUTH);
        new Wall (PH, 3,3, Direction. SOUTH);
        
        while (Kris.frontIsClear()){
            Kris.move();
            Kris.move();
            Kris.turnLeft();
            Kris.turnLeft();
            Kris.turnLeft();
            Kris.move();
            Kris.turnLeft();
            Kris.move();
            Kris.turnLeft();
            Kris.move();
            Kris.turnLeft();
            Kris.turnLeft();
            Kris.turnLeft();
            Kris.move();
            Kris.move();
            Kris.turnLeft();
            Kris.turnLeft();
            Kris.turnLeft();
           
            
            
       
            
        
         
                
                
                
            }
            
                   
            
              
       
       
               
        
    }
}




                
                
            
            
            
            
        
        
        
    
    



