
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City af = new City();
        Robot rem = new Robot(af, 6, 4, Direction.EAST);

        rem.setLabel("R");
        // Get Rem to face North automatically 
        while (rem.getDirection() != Direction.NORTH) {
            rem.turnLeft();

        }
        // Get Rem to Street 0
        while (rem.getStreet() != 0) {
            rem.move();
        }

        if (rem.getAvenue() > 0) {
            rem.turnLeft();

        }
        // Get Rem to Avenue 0 
        while (rem.getAvenue() != 0) {
            rem.move();
        }

    }
}
