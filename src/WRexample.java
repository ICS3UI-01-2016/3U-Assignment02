
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
public class WRexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City wr = new City();
        Robot rick = new Robot(wr,1,5,Direction.NORTH);
        new Wall(wr,0,5,Direction.SOUTH);
    }
}
