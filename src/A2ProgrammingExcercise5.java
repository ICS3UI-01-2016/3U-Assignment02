
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
 * @author bulka4927
 */
public class A2ProgrammingExcercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City ko = new City();
        //create a robot
        Robot karel = new Robot(ko, 0, 2, Direction.SOUTH);
        Robot tina = new Robot(ko, 0, 2, Direction.SOUTH);

        //creating walls
        new Wall(ko, 0, 0, Direction.WEST);
        new Wall(ko, 1, 0, Direction.WEST);
        new Wall(ko, 2, 0, Direction.WEST);
        new Wall(ko, 3, 0, Direction.WEST);
        new Wall(ko, 4, 0, Direction.WEST);
        new Wall(ko, 5, 0, Direction.WEST);
        new Wall(ko, 6, 0, Direction.WEST);
        new Wall(ko, 7, 0, Direction.WEST);
        new Wall(ko, 8, 0, Direction.WEST);
        new Wall(ko, 9, 0, Direction.WEST);
        
        new Wall(ko, 0, 1, Direction.EAST);
        new Wall(ko, 1, 1, Direction.EAST);
        new Wall(ko, 2, 1, Direction.EAST);
        new Wall(ko, 3, 1, Direction.EAST);
        new Wall(ko, 4, 1, Direction.EAST);
        new Wall(ko, 5, 1, Direction.EAST);
        new Wall(ko, 6, 1, Direction.EAST);
        new Wall(ko, 7, 1, Direction.EAST);
        new Wall(ko, 8, 1, Direction.EAST);
        new Wall(ko, 9, 1, Direction.EAST);
        
        new Wall(ko, 0, 2, Direction.EAST);
        new Wall(ko, 1, 3, Direction.NORTH);
        new Wall(ko, 1, 4, Direction.NORTH);
        new Wall(ko, 1, 5, Direction.NORTH);
        new Wall(ko, 1, 6, Direction.NORTH);
        new Wall(ko, 1, 6, Direction.EAST);
        new Wall(ko, 2, 6, Direction.EAST);
        new Wall(ko, 2, 3, Direction.SOUTH);
        new Wall(ko, 2, 4, Direction.SOUTH);
        new Wall(ko, 2, 5, Direction.SOUTH);
        new Wall(ko, 2, 6, Direction.SOUTH);
        new Wall(ko, 3, 2, Direction.EAST);
        
        //fix these
        new Wall(ko, 3, 4, Direction.NORTH);
        new Wall(ko, 1, 4, Direction.NORTH);
        new Wall(ko, 1, 5, Direction.NORTH);
        new Wall(ko, 1, 6, Direction.NORTH);
        
        
        

        //overall loop
        //loop while front is clear
        //determine if driveway
        //turn left if (wall){
        //turn right 
        //move
        //}else{
        //found driveway
        //loop while front is clear
        //move
        //if can pick up thing
        //pick up thing
        //}
        //}
        //turn around
        //while front is clear
        //move
        //}turn left
        //move




    }
}
