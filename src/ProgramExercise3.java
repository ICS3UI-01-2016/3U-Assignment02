
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class ProgramExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City find = new City();
        //create a robot
        Robot Lang = new Robot(find, 5, 5, Direction.WEST);
        Lang.setLabel("LANG");
        Lang.setColor(Color.orange);
        //get Lang to move
        if (Lang.getDirection() == Direction.WEST) {
            Lang.move();
        }
        if (Lang.getDirection() == Direction.SOUTH) {
            Lang.turnLeft();
            Lang.turnLeft();
            Lang.turnLeft();
        }
        if (Lang.getDirection() == Direction.NORTH) {
            Lang.turnLeft();
        }
        if (Lang.getDirection() == Direction.EAST) {
            Lang.turnLeft();
            Lang.turnLeft();
        }
        while (Lang.getAvenue() != 0) {
            Lang.move(); 
        }
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        
        while(Lang.getStreet() != 0) {
            Lang.move();
        }
    }
}