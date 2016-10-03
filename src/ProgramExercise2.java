
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
 * @author petet9087
 */
public class ProgramExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City jump = new City();
        // create a robot
        Robot Lang = new Robot(jump, 3, 2, Direction.EAST);
        new Wall(jump, 3, 2, Direction.SOUTH);
        new Wall(jump, 3, 3, Direction.SOUTH);
        new Wall(jump, 3, 4, Direction.SOUTH);
        new Wall(jump, 3, 5, Direction.SOUTH);
        new Wall(jump, 3, 6, Direction.SOUTH);
        new Wall(jump, 3, 7, Direction.SOUTH);
        new Wall(jump, 3, 8, Direction.SOUTH);
        new Wall(jump, 3, 9, Direction.SOUTH);
        new Wall(jump, 3, 10, Direction.SOUTH);
        new Wall(jump, 3, 3, Direction.EAST);
        new Wall(jump, 3, 4, Direction.EAST);
        new Wall(jump, 3, 6, Direction.EAST);
        new Wall(jump, 3, 8, Direction.EAST);
        new Thing(jump, 3, 10);

        while (!Lang.canPickThing()) {

            if (!Lang.frontIsClear()) {
                Lang.turnLeft();
                Lang.move();
                Lang.turnLeft();
                Lang.turnLeft();
                Lang.turnLeft();
                Lang.move();
                Lang.turnLeft();
                Lang.turnLeft();
                Lang.turnLeft();
                Lang.move();
                Lang.turnLeft();

            } else {
                Lang.move();
            }
        }
    }
}