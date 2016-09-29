
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A2q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City kw = new City();

        //make castle
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);

        Robot dave = new Robot(kw, 0, 0, Direction.EAST);

        //Make guard move around one side of castle

        while (dave.getAvenue() < 10) {
            dave.move();
            dave.move();
            dave.turnLeft();
            dave.turnLeft();
            dave.turnLeft();
            dave.move();
            dave.turnLeft();
            dave.move();
            dave.turnLeft();
            dave.move();
            dave.turnLeft();
            dave.turnLeft();
            dave.turnLeft();
            dave.move();
            dave.move();
            dave.turnLeft();
            dave.turnLeft();
            dave.turnLeft();

        }

    }
}
