
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
public class A2ProgrammingExcercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City bo = new City();
        Robot ss = new Robot(bo, 4, 5, Direction.EAST);

        //return to 0,0
        while (ss.getStreet() > 0 && ss.getAvenue() > 0) {
            ss.turnLeft();
            ss.getDirection();
            if (ss.getStreet() == 0) {
                if (ss.getAvenue() == 0) {

                    break;

                }

            }
        }
    }
}