
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE jim = new RobotSE(kw,3,1,Direction.EAST);
        jim.setLabel("Jim");
        jim.setColor(Color.blue);
        new Wall(kw,3,1,Direction.SOUTH);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,3,4,Direction.SOUTH);
        new Wall(kw,3,5,Direction.SOUTH);
        new Wall(kw,3,6,Direction.SOUTH);
        new Wall(kw,3,7,Direction.SOUTH);
        new Wall(kw,3,8,Direction.SOUTH);
        new Wall(kw,3,9,Direction.SOUTH);
        new Wall(kw,3,1,Direction.EAST);
        new Wall(kw,3,2,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        new Wall(kw,3,7,Direction.EAST);
        Thing thing = new Thing(kw,3,9);
        thing.setColor(Color.red);
        while(!jim.canPickThing()){
            if(!jim.frontIsClear()){
                jim.turnLeft();
                jim.move();
                jim.turnRight();
                jim.move();
                jim.turnRight();
                jim.move();
                jim.turnLeft();
            }
            else if(jim.frontIsClear()){
                jim.move();
            }
        }
    }
}
