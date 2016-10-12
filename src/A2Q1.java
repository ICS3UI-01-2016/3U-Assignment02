
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();
        
        // new robot
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        // create thing
        new Thing(kw,1,2);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        new Thing(kw,1,11);
        
        // get robot to move
        
        int moves = 0;
        
        while(moves < 7){
            karel.move();
            karel.pickThing();
            if (karel.countThingsInBackpack() == 7){
                karel.move();
                karel.move();
                karel.move();
                karel.move();
            }
            
            moves = moves + 1;
            
        }
        
            
       
        
            
            
        
    }
}
