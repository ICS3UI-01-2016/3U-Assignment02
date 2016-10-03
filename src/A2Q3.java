
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City alabama = new City ();
        
        //create the Robot
        Robot forrest = new Robot (alabama,6,9,Direction.SOUTH);
        
        //make a loop to make Forrest Run HOME!!! RUN FORREST RUUN
        while (forrest.getStreet()!=0){
            if (forrest.getDirection()==Direction.NORTH)
                forrest.move();
         else
                forrest.turnLeft();
        }
        
        
        
        while (forrest.getAvenue()!=0){
            if (forrest.getDirection()==Direction.WEST)
                forrest.move();
            else{ forrest.turnLeft();
        }     
}
}
}