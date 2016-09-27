
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smith3577
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener,5,5,Direction.NORTH);
        
        while(karel.getStreet() > 0){
            karel.move();
        }
        karel.turnLeft();
        while (karel.getAvenue() > 0){
            karel.move();
        }
}
}
