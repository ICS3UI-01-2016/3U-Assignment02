
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City q1 = new City();
        Robot rick = new Robot(q1,1,1,Direction.EAST);
        rick.setColor(Color.BLACK);
        
        new Thing(q1,1,2);
        new Thing(q1,1,3);
        new Thing(q1,1,4);
        new Thing(q1,1,5);
        new Thing(q1,1,6);
        new Thing(q1,1,7);
        new Thing(q1,1,8);
        new Thing(q1,1,9);
        new Thing(q1,1,10);
        new Thing(q1,1,11);
        
        while(rick.frontIsClear()){
            rick.move();
            if(rick.countThingsInBackpack()<=6){
                rick.pickThing();
                }else if(rick.countThingsInBackpack()>=6){
                    rick.move();
                    rick.move();
                    rick.move();
                    break;
                }
            }
        }
    }    

