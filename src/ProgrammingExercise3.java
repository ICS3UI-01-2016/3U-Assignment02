
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class ProgrammingExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a city
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 8, 9, Direction.EAST);

        // create an algorithem that will tell robot to get to origin (0,0)

        while (dino.getAvenue() != 0) {
            if (dino.getDirection() != Direction.WEST) {
                dino.turnLeft();
            }

            if (dino.getDirection() == Direction.WEST) {
                dino.move();
            }
        }

        while (dino.getStreet() != 0) {
            if (dino.getDirection() != Direction.NORTH) {
                dino.turnLeft();
            }


            if (dino.getDirection() == Direction.NORTH) {
                dino.move();
            }
        }
    }



    
}
  
