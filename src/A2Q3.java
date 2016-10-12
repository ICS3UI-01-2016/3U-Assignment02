
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        
        // create a robot
        Robot karel = new Robot(kw,2,10,Direction.SOUTH);
        
        // get karel to move back to (0,0)
        while(karel.getDirection()!=Direction.NORTH){
            karel.turnLeft();
        }
        while(karel.getStreet()!=0){
            karel.move();   
        }
        karel.turnLeft();
                
        while(karel.getAvenue()!=0){
            karel.move();
        }
    }
}
