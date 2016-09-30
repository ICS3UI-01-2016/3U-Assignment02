
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A2ProgrammingExcercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City pol = new City();
        Robot kur = new Robot(pol, 0, 0, Direction.EAST);
        // TODO code application logic here

        //placing walls 
        new Wall(pol, 1, 1, Direction.NORTH);
        new Wall(pol, 1, 1, Direction.EAST);
        new Wall(pol, 1, 1, Direction.WEST);
        new Wall(pol, 1, 1, Direction.SOUTH);
        

    }
}
