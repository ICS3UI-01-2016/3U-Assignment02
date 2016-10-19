
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
 * @author vandl4973
 */
public class execise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City CA = new City();
        new Wall(CA, 0, 0, Direction.WEST);
        new Wall(CA, 1, 0, Direction.WEST);
        new Wall(CA, 2, 0, Direction.WEST);
        new Wall(CA, 3, 0, Direction.WEST);
        new Wall(CA, 4, 0, Direction.WEST);
        new Wall(CA, 5, 0, Direction.WEST);
        new Wall(CA, 6, 0, Direction.WEST);
        new Wall(CA, 7, 0, Direction.WEST);
        new Wall(CA, 8, 0, Direction.WEST);
        new Wall(CA, 9, 0, Direction.WEST);
        new Wall(CA, 0, 1, Direction.EAST);
        new Wall(CA, 1, 1, Direction.EAST);
        new Wall(CA, 2, 1, Direction.EAST);
        new Wall(CA, 3, 1, Direction.EAST);
        new Wall(CA, 4, 1, Direction.EAST);
        new Wall(CA, 5, 1, Direction.EAST);
        new Wall(CA, 6, 1, Direction.EAST);
        new Wall(CA, 7, 1, Direction.EAST);
        new Wall(CA, 8, 1, Direction.EAST);
        new Wall(CA, 9, 1, Direction.EAST);
        new Wall(CA, 0, 2, Direction.EAST);
        new Wall(CA, 3, 2, Direction.EAST);
        new Wall(CA, 5, 2, Direction.EAST);
        new Wall(CA, 6, 2, Direction.EAST);
        new Wall(CA, 9, 2, Direction.EAST);
        new Wall(CA, 1, 3, Direction.NORTH);
        new Wall(CA, 1, 4, Direction.NORTH);
        new Wall(CA, 1, 5, Direction.NORTH);
        new Wall(CA, 1, 6, Direction.NORTH);
        new Wall(CA, 1, 6, Direction.EAST);
        new Wall(CA, 2, 6, Direction.EAST);
        new Wall(CA, 2, 6, Direction.SOUTH);
        new Wall(CA, 2, 5, Direction.SOUTH);
        new Wall(CA, 2, 4, Direction.SOUTH);
        new Wall(CA, 2, 3, Direction.SOUTH);
        new Wall(CA, 4, 3, Direction.NORTH);
        new Wall(CA, 4, 4, Direction.NORTH);
        new Wall(CA, 4, 5, Direction.NORTH);
        new Wall(CA, 4, 3, Direction.SOUTH);
        new Wall(CA, 4, 4, Direction.SOUTH);
        new Wall(CA, 4, 5, Direction.SOUTH);
        new Wall(CA, 4, 5, Direction.EAST);
        new Wall(CA, 8, 3, Direction.SOUTH);
        new Wall(CA, 8, 4, Direction.SOUTH);
        new Wall(CA, 8, 5, Direction.SOUTH);
        new Wall(CA, 8, 6, Direction.SOUTH);
        new Wall(CA, 8, 7, Direction.SOUTH);
        new Wall(CA, 7, 3, Direction.NORTH);
        new Wall(CA, 7, 4, Direction.NORTH);
        new Wall(CA, 7, 5, Direction.NORTH);
        new Wall(CA, 7, 6, Direction.NORTH);
        new Wall(CA, 7, 7, Direction.NORTH);
        new Wall(CA, 7, 7, Direction.EAST);
        new Wall(CA, 8, 7, Direction.EAST);
        new Wall(CA, 9, 2, Direction.SOUTH);
        new Thing(CA, 1, 2);
        new Thing(CA, 2, 2);
        new Thing(CA, 4, 2);
        new Thing(CA, 1, 3);
        new Thing(CA, 1, 4);
        new Thing(CA, 1, 5);
        new Thing(CA, 2, 4);
        new Thing(CA, 2, 6);
        new Thing(CA, 4, 3);
        new Thing(CA, 4, 4);
        new Thing(CA, 7, 2);
        new Thing(CA, 7, 3);
        new Thing(CA, 8, 4);
        new Thing(CA, 7, 7);
        new Thing(CA, 8, 3);
        new Thing(CA, 8, 6);
        //shovelbots
        Robot elly = new Robot(CA, 0, 2, Direction.SOUTH);
        Robot bob = new Robot(CA, 0, 2, Direction.SOUTH);
        //find driveway
        while (bob.frontIsClear()) {
            bob.turnLeft();
            if (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
            } else {

                // clear driveway
                while (bob.frontIsClear()) {
                    bob.move();
                    if (bob.canPickThing()) {
                        bob.pickThing();
                    }

                }
                //bob leaving the driveway
                if (!bob.frontIsClear()) {
                    bob.turnLeft();
                    bob.turnLeft();
                }
                while (bob.frontIsClear()) {
                    bob.move();
                    if (!bob.frontIsClear()) {
                        bob.turnLeft();
                        bob.move();
                        break;

                    }
                }
            }
        }
        while (elly.frontIsClear()) {
            elly.move();
            while (elly.canPickThing()) {
                elly.pickThing();
                if(!elly.frontIsClear()){
                    elly.putThing();
            }
        }
    }
}
}