
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
 * @author wangk9757
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kw = new City();

        //create Robot
        Robot kiran = new Robot(kw, 1, 1, Direction.EAST);
        //create many things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        //get kiran to pick up 7 things and skip over the next 3 
        while(kiran.countThingsInBackpack()!=7 ){
         kiran.move();
         kiran.pickThing();    
             }
        kiran.move();
        kiran.move();
        kiran.move();
        kiran.move();
        }
    }
    

