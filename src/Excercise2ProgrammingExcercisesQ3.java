
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class Excercise2ProgrammingExcercisesQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a robot
        Robot cliff = new Robot(km, 5, 3, Direction.SOUTH);

        // creat algorithim to get to 0,0
        while (cliff.getAvenue() != 0) {

            if (cliff.getDirection() != Direction.WEST) {
                cliff.turnLeft();
            }


            if (cliff.getDirection() == Direction.WEST) {
                cliff.move();
            }


        }

        while (cliff.getStreet() != 0) {
            if (cliff.getDirection() != Direction.NORTH) {
                cliff.turnLeft();
            }

            if (cliff.getDirection()== Direction.NORTH) {
                cliff.move();
            }
        }



    }
}
