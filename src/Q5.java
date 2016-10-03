
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot e = new Robot(JT,1,4,Direction.SOUTH);
        //create walls
        new Wall(JT,1,1,Direction.WEST);
        new Wall(JT,2,1,Direction.WEST);
        new Wall(JT,3,1,Direction.WEST);
        new Wall(JT,4,1,Direction.WEST);
        new Wall(JT,5,1,Direction.WEST);
        new Wall(JT,6,1,Direction.WEST);
        new Wall(JT,7,1,Direction.WEST);
        new Wall(JT,8,1,Direction.WEST);
        new Wall(JT,9,1,Direction.WEST);
        new Wall(JT,10,1,Direction.WEST);
        new Wall(JT,1,3,Direction.EAST);
        new Wall(JT,2,3,Direction.EAST);
        new Wall(JT,3,3,Direction.EAST);
        new Wall(JT,4,3,Direction.EAST);
        new Wall(JT,5,3,Direction.EAST);
        new Wall(JT,6,3,Direction.EAST);
        new Wall(JT,7,3,Direction.EAST);
        new Wall(JT,8,3,Direction.EAST);
        new Wall(JT,9,3,Direction.EAST);
        new Wall(JT,10,3,Direction.EAST);
        new Wall(JT,1,4,Direction.EAST);
        new Wall(JT,4,4,Direction.EAST);
        new Wall(JT,2,8,Direction.NORTH);
        new Wall(JT,2,5,Direction.NORTH);
        new Wall(JT,2,6,Direction.NORTH);
        new Wall(JT,2,7,Direction.NORTH);
        new Wall(JT,2,8,Direction.EAST);
        new Wall(JT,3,8,Direction.EAST);
        new Wall(JT,3,8,Direction.SOUTH);
        new Wall(JT,3,5,Direction.SOUTH);
        new Wall(JT,3,6,Direction.SOUTH);
        new Wall(JT,3,7,Direction.SOUTH);
        new Wall(JT,5,5,Direction.NORTH);
        new Wall(JT,5,6,Direction.NORTH);
        new Wall(JT,5,7,Direction.NORTH);
        new Wall(JT,5,7,Direction.EAST);
        new Wall(JT,5,5,Direction.SOUTH);
        new Wall(JT,5,6,Direction.SOUTH);
        new Wall(JT,5,7,Direction.SOUTH);
        new Wall(JT,6,4,Direction.EAST);
        new Wall(JT,7,4,Direction.EAST);
        new Wall(JT,8,5,Direction.NORTH);
        new Wall(JT,8,6,Direction.NORTH);
        new Wall(JT,8,7,Direction.NORTH);
        new Wall(JT,8,8,Direction.NORTH);
        new Wall(JT,8,9,Direction.NORTH);
        new Wall(JT,8,9,Direction.EAST);
        new Wall(JT,9,9,Direction.EAST);
        new Wall(JT,9,5,Direction.SOUTH);
        new Wall(JT,9,6,Direction.SOUTH);
        new Wall(JT,9,7,Direction.SOUTH);
        new Wall(JT,9,8,Direction.SOUTH);
        new Wall(JT,9,9,Direction.SOUTH);
        new Wall(JT,10,4,Direction.EAST);
        new Wall(JT,10,4,Direction.SOUTH);
        //create 'snow'
        new Thing(JT,2,4,Direction.EAST);
        new Thing(JT,2,5,Direction.EAST);
        new Thing(JT,2,6,Direction.EAST);
        new Thing(JT,2,7,Direction.EAST);
        new Thing(JT,3,4,Direction.EAST);
        new Thing(JT,3,6,Direction.EAST);
        new Thing(JT,3,8,Direction.EAST);
        new Thing(JT,5,4,Direction.EAST);
        new Thing(JT,5,5,Direction.EAST);
        new Thing(JT,5,6,Direction.EAST);
        new Thing(JT,8,4,Direction.EAST);
        new Thing(JT,8,5,Direction.EAST);
        new Thing(JT,8,9,Direction.EAST);
        new Thing(JT,9,5,Direction.EAST);
        new Thing(JT,9,6,Direction.EAST);
        new Thing(JT,9,8,Direction.EAST);
        //pickupsnow
        while(e.frontIsClear()){
            e.move();
            if(e.canPickThing()){
                e.pickThing();
            }if(!e.isBesideThing(IPredicate.aWall)){
                e.turnLeft();
            }if(!e.frontIsClear()){
                e.turnLeft();
                e.turnLeft();
                e.turnLeft();
            }if(!e.frontIsClear()){
                e.turnLeft();
                e.turnLeft();
                e.turnLeft();
            }if(e.getAvenue()==4 && e.getStreet()==10){
                break;
    }
}   
}
}