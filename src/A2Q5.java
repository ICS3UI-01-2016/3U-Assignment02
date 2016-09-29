
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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basic startup for a double robot
        City kw = new City();
        Robot karel = new Robot(kw, 0, 1, Direction.SOUTH);
        Robot tina = new Robot(kw, 0, 1, Direction.SOUTH);
        //making all the walls
        new Wall(kw, 1, 0, Direction.EAST);
        new Wall(kw, 2, 0, Direction.EAST);
        new Wall(kw, 3, 0, Direction.EAST);
        new Wall(kw, 4, 0, Direction.EAST);
        new Wall(kw, 5, 0, Direction.EAST);
        new Wall(kw, 6, 0, Direction.EAST);
        new Wall(kw, 7, 0, Direction.EAST);
        new Wall(kw, 8, 0, Direction.EAST);
        new Wall(kw, 9, 0, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.SOUTH);
        new Wall(kw, 0, 0, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 8, 2, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.EAST);
        new Wall(kw, 7, 6, Direction.EAST);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 2, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);

        //making all the things!!!!
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 5);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 7, 1);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 6);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 2);
        new Thing(kw, 8, 5);

        //clearing the driveways
        while (karel.getStreet() != 9) {
            karel.move();
            karel.turnLeft();
            while (karel.frontIsClear()) {
                if (karel.canPickThing()) {
                    karel.pickThing();

                }
                //return to the street
                karel.move();
                if (!karel.frontIsClear() && karel.getAvenue() != 1) {
                    karel.turnLeft();
                    karel.turnLeft();
                }


            }
            karel.putThing();
            //dont clean nonexsistant driveways
            if (!karel.frontIsClear() && karel.getAvenue() == 1 && karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
            }
            karel.turnLeft();

        }
        //clean up snow on the sidewalk
        while (tina.frontIsClear()) {
            tina.move();
            if(tina.canPickThing() ){
            tina.pickThing();
            }
            
        }
    }
}
