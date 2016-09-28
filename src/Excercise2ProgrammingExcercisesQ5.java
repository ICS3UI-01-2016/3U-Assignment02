
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
        new Wall (km,0,0,Direction.WEST);
        new Wall (km,1,0,Direction.WEST);
        new Wall (km,2,0,Direction.WEST);
        new Wall (km,3,0,Direction.WEST);
        new Wall (km,4,0,Direction.WEST);
        new Wall (km,5,0,Direction.WEST);
        new Wall (km,6,0,Direction.WEST);
        new Wall (km,7,0,Direction.WEST);
        new Wall (km,8,0,Direction.WEST);
        
        new Wall (km,0,2,Direction.EAST);
        new Wall (km,1,2,Direction.EAST);
        new Wall (km,2,2,Direction.EAST);
        new Wall (km,3,2,Direction.EAST);
        new Wall (km,4,2,Direction.EAST);
        new Wall (km,5,2,Direction.EAST);
        new Wall (km,6,2,Direction.EAST);
        new Wall (km,7,2,Direction.EAST);
        new Wall (km,8,2,Direction.EAST);
        
        new Wall (km,0,3,Direction.EAST);
        new Wall (km,3,3,Direction.EAST);
        new Wall (km,5,3,Direction.EAST);
        new Wall (km,6,3,Direction.EAST);
        
        new Wall (km,1,4,Direction.NORTH);
        new Wall (km,1,5,Direction.NORTH);
        new Wall (km,1,6,Direction.NORTH);
        new Wall (km,1,7,Direction.NORTH);
        new Wall (km, ,1,Direction.EAST);
        new Wall (km,9,2,Direction.EAST);
        
   
    
    
    
    
    
    
    
    
    
    }
}
