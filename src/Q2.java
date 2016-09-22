
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
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
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City q2 = new City();
        
        RobotSE rick = new RobotSE(q2,3,0,Direction.EAST);
        rick.setColor(Color.BLACK);
        
        new Wall(q2,3,0,Direction.SOUTH);
        new Wall(q2,3,0,Direction.EAST);
        new Wall(q2,3,1,Direction.SOUTH);
        new Wall(q2,3,1,Direction.EAST);
        new Wall(q2,3,2,Direction.SOUTH);
        new Wall(q2,3,3,Direction.SOUTH);
        new Wall(q2,3,3,Direction.EAST);
        new Wall(q2,3,4,Direction.SOUTH);
        new Wall(q2,3,5,Direction.SOUTH);
        new Wall(q2,3,6,Direction.SOUTH);
        new Wall(q2,3,6,Direction.EAST);
        new Wall(q2,3,7,Direction.SOUTH);
        new Wall(q2,3,8,Direction.SOUTH);
        new Thing(q2,3,8);
        
        while(rick.frontIsClear()){
            rick.move();
            if(!rick.frontIsClear()){
                rick.turnLeft();
                rick.move();
                rick.turnRight();
            }
        }
    }
}
