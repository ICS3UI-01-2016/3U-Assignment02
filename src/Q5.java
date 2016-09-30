
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
 * @author schum0689
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City q5 = new City();
        
        // Create road
        new Wall(q5,0,0,Direction.WEST);
        new Wall(q5,1,0,Direction.WEST);
        new Wall(q5,2,0,Direction.WEST);
        new Wall(q5,3,0,Direction.WEST);
        new Wall(q5,4,0,Direction.WEST);
        new Wall(q5,5,0,Direction.WEST);
        new Wall(q5,6,0,Direction.WEST);
        new Wall(q5,7,0,Direction.WEST);
        new Wall(q5,8,0,Direction.WEST);
        new Wall(q5,9,0,Direction.WEST);
        new Wall(q5,0,1,Direction.EAST);
        new Wall(q5,1,1,Direction.EAST);
        new Wall(q5,2,1,Direction.EAST);
        new Wall(q5,3,1,Direction.EAST);
        new Wall(q5,4,1,Direction.EAST);
        new Wall(q5,5,1,Direction.EAST);
        new Wall(q5,6,1,Direction.EAST);
        new Wall(q5,7,1,Direction.EAST);
        new Wall(q5,8,1,Direction.EAST);
        new Wall(q5,9,1,Direction.EAST);
        
        // Create sidewalk
        new Wall(q5,0,2,Direction.EAST);
        new Wall(q5,3,2,Direction.EAST);
        new Wall(q5,5,2,Direction.EAST);
        new Wall(q5,6,2,Direction.EAST);
        new Wall(q5,9,2,Direction.EAST);
        new Wall(q5,9,2,Direction.SOUTH);
        
        // Create driveway 1
        new Wall(q5,1,3,Direction.NORTH);
        new Wall(q5,1,4,Direction.NORTH);
        new Wall(q5,1,5,Direction.NORTH);
        new Wall(q5,1,6,Direction.NORTH);
        new Wall(q5,1,6,Direction.EAST);
        new Wall(q5,2,6,Direction.EAST);
        new Wall(q5,2,3,Direction.SOUTH);
        new Wall(q5,2,4,Direction.SOUTH);
        new Wall(q5,2,5,Direction.SOUTH);
        new Wall(q5,2,6,Direction.SOUTH);
        
        // Create driveway 2
        // Create driveway 3
        // Create snow (things)
        
        
        
        
    }
}

