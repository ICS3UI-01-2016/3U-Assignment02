
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
 * @author lawd8918
 */
public class A2q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city
        City kw = new City();
        //Create walls
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 0, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        //Create thing
        new Thing(kw, 2, 8);
        //Create a Robot
        Robot dave = new Robot(kw, 2, 0, Direction.EAST);

        while (!dave.canPickThing()) {



            //Make robot hurdle
            if (!dave.frontIsClear()) {
                dave.turnLeft();
                dave.move();
                dave.turnLeft();
                dave.turnLeft();
                dave.turnLeft();
                dave.move();
                dave.turnLeft();
                dave.turnLeft();
                dave.turnLeft();
                dave.move();
                dave.turnLeft();



            } else {
                //no hurdles 
                dave.move();
            }



        }
        //end of hurdles
        dave.pickThing();
    }
}
