
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City PO = new City();
        Robot bob = new Robot(PO, 100, 84, Direction.SOUTH);
        // having bob go to the right street
        while (bob.getStreet() != 0) {
            if (bob.getDirection() == Direction.NORTH) {
                bob.move();
            } else {
                bob.turnLeft();

            }
        }
        
        while (bob.getAvenue()!=0){
            if (bob.getDirection() == Direction.WEST){
                bob.move();
            }else{
                bob.turnLeft();
        
        
        
    }
}
}
}