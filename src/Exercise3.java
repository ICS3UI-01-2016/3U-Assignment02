
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City
        City aaa = new City();
        //Create a Robot
        RobotSE karl = new RobotSE(aaa,5,8,Direction.EAST);
        
        while(karl.getDirection() != Direction.WEST){
            karl.turnLeft();
        }
        
        //Make the Robot Move
        while(karl.getAvenue() != 0){

        karl.move();
        
      
        }
        while(karl.getDirection() != Direction.NORTH){
            karl.turnRight();
        }
        while(karl.getStreet() != 0){
            karl.move();
        }
    }
    

}
