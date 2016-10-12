
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create City for robot
        City Jk = new City();
        Robot bob = new Robot(Jk, 8, 9, Direction.SOUTH);
        
        //Get bob to move
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        while(bob.getDirection() == Direction.WEST && bob.getAvenue() != 0){
            bob.move(); 
        }
        
        //Get bob to move
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        while(bob.getDirection() == Direction.NORTH && bob.getStreet() !=0){
            bob.move();
        }
                
    }
}
