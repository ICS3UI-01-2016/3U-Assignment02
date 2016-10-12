
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City PH = new City ();
        Robot kris = new Robot (PH, 3,5, Direction. EAST);
        
        //get Kris to move
        kris.turnLeft();
        kris.turnLeft();
        
        while(kris.getDirection() == Direction.WEST && kris.getAvenue () !=0 ){
                kris.move();
        }      
        kris.turnLeft();
        kris.turnLeft();
        kris.turnLeft();
        
        while (kris.getDirection() ==Direction.NORTH && kris.getStreet() !=0){
            kris.move();
        }
        
        }
        
    }



