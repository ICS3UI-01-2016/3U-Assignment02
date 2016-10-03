
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
 * @author awadb3223
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City
        City race = new City();

        //create Robot
        Robot bolt = new Robot(race, 1, 1, Direction.EAST);


        //create race track
        new Wall(race, 1, 1, Direction.SOUTH);
        new Wall(race, 1, 2, Direction.SOUTH);
        new Wall(race, 1, 3, Direction.SOUTH);
        new Wall(race, 1, 4, Direction.SOUTH);
        new Wall(race, 1, 5, Direction.SOUTH);
        new Wall(race, 1, 6, Direction.SOUTH);
        new Wall(race, 1, 7, Direction.SOUTH);
        new Wall(race, 1, 8, Direction.SOUTH);
        new Wall(race, 1, 9, Direction.SOUTH);
        new Wall(race, 1, 10, Direction.SOUTH);

        //create hurdles
        new Wall(race, 1, 3, Direction.EAST);
        new Wall(race, 1, 5, Direction.EAST);
        new Wall(race, 1, 8, Direction.EAST);
        new Wall(race, 1, 9, Direction.EAST);

        //create finish line
        new Thing(race, 1, 10);

        //make algorithm for Bolt!


        while (!bolt.canPickThing()) {
            
            if (!bolt.frontIsClear()) {
                bolt.turnLeft();
                bolt.move();
                bolt.turnLeft();
                bolt.turnLeft();
                bolt.turnLeft();
                bolt.move();
                bolt.turnLeft();
                bolt.turnLeft();
                bolt.turnLeft();
                bolt.move();
                bolt.turnLeft();
            }else{
                bolt.move();
            }
        }
    }
}
