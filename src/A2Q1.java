
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
 * @author awadb3223
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        
        //create Robot
        Robot bob = new Robot(kw,1,1,Direction.EAST);
        
        //create things
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
       
        while (bob.countThingsInBackpack() !=7){
            bob.move();
            bob.pickThing();
     
        }
        
        if (bob.getAvenue() !=12){
            bob.move();
            bob.move();
            bob.move();
            bob.move();
            
        }
}
}

