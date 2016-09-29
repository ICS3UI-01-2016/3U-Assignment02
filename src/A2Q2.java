
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
 * @author messr2578
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //integers
        int things = -1;
        //basic startup for a single robot
        City kw = new City();
        Robot Karel = new Robot(kw, 1, 1, Direction.EAST);
        //create walls and a thing
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.EAST);
        new Wall(kw, 1, 9, Direction.SOUTH);
        new Wall(kw, 1, 10, Direction.SOUTH);
        new Thing(kw, 1, 10);
        //make karel jumps the hurdels
        while (Karel.getAvenue() <= 8) {
            while (Karel.frontIsClear()) {
                Karel.move();
            }
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
        }
        Karel.move();
    }
}
