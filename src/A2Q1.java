
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author islai1669
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot Lamont = new Robot(tdot, 1, 1, Direction.EAST);
        new Thing(tdot, 1, 2);
        new Thing(tdot, 1, 3);
        new Thing(tdot, 1, 4);
        new Thing(tdot, 1, 5);
        new Thing(tdot, 1, 6);
        new Thing(tdot, 1, 7);
        new Thing(tdot, 1, 8);
        new Thing(tdot, 1, 9);
        new Thing(tdot, 1, 10);
        new Thing(tdot, 1, 11);


        while (Lamont.frontIsClear()) {
            Lamont.move();
            if (Lamont.canPickThing()) {
                if (Lamont.countThingsInBackpack() < 7) {
                    Lamont.pickThing();
               
             if (Lamont.getAvenue() == 12){
                break;
                 
                }
                }
                
                }
            }

       }

    }

