
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //craete a city 
        City kpl = new City();
        
         //create a Robot
         Robot obama = new Robot (kpl,8,9,Direction.SOUTH);
         
         //make a loop to make obama go home
         while (obama.getStreet()!=0){
            if (obama.getDirection()==Direction.NORTH)
                 obama.move();
          else
                 obama.turnLeft();
         }
         while (obama.getAvenue()!=0){
             if (obama.getDirection()==Direction.WEST)
                 obama.move();
             else{ obama.turnLeft();
         }     
    }
    }
}
