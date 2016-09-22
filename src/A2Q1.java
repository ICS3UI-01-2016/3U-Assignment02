
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE Jim = new RobotSE(kw,1,1,Direction.EAST);
        Jim.setLabel("Jim");
        Jim.setColor(Color.blue);
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
        Jim.move();
        while(Jim.isBesideThing(IPredicate.aThing)){
            if(Jim.countThingsInBackpack()<7){
                Jim.pickThing();
            }
            Jim.move();
        }
    }
}
