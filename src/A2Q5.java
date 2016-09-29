
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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE jim = new RobotSE(kw,0,2,Direction.SOUTH);
        jim.setColor(Color.blue);
        jim.setLabel("Jim");
        RobotSE ben = new RobotSE(kw,0,2,Direction.SOUTH);
        ben.setColor(Color.green);
        ben.setLabel("Ben");
        new Wall(kw,0,1,Direction.EAST);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,2,1,Direction.EAST);
        new Wall(kw,3,1,Direction.EAST);
        new Wall(kw,4,1,Direction.EAST);
        new Wall(kw,5,1,Direction.EAST);
        new Wall(kw,6,1,Direction.EAST);
        new Wall(kw,7,1,Direction.EAST);
        new Wall(kw,8,1,Direction.EAST);
        new Wall(kw,9,1,Direction.EAST);
        new Wall(kw,0,0,Direction.WEST);
        new Wall(kw,1,0,Direction.WEST);
        new Wall(kw,2,0,Direction.WEST);
        new Wall(kw,3,0,Direction.WEST);
        new Wall(kw,4,0,Direction.WEST);
        new Wall(kw,5,0,Direction.WEST);
        new Wall(kw,6,0,Direction.WEST);
        new Wall(kw,7,0,Direction.WEST);
        new Wall(kw,8,0,Direction.WEST);
        new Wall(kw,9,0,Direction.WEST);
        new Wall(kw,0,2,Direction.EAST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,6,Direction.NORTH);
        new Wall(kw,1,6,Direction.EAST);
        new Wall(kw,2,6,Direction.EAST);
        new Wall(kw,2,6,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,3,2,Direction.EAST);
        new Wall(kw,4,3,Direction.NORTH);
        new Wall(kw,4,3,Direction.SOUTH);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.SOUTH);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,4,5,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        new Wall(kw,6,2,Direction.EAST);
        new Wall(kw,7,3,Direction.NORTH);
        new Wall(kw,7,4,Direction.NORTH);
        new Wall(kw,7,5,Direction.NORTH);
        new Wall(kw,7,6,Direction.NORTH);
        new Wall(kw,7,7,Direction.NORTH);
        new Wall(kw,7,7,Direction.EAST);
        new Wall(kw,8,7,Direction.EAST);
        new Wall(kw,8,7,Direction.SOUTH);
        new Wall(kw,8,6,Direction.SOUTH);
        new Wall(kw,8,5,Direction.SOUTH);
        new Wall(kw,8,4,Direction.SOUTH);
        new Wall(kw,8,3,Direction.SOUTH);
        new Wall(kw,9,2,Direction.EAST);
        new Wall(kw,9,2,Direction.SOUTH);
        Thing thing1 = new Thing(kw,1,2);
        thing1.setColor(Color.white);
        Thing thing2 = new Thing(kw,2,2);
        thing2.setColor(Color.white);
        Thing thing3 = new Thing(kw,4,2);
        thing3.setColor(Color.white);
        Thing thing4 = new Thing(kw,7,2);
        thing4.setColor(Color.white);
        Thing thing5 = new Thing(kw,1,3);
        thing5.setColor(Color.white);
        Thing thing6 = new Thing(kw,4,3);
        thing6.setColor(Color.white);
        Thing thing7 = new Thing(kw,7,3);
        thing7.setColor(Color.white);
        Thing thing8 = new Thing(kw,8,3);
        thing8.setColor(Color.white);
        Thing thing9 = new Thing(kw,1,4);
        thing9.setColor(Color.white);
        Thing thing10 = new Thing(kw,2,4);
        thing10.setColor(Color.white);
        Thing thing11 = new Thing(kw,4,4);
        thing11.setColor(Color.white);
        Thing thing12 = new Thing(kw,8,4);
        thing12.setColor(Color.white);
        Thing thing13 = new Thing(kw,1,5);
        thing13.setColor(Color.white);
        Thing thing14 = new Thing(kw,2,6);
        thing14.setColor(Color.white);
        Thing thing15 = new Thing(kw,8,6);
        thing15.setColor(Color.white);
        Thing thing16 = new Thing(kw,7,7);
        thing16.setColor(Color.white);
        while(true){
            if(jim.frontIsClear()&&jim.isFacingEast()){
                jim.move();
                if(jim.canPickThing()){
                    jim.pickThing();
                }
            }
            else if(jim.frontIsClear()&&jim.getAvenue()==2){
                jim.turnLeft();
            }
            else if(!jim.frontIsClear()&&jim.getAvenue()==2){
                jim.turnRight();
                if(jim.frontIsClear()){
                    jim.move();
            }
                else if(!jim.frontIsClear()){
                    jim.turnLeft();
                    break;
                }
            }
            else if(!jim.frontIsClear()){
                jim.turnAround();
                while(jim.frontIsClear()){
                    jim.move();
                }
                jim.putAllThings();
                jim.turnLeft();
                jim.move();
            }
        }
        while(ben.frontIsClear()){
            if(ben.canPickThing()){
                ben.pickAllThings();
            }
            ben.move();
        }
        ben.putAllThings();
    }
}
