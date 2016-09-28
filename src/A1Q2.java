
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q2 = new City();
        // Create a robot
          Robot a; 
          a = new Robot(a1q2,1,1,Direction.EAST);
          a.setColor(new Color(196, 42, 213));
        // make thing
          Thing b;  
            b = new Thing(a1q2,1,9);
            b.setColor(new Color(78, 220, 202));
        // make wall
            Thing c;
            c = new Wall(a1q2,1,1,Direction.SOUTH);
            c.setColor(new Color(213, 196, 42));
            new Wall(a1q2,1,1,Direction.EAST);
            new Wall(a1q2,1,2,Direction.SOUTH);
            new Wall(a1q2,1,2,Direction.EAST);
            new Wall(a1q2,1,3,Direction.SOUTH);
            new Wall(a1q2,1,4,Direction.SOUTH);
            new Wall(a1q2,1,4,Direction.EAST);
            new Wall(a1q2,1,5,Direction.SOUTH);
            new Wall(a1q2,1,6,Direction.SOUTH);
            new Wall(a1q2,1,7,Direction.SOUTH);
            new Wall(a1q2,1,7,Direction.EAST);
            new Wall(a1q2,1,8,Direction.SOUTH);
            new Wall(a1q2,1,9,Direction.SOUTH);
            // if statement
            if (a.frontIsClear()== false)
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
                
            
    }
}
