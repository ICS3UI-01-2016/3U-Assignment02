
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * 21/09/2016
 * A2Q2
 * Get Karel to run a hurdle race
 * @author micla1676
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create City
        City Hurdles = new City();

        //create a robot
        Robot Karel = new Robot(Hurdles, 1, 1, Direction.EAST);
        
        //create thing
        new Thing(Hurdles, 1, 10);

        //create walls "Hurdles"
        new Wall(Hurdles, 1, 1, Direction.SOUTH);
        new Wall(Hurdles, 1, 2, Direction.SOUTH);
        new Wall(Hurdles, 1, 3, Direction.SOUTH);
        new Wall(Hurdles, 1, 4, Direction.SOUTH);
        new Wall(Hurdles, 1, 5, Direction.SOUTH);
        new Wall(Hurdles, 1, 6, Direction.SOUTH);
        new Wall(Hurdles, 1, 7, Direction.SOUTH);
        new Wall(Hurdles, 1, 8, Direction.SOUTH);
        new Wall(Hurdles, 1, 9, Direction.SOUTH);
        new Wall(Hurdles, 1, 10, Direction.SOUTH);
        new Wall(Hurdles, 1, 2, Direction.EAST);
        new Wall(Hurdles, 1, 3, Direction.EAST);
        new Wall(Hurdles, 1, 5, Direction.EAST);
        new Wall(Hurdles, 1, 8, Direction.EAST);

        //using while loops, Karels checks to see if he cannot pick up thing,
        while (!Karel.canPickThing()) {

            
            //if can't, check to see if way is clear, if it is, move forward
            if (Karel.frontIsClear()) {
                Karel.move();
            }
            //if the way isn't clear, navigate around wall
            else if (!Karel.frontIsClear()) {
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
            }
            
        }
        
        //Karel picks up thing
        Karel.pickThing();
    }
    
}
