
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
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
        
    }
}
