
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class ProgramExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City work = new City();
        // create a robot
        RobotSE lang = new RobotSE(work, 0, 2, Direction.SOUTH);
        RobotSE Jen = new RobotSE(work, 0, 2, Direction.SOUTH);
        lang.setLabel("LANG");
        lang.setColor(Color.blue);
        Jen.setLabel("JEN");
        Jen.setColor(Color.pink);
        new Wall(work, 0, 0, Direction.WEST);
        new Wall(work, 1, 0, Direction.WEST);
        new Wall(work, 2, 0, Direction.WEST);
        new Wall(work, 3, 0, Direction.WEST);
        new Wall(work, 4, 0, Direction.WEST);
        new Wall(work, 5, 0, Direction.WEST);
        new Wall(work, 6, 0, Direction.WEST);
        new Wall(work, 7, 0, Direction.WEST);
        new Wall(work, 8, 0, Direction.WEST);
        new Wall(work, 9, 0, Direction.WEST);
        new Wall(work, 0, 1, Direction.EAST);
        new Wall(work, 1, 1, Direction.EAST);
        new Wall(work, 2, 1, Direction.EAST);
        new Wall(work, 3, 1, Direction.EAST);
        new Wall(work, 4, 1, Direction.EAST);
        new Wall(work, 5, 1, Direction.EAST);
        new Wall(work, 6, 1, Direction.EAST);
        new Wall(work, 7, 1, Direction.EAST);
        new Wall(work, 8, 1, Direction.EAST);
        new Wall(work, 9, 1, Direction.EAST);
        new Wall(work, 0, 2, Direction.EAST);
        new Wall(work, 3, 2, Direction.EAST);
        new Wall(work, 5, 2, Direction.EAST);
        new Wall(work, 6, 2, Direction.EAST);
        new Wall(work, 9, 2, Direction.EAST);
        new Wall(work, 9, 2, Direction.SOUTH);
        new Wall(work, 8, 3, Direction.SOUTH);
        new Wall(work, 8, 4, Direction.SOUTH);
        new Wall(work, 8, 5, Direction.SOUTH);
        new Wall(work, 8, 6, Direction.SOUTH);
        new Wall(work, 8, 7, Direction.SOUTH);
        new Wall(work, 4, 5, Direction.EAST);
        new Wall(work, 1, 6, Direction.EAST);
        new Wall(work, 2, 6, Direction.EAST);
        new Wall(work, 7, 7, Direction.EAST);
        new Wall(work, 8, 7, Direction.EAST);
        new Wall(work, 1, 3, Direction.NORTH);
        new Wall(work, 1, 4, Direction.NORTH);
        new Wall(work, 1, 5, Direction.NORTH);
        new Wall(work, 1, 6, Direction.NORTH);
        new Wall(work, 2, 3, Direction.SOUTH);
        new Wall(work, 2, 4, Direction.SOUTH);
        new Wall(work, 2, 5, Direction.SOUTH);
        new Wall(work, 2, 6, Direction.SOUTH);
        new Wall(work, 4, 3, Direction.NORTH);
        new Wall(work, 4, 4, Direction.NORTH);
        new Wall(work, 4, 5, Direction.NORTH);
        new Wall(work, 4, 3, Direction.SOUTH);
        new Wall(work, 4, 4, Direction.SOUTH);
        new Wall(work, 4, 5, Direction.SOUTH);
        new Wall(work, 7, 3, Direction.NORTH);
        new Wall(work, 7, 4, Direction.NORTH);
        new Wall(work, 7, 5, Direction.NORTH);
        new Wall(work, 7, 6, Direction.NORTH);
        new Wall(work, 7, 7, Direction.NORTH);
        new Thing(work, 0, 1);
        new Thing(work, 1, 0);
        new Thing(work, 2, 0);
        new Thing(work, 3, 0);
        new Thing(work, 3, 1);
        new Thing(work, 4, 0);
        new Thing(work, 5, 1);
        new Thing(work, 7, 0);
        new Thing(work, 7, 1);
        new Thing(work, 8, 1);
        new Thing(work, 9, 0);
        new Thing(work, 9, 1);

        new Thing(work, 0, 3);
        new Thing(work, 0, 4);
        new Thing(work, 0, 6);
        new Thing(work, 1, 2);
        new Thing(work, 1, 3);
        new Thing(work, 1, 4);
        new Thing(work, 1, 5);
        new Thing(work, 1, 7);
        new Thing(work, 2, 2);
        new Thing(work, 2, 4);
        new Thing(work, 2, 6);
        new Thing(work, 3, 4);
        new Thing(work, 3, 6);
        new Thing(work, 4, 2);
        new Thing(work, 4, 3);
        new Thing(work, 4, 4);
        new Thing(work, 4, 6);
        new Thing(work, 4, 7);
        new Thing(work, 5, 5);
        new Thing(work, 5, 7);
        new Thing(work, 6, 4);
        new Thing(work, 6, 6);
        new Thing(work, 7, 2);
        new Thing(work, 7, 3);
        new Thing(work, 7, 7);
        new Thing(work, 8, 3);
        new Thing(work, 8, 4);
        new Thing(work, 8, 6);
        new Thing(work, 9, 3);
        new Thing(work, 9, 4);
        new Thing(work, 9, 6);
        // get lang and Jen to move
        // check if front is clear
        while (lang.frontIsClear()) {
            lang.turnLeft();
         // if front is not clear   
            if (!lang.frontIsClear()) {
                lang.turnRight();
                lang.move();
            } else {
                // if driveway is found
                while (lang.frontIsClear()) {
                    lang.move();
                    // if lang can pick up thing
                    if (lang.canPickThing()) {
                        lang.pickThing();
                    }
                    
                }
                // if wall is infront of lang
                    if (!lang.frontIsClear()) {
                        lang.turnAround();
                    }
                    // if driveway is clear
                    while (lang.frontIsClear()) {
                        lang.move();
                    }
                    lang.turnLeft();
                    lang.move();
                
            }
        }
        while (Jen.frontIsClear()) {
            Jen.move();
            while (Jen.canPickThing()) {
                Jen.pickThing();
            }
        }
        if (!Jen.frontIsClear()) {
            Jen.putThing();
        }
    }
}
        