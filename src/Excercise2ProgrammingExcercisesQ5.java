
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
 * @author manok5757
 */
public class Excercise2ProgrammingExcercisesQ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        
        // create robot
        Robot cliff = new Robot(km,0,3,Direction.SOUTH);
        
        // create roads, sidewa;l , and driveway
        new Wall (km,0,1,Direction.WEST);
        new Wall (km,1,1,Direction.WEST);
        new Wall (km,2,1,Direction.WEST);
        new Wall (km,3,1,Direction.WEST);
        new Wall (km,4,1,Direction.WEST);
        new Wall (km,5,1,Direction.WEST);
        new Wall (km,6,1,Direction.WEST);
        new Wall (km,7,1,Direction.WEST);
        new Wall (km,8,1,Direction.WEST);
        new Wall (km,9,1,Direction.WEST);
        
        new Wall (km,0,2,Direction.EAST);
        new Wall (km,1,2,Direction.EAST);
        new Wall (km,2,2,Direction.EAST);
        new Wall (km,3,2,Direction.EAST);
        new Wall (km,4,2,Direction.EAST);
        new Wall (km,5,2,Direction.EAST);
        new Wall (km,6,2,Direction.EAST);
        new Wall (km,7,2,Direction.EAST);
        new Wall (km,8,2,Direction.EAST);
        new Wall (km,9,2,Direction.EAST);
        
        new Wall (km,9,3,Direction.SOUTH);
        new Wall (km,8,4,Direction.SOUTH);
        new Wall (km,8,5,Direction.SOUTH);
        new Wall (km,8,6,Direction.SOUTH);
        new Wall (km,8,7,Direction.SOUTH);
        new Wall (km,8,8,Direction.SOUTH);
        new Wall (km,4,4,Direction.SOUTH);
        new Wall (km,4,5,Direction.SOUTH);
        new Wall (km,4,6,Direction.SOUTH);
        new Wall (km,2,4,Direction.SOUTH);
        new Wall (km,2,5,Direction.SOUTH);
        new Wall (km,2,6,Direction.SOUTH);
        new Wall (km,2,7,Direction.SOUTH);
       
        
        new Wall (km,0,3,Direction.EAST);
        new Wall (km,3,3,Direction.EAST);
        new Wall (km,5,3,Direction.EAST);
        new Wall (km,6,3,Direction.EAST);
        new Wall (km,1,7,Direction.EAST);
        new Wall (km,2,7,Direction.EAST);
        new Wall (km,4,6,Direction.EAST);
        new Wall (km,7,8,Direction.EAST);
        new Wall (km,8,8,Direction.EAST);
        new Wall (km,9,3,Direction.EAST);
        
        new Wall (km,1,4,Direction.NORTH);
        new Wall (km,1,5,Direction.NORTH);
        new Wall (km,1,6,Direction.NORTH);
        new Wall (km,1,7,Direction.NORTH);
        new Wall (km,4,4,Direction.NORTH);
        new Wall (km,4,5,Direction.NORTH);
        new Wall (km,4,6,Direction.NORTH);
        new Wall (km,7,4,Direction.NORTH);
        new Wall (km,7,5,Direction.NORTH);
        new Wall (km,7,6,Direction.NORTH);
        new Wall (km,7,7,Direction.NORTH);
        new Wall (km,7,8,Direction.NORTH);
        
        // put snow in sidewalk
        
   
    
    
    
    
    
    
    
    
    
    }
}
