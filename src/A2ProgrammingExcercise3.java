
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

        //face north
        while (ss.getDirection() != Direction.NORTH) {
            ss.turnLeft();
        }
        while (ss.getStreet() != 0 && ss.getAvenue() != 0) {
            ss.move();
        }

        if (ss.getStreet() == 0) {
            ss.turnLeft();


        }
        //ending the loop when 0,0 is reached
        while (ss.getDirection() != Direction.EAST) {
            ss.move();
            if (ss.getAvenue() == 0 && ss.getStreet() == 0) {
            break;
            }
        }
    }
}