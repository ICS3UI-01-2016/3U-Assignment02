
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
public class exersise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City OL = new City();
        Robot bob = new Robot(OL, 5, 0, Direction.EAST);
        new Wall(OL, 5, 0, Direction.SOUTH);
        new Wall(OL, 5, 1, Direction.SOUTH);
        new Wall(OL, 5, 2, Direction.SOUTH);
        new Wall(OL, 5, 3, Direction.SOUTH);
        new Wall(OL, 5, 4, Direction.SOUTH);
        new Wall(OL, 5, 5, Direction.SOUTH);
        new Wall(OL, 5, 6, Direction.SOUTH);
        new Wall(OL, 5, 7, Direction.SOUTH);
        new Wall(OL, 5, 8, Direction.SOUTH);
        new Wall(OL, 5, 1, Direction.WEST);
        new Wall(OL, 5, 1, Direction.WEST);
        new Wall(OL, 5, 1, Direction.WEST);
        new Wall(OL, 5, 2, Direction.WEST);
        new Wall(OL, 5, 4, Direction.WEST);
        new Wall(OL, 5, 7, Direction.WEST);
        new Thing(OL, 5, 8);
        while (!bob.canPickThing()) {
            
            if (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();

            }else{
                bob.move();
                
               
            }
            if (bob.canPickThing()){
                bob.pickThing();
                break;
            }
        }
    }
        
}
    
    
