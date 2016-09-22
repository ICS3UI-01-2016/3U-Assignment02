
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
 * @author fabed2976
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City PH = new City ();
        Robot Kris = new Robot (PH, 1,1, Direction. EAST);
        
        new Wall (PH, 1,1, Direction. SOUTH);
        new Wall (PH, 1,2, Direction. SOUTH);
        new Wall (PH, 1,3, Direction. SOUTH);
        new Wall (PH, 1,4, Direction. SOUTH);
        new Wall (PH, 1,5, Direction. SOUTH);
        new Wall (PH, 1,6, Direction. SOUTH);
        new Wall (PH, 1,7, Direction. SOUTH);
        new Wall (PH, 1,8, Direction. SOUTH);
        new Wall (PH, 1,9, Direction. SOUTH);
        new Wall (PH, 1,1, Direction. EAST);
        new Wall (PH, 1,2, Direction. EAST);
        new Wall (PH, 1,4, Direction. EAST);
        new Wall (PH, 1,7, Direction. EAST);
        new Thing (PH, 1,9);
        
    }
}
