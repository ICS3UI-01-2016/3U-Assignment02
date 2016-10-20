
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for robot
        City jk = new City();
        Robot bob = new Robot(jk, 2, 1, Direction.EAST);
        // Create Thing
        new Thing(jk, 2, 2);
        new Thing(jk, 2, 3);
        new Thing(jk, 2, 4);
        new Thing(jk, 2, 5);
        new Thing(jk, 2, 6);
        new Thing(jk, 2, 7);
        new Thing(jk, 2, 8);
        new Thing(jk, 2, 9);
        new Thing(jk, 2, 10);

        //while loop with condition 
        //Get the robot bob to move when the front is clear
        while (bob.frontIsClear()) {
            bob.move();
        // Get the robot bob to check if he has less than 5 things in his backpack, and if the statement is true pick something up.
             if (bob.canPickThing()) {
             if (bob.countThingsInBackpack() <= 5) {
                 bob.pickThing();
        // When bob has 5 thing  in his backpack continue moving forward without picking anything up   
       } else if(bob.countThingsInBackpack() >=5) {
                 bob.move();
                 bob.move();
                 bob.move();
                    
                break;
                
                    
                    //end
                }



            }

        }
    }

}
