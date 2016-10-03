
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class ProgramExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create new city
        City guard = new City();
        // create new robot
        Robot Lang = new Robot(guard, 0, 0, Direction.EAST);
        new Wall(guard, 1, 1, Direction.NORTH);
        new Wall(guard, 1, 1, Direction.EAST);
        new Wall(guard, 1, 1, Direction.SOUTH);
        new Wall(guard, 1, 1, Direction.WEST);
        new Wall(guard, 1, 4, Direction.NORTH);
        new Wall(guard, 1, 4, Direction.EAST);
        new Wall(guard, 1, 4, Direction.SOUTH);
        new Wall(guard, 1, 4, Direction.WEST);
        new Wall(guard, 4, 1, Direction.NORTH);
        new Wall(guard, 4, 1, Direction.EAST);
        new Wall(guard, 4, 1, Direction.SOUTH);
        new Wall(guard, 4, 1, Direction.WEST);
        new Wall(guard, 4, 4, Direction.NORTH);
        new Wall(guard, 4, 4, Direction.EAST);
        new Wall(guard, 4, 4, Direction.SOUTH);
        new Wall(guard, 4, 4, Direction.WEST);
        new Wall(guard, 2, 2, Direction.NORTH);
        new Wall(guard, 2, 3, Direction.NORTH);
        new Wall(guard, 3, 2, Direction.SOUTH);
        new Wall(guard, 3, 3, Direction.SOUTH);
        new Wall(guard, 3, 3, Direction.EAST);
        new Wall(guard, 2, 3, Direction.EAST);
        new Wall(guard, 2, 2, Direction.WEST);
        new Wall(guard, 3, 2, Direction.WEST);
        // get Lang to move
        while (Lang.frontIsClear()) {
            Lang.move();
            Lang.move();
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.move();
            Lang.turnLeft();
            Lang.move();
            Lang.turnLeft();
            Lang.move();
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.move();
            Lang.move();
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.turnLeft();
        }
        }

        }
    
