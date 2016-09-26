
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        City q4 = new City();
        
        new Wall(q4,1,1,Direction.NORTH);
        new Wall(q4,1,1,Direction.EAST);
        new Wall(q4,1,1,Direction.SOUTH);
        new Wall(q4,1,1,Direction.WEST);
        new Wall(q4,1,4,Direction.NORTH);
        new Wall(q4,1,4,Direction.NORTH);
        new Wall(q4,1,4,Direction.EAST);
        new Wall(q4,1,4,Direction.SOUTH);
        new Wall(q4,1,4,Direction.WEST);
        new Wall(q4,4,1,Direction.NORTH);
        new Wall(q4,4,1,Direction.EAST);
        new Wall(q4,4,1,Direction.SOUTH);
        new Wall(q4,4,1,Direction.WEST);
        new Wall(q4,4,4,Direction.NORTH);
        new Wall(q4,4,4,Direction.EAST);
        new Wall(q4,4,4,Direction.SOUTH);
        new Wall(q4,4,4,Direction.WEST);
        new Wall(q4,2,2,Direction.NORTH);
        new Wall(q4,2,3,Direction.NORTH);
        new Wall(q4,2,2,Direction.WEST);
        new Wall(q4,3,2,Direction.WEST);
        new Wall(q4,3,2,Direction.SOUTH);
        new Wall(q4,3,3,Direction.SOUTH);
        new Wall(q4,3,3,Direction.EAST);
        new Wall(q4,2,3,Direction.EAST);
        
        Robot rick = new Robot(q4,0,0,Direction.EAST);
        rick.setColor(Color.black);
        
        
        
    }
}
