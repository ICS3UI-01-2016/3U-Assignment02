
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City bd = new City();
        //create a robot
        Robot bu = new Robot(bd, 4, 0, Direction.EAST);

        //placing walls

        new Wall(bd, 4, 2, Direction.WEST);
        new Wall(bd, 4, 2, Direction.NORTH);
        new Wall(bd, 3, 3, Direction.WEST);
        new Wall(bd, 3, 3, Direction.NORTH);
        new Wall(bd, 2, 4, Direction.WEST);
        new Wall(bd, 2, 4, Direction.NORTH);
        new Wall(bd, 2, 5, Direction.NORTH);
        new Wall(bd, 2, 5, Direction.EAST);
        new Wall(bd, 3, 6, Direction.NORTH);
        new Wall(bd, 3, 6, Direction.EAST);
        new Wall(bd, 4, 7, Direction.NORTH);
        new Wall(bd, 4, 7, Direction.EAST);

        //placing things
        new Thing(bd, 4, 1);
        new Thing(bd, 3, 2);
        new Thing(bd, 2, 3);
        new Thing(bd, 1, 4);

        //retreiving things
        bu.move();
        bu.pickThing();
        bu.turnLeft();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.pickThing();
        bu.turnLeft();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.pickThing();
        bu.turnLeft();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.pickThing();
        bu.move();
        bu.putThing();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.putThing();
        bu.turnLeft();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.putThing();
        bu.turnLeft();
        bu.move();
        bu.turnLeft();
        bu.turnLeft();
        bu.turnLeft();
        bu.move();
        bu.putThing();
        bu.turnLeft();
        bu.move();



    }
}
