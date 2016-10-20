
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
        City jk = new City();
        Robot bob = new Robot(jk, 8, 9, Direction.SOUTH);
        
        while(bob.getDirection() != Direction.WEST){
            bob.turnLeft();
        }
        // Always get the robor bob to face west regardless of its staring postion and move once it's facing west.  
        while(bob.getDirection() == Direction.WEST && bob.getAvenue() != 0){
            bob.move();
            
        }
        
        //Once bob reaches the Avenue 0, turn right so it face North. 
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        // Once bob is facing North, get him to move until his at street 0. 
        while(bob.getDirection() == Direction.NORTH && bob.getStreet() !=0){
            bob.move();
        }
                
    }
}
