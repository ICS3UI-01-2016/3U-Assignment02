
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q1 = new City();
        // Create a robot
          Robot bob = new Robot(a1q1,1,1,Direction.EAST);
        // make things
          Thing t;  
            t = new Thing(a1q1,1,2);
            t = new Thing(a1q1,1,3);
            t = new Thing(a1q1,1,4);
            t = new Thing(a1q1,1,5);
            t = new Thing(a1q1,1,6);
            t = new Thing(a1q1,1,7);
            t = new Thing(a1q1,1,8);
            t = new Thing(a1q1,1,9);
            t = new Thing(a1q1,1,10);
            t = new Thing(a1q1,1,11);
            t.setColor(Color.cyan);
         // pick things
            while(bob.countThingsInBackpack() <7){
                bob.move();
                bob.pickThing();}
            if(bob.countThingsInBackpack()==7)
                bob.move();
                bob.move();
                bob.move();
                bob.move();
                        
                
                
                
            
            
    }
}
                
                
         
         
         
   


