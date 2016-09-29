
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city
        City kw = new City();

        //Create a robot
        Robot dave = new Robot(kw, 10, 20, Direction.SOUTH);



        //Make face West
        while (dave.getDirection() != Direction.WEST) {
            dave.turnLeft();

            //once facing west
            if (dave.getDirection() == Direction.WEST) {

                //move to origin
                while (dave.getStreet() > 0) {
                    dave.move();

                    while (dave.getAvenue() > 0) {
                        dave.move();
                        if (dave.getAvenue() == 0) {
                            dave.turnLeft();
                            dave.turnLeft();
                            dave.turnLeft();

                        }
                    }

                }
            }
        }



    }
}
