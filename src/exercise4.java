
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
 * @author vandl4973
 */
public class exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City SA= new City();
        new Wall(SA,1,1,Direction.WEST);
        new Wall(SA,1,1,Direction.NORTH);
        new Wall(SA,1,1,Direction.EAST);
        new Wall(SA,1,1,Direction.SOUTH);
        new Wall(SA,2,2,Direction.WEST);
        new Wall(SA,3,2,Direction.WEST);
        new Wall(SA,4,1,Direction.WEST);
        new Wall(SA,4,1,Direction.NORTH);
        new Wall(SA,4,1,Direction.SOUTH);
        new Wall(SA,4,1,Direction.EAST);
        new Wall(SA,3,2,Direction.SOUTH);
        new Wall(SA,3,3,Direction.SOUTH);
        new Wall(SA,2,2,Direction.NORTH);
        new Wall(SA,2,3,Direction.NORTH);
        new Wall(SA,1,4,Direction.WEST);
        new Wall(SA,1,4,Direction.SOUTH);
        new Wall(SA,1,4,Direction.EAST);
        new Wall(SA,1,4,Direction.NORTH);
        new Wall(SA,2,3,Direction.EAST);
        new Wall(SA,3,3,Direction.EAST);
        new Wall(SA,4,4,Direction.EAST);
        new Wall(SA,4,4,Direction.WEST);
        new Wall(SA,4,4,Direction.SOUTH);
        new Wall(SA,4,4,Direction.NORTH);
        Robot bob =new Robot (SA,0,0,Direction.EAST);
        while (!bob.canPickThing()) {
        bob.move();
        bob.move();
        bob.turnLeft();bob.turnLeft();bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
    }
}
}
