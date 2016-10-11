
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
 * @author ANNT0773
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot a = new Robot(kw, 1, 1, Direction.EAST);

        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 9, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 2, Direction.WEST);
        new Wall(kw, 1, 7, Direction.WEST);
        new Wall(kw, 1, 9, Direction.WEST);

        new Thing(kw, 1, 9);

        while (!a.canPickThing()) {
            if (a.frontIsClear()) {
                a.move();
            }

            if (!a.frontIsClear()) {
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move(); 
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
            }
           

        // TODO code application logic here
    }
}
}
