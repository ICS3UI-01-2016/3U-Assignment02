
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
 * @author manok5757
 */
public class Excercise2ProgrammingExcercisesQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create walls for castle
        new Wall(km, 1, 1, Direction.WEST);
        new Wall(km, 1, 1, Direction.NORTH);
        new Wall(km, 1, 1, Direction.SOUTH);
        new Wall(km, 1, 1, Direction.EAST);
        new Wall(km, 1, 4, Direction.WEST);
        new Wall(km, 1, 4, Direction.NORTH);
        new Wall(km, 1, 4, Direction.SOUTH);
        new Wall(km, 1, 4, Direction.EAST);
        new Wall(km, 4, 1, Direction.WEST);
        new Wall(km, 4, 1, Direction.NORTH);
        new Wall(km, 4, 1, Direction.SOUTH);
        new Wall(km, 4, 1, Direction.EAST);
        new Wall(km, 4, 4, Direction.WEST);
        new Wall(km, 4, 4, Direction.NORTH);
        new Wall(km, 4, 4, Direction.SOUTH);
        new Wall(km, 4, 4, Direction.EAST);
        new Wall(km, 2, 2, Direction.WEST);
        new Wall(km, 3, 2, Direction.WEST);
        new Wall(km, 3, 2, Direction.SOUTH);
        new Wall(km, 3, 3, Direction.SOUTH);
        new Wall(km, 2, 3, Direction.EAST);
        new Wall(km, 3, 3, Direction.EAST);
        new Wall(km, 2, 2, Direction.NORTH);
        new Wall(km, 2, 3, Direction.NORTH);

        //create robot
        Robot cliff = new Robot(km, 0, 0, Direction.EAST);

        //make robot guard castle

        int moves = 0;
        while (true) {
        cliff.move();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
}


