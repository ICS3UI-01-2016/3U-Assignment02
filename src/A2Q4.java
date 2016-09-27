
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
 * @author smith3577
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City Kitchener = new City();
    Robot karel = new Robot(Kitchener,1,1,Direction.EAST);
    new Wall(Kitchener,1,2,Direction.SOUTH);
    new Wall(Kitchener,1,3,Direction.SOUTH);
    new Wall(Kitchener,1,4,Direction.SOUTH);
    new Wall(Kitchener,1,5,Direction.SOUTH);
    new Wall(Kitchener,1,6,Direction.SOUTH);
    new Wall(Kitchener,1,7,Direction.SOUTH);
    new Wall(Kitchener,1,8,Direction.SOUTH);
    new Wall(Kitchener,1,9,Direction.SOUTH);
    new Wall(Kitchener,1,3,Direction.EAST);
    new Wall(Kitchener,1,5,Direction.EAST);
    new Wall(Kitchener,1,7,Direction.EAST);
    new Thing(Kitchener,1,9);

    while(karel.frontIsClear()){
        karel.move();
        if(karel.canPickThing())
            break;
        if (!karel.frontIsClear()){
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();      
    }
    }
    }
    }

