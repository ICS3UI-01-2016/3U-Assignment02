
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
 * @author smith3577
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener,1,1,Direction.EAST);
        new Thing(Kitchener,1,2);
        new Thing(Kitchener,1,3);
        new Thing(Kitchener,1,4);
        new Thing(Kitchener,1,5);
        new Thing(Kitchener,1,6);
        new Thing(Kitchener,1,7);
        new Thing(Kitchener,1,8);
        new Thing(Kitchener,1,9);
        new Thing(Kitchener,1,10);
        
        karel.move();
        int moves = 0;
        while (moves < 6){  
        karel.pickThing();
        karel.move();
        moves = moves + 1;
        }
        while (karel.canPickThing()){
        karel.move();
        }
        }
        }
        
    

