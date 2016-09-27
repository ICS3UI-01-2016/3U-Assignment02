
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //place candice somewhere
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,3,7,Direction.EAST);
            //get candice to always return to (0,0)
            while(candice.getAvenue()!=0)
            {
                while(candice.getDirection()!=Direction.WEST)
                {
                    candice.turnLeft();
                }
                    candice.move();                      
            }
            
            while(candice.getStreet()!=0)
            {
                while(candice.getDirection()!=Direction.NORTH)
                {
                    candice.turnLeft();
                }
                    candice.move();                      
            }
            
    }
}
