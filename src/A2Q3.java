
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basic startup for a single robot
        City kw = new City();
        Robot Karel = new Robot(kw, -8, 8, Direction.EAST);
//return to origin(0,0)
        while (true) {
            while (Karel.getDirection() == Direction.EAST && Karel.getAvenue() > 0) {
                Karel.turnLeft();
                Karel.turnLeft();
            }
            while (Karel.getDirection() == Direction.WEST && Karel.getAvenue() > 0) {
                Karel.move();
            }

            while (Karel.getDirection() == Direction.EAST && Karel.getAvenue() < 0) {
                Karel.move();
            }
            while (Karel.getDirection() == Direction.EAST && Karel.getAvenue() == 0) {
                Karel.turnLeft();
            }
            while (Karel.getDirection() == Direction.NORTH && Karel.getStreet() > 0) {
                Karel.move();
            }
            while (Karel.getDirection() == Direction.WEST && Karel.getAvenue() == 0) {
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
            }
            while (Karel.getDirection() == Direction.SOUTH && Karel.getStreet() < 0) {
                Karel.move();
            }
            while (Karel.getDirection() == Direction.NORTH && Karel.getStreet() < 0) {
                Karel.turnLeft();
                Karel.turnLeft();
            }
        }
    }
}
