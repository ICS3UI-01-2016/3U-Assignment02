
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City q3 = new City();
        RobotSE rick = new RobotSE(q3, 5, 4, Direction.SOUTH);
        rick.setColor(Color.black);

// Will only work if robot is in a positive integer location ( > or = to 0,0)

        // If rick is to the right of the intersection
        if (rick.getAvenue() > 0) {
            // Turn WEST if he is not already
            if (rick.getDirection() == Direction.NORTH || rick.getDirection() == Direction.EAST || rick.getDirection() == Direction.SOUTH) {
                do {
                    rick.turnRight();
                } while (rick.getDirection() != Direction.WEST);
            }
            // Move to Avenue 0
            do {
                rick.move();
            } while (rick.getAvenue() != 0);
        }
        // If rick is below intersection
        if (rick.getStreet() > 0) {
            // Turn NORTH
            if (rick.getDirection() == Direction.WEST) {
                do {
                    rick.turnRight();
                } while (rick.getDirection() != Direction.NORTH);
            }
            // Move to Street 0
            do {
                rick.move();
            } while (rick.getStreet() != 0);
        }

    }
}
