
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City houston = new City();
        //Create robot
        Robot travi$ = new Robot(houston, 4, 6, Direction.NORTH);
        while (travi$.getAvenue() > 0) {
            travi$.move();
            while (travi$.getStreet() > 0) {
                travi$.move();
                if (travi$.getStreet() == 0) {
                    travi$.turnLeft();

                }
            }
        }
    }
}
