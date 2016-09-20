
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
 * @author micla1676
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Thingcity = new City();
        
        //create robot
        
        Robot karel = new Robot (Thingcity,1,1,Direction.EAST);
        
        //create things
        
        new Thing (Thingcity,1,2);
        new Thing (Thingcity,1,3);
        new Thing (Thingcity,1,4);
        new Thing (Thingcity,1,5);
        new Thing (Thingcity,1,6);
        new Thing (Thingcity,1,7);
        new Thing (Thingcity,1,8);
        new Thing (Thingcity,1,9);
        new Thing (Thingcity,1,10);
        new Thing (Thingcity,1,11);
        
        //create integer
        
        int moves = 0;
        
        while (moves < 7){
            karel.move();
            karel.pickThing();
            moves = moves + 1;
        }
        
        karel.move();
        
        
        
        if(karel.canPickThing()){
            karel.move();
            goto
        }
            
        
    }
}
