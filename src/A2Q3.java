
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 2, 11, Direction.SOUTH);

        // create algorithim to get rick to (0,0) every time
        while (rick.getDirection() != Direction.NORTH) {
            rick.turnLeft();
        }

        while (rick.frontIsClear()) {
            rick.move();

            if (rick.getStreet() == 0) {
                rick.turnLeft();
                break;
            }
        }

        while (rick.frontIsClear()) {
            rick.move();
            if (rick.getAvenue() == 0) {
                break;
            }
        }

    }
}
