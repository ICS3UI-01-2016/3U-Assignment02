
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
        City Jk = new City();
        Robot bob = new Robot(Jk, 2, 1, Direction.EAST);
        // Create Thing
        new Thing(Jk, 2, 2);
        new Thing(Jk, 2, 3);
        new Thing(Jk, 2, 4);
        new Thing(Jk, 2, 5);
        new Thing(Jk, 2, 6);
        new Thing(Jk, 2, 7);
        new Thing(Jk, 2, 8);
        new Thing(Jk, 2, 9);
        new Thing(Jk, 2, 10);

        //while loop with condition
        while (bob.frontIsClear()) {
            bob.move();
            //Check for something to pick up
            if (bob.canPickThing()) {
                if (bob.countThingsInBackpack() <= 5) {
                    bob.pickThing();
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
