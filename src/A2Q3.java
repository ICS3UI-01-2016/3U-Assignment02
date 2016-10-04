
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A2Q3 = new City();
        //Create robot
        Robot karel = new Robot(A2Q3, -5, -5, Direction.SOUTH);
//Take care of latitude directions

        if (karel.getDirection() == Direction.EAST) {
            karel.turnLeft();
        }
        if (karel.getDirection() == Direction.WEST) {
            karel.turnLeft();
        }
        while (karel.getDirection() == Direction.NORTH && (karel.getStreet() > 0)) {

            karel.move();
        }
        while (karel.getDirection() == Direction.NORTH && (karel.getStreet() < 0)) {

            karel.turnLeft();
            karel.turnLeft();
            karel.move();
        }
        while (karel.getDirection() == Direction.SOUTH && (karel.getStreet() > 0)) {

            karel.turnLeft();
            karel.turnLeft();
            karel.move();
        }
        while (karel.getDirection() == Direction.SOUTH && (karel.getStreet() < 0)) {

            karel.move();
        }
        if (karel.getAvenue() > 0 && (karel.getDirection() == Direction.SOUTH)) {

            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        if (karel.getAvenue() > 0 && (karel.getDirection() == Direction.NORTH)) {

            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        if (karel.getAvenue() < 0 && (karel.getDirection() == Direction.SOUTH)) {

            karel.turnLeft();

        }
        if (karel.getAvenue() < 0 && (karel.getDirection() == Direction.NORTH)) {

            karel.turnLeft();
        }
        while (karel.getAvenue() != 0) {

            karel.move();
        }
    }
}
