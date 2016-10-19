
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
 * @author vandl4973
 */
public class exersize1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City SA = new City();
        Robot bob = new Robot(SA, 1, 1, Direction.EAST);
        new Thing(SA, 1, 2);
        new Thing(SA, 1, 3);
        new Thing(SA, 1, 4);
        new Thing(SA, 1, 5);
        new Thing(SA, 1, 6);
        new Thing(SA, 1, 7);
        new Thing(SA, 1, 8);
        new Thing(SA, 1, 9);
        new Thing(SA, 1, 10);
        new Thing(SA, 1, 11);
        while (bob.getAvenue() != 12) {
            bob.move();
            if (bob.canPickThing()) {
                if (bob.countThingsInBackpack() < 7) {
                    bob.pickThing();

                }
                

              
            }
        }
    }
}
