
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A2ProgrammingExcercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City bo = new City();
        Robot ss = new Robot(bo, 3, 1, Direction.EAST);

        //creating track and hurdles
        new Wall(bo, 3, 1, Direction.SOUTH);
        new Wall(bo, 3, 2, Direction.SOUTH);
        new Wall(bo, 3, 3, Direction.SOUTH);
        new Wall(bo, 3, 4, Direction.SOUTH);
        new Wall(bo, 3, 5, Direction.SOUTH);
        new Wall(bo, 3, 6, Direction.SOUTH);
        new Wall(bo, 3, 7, Direction.SOUTH);
        new Wall(bo, 3, 8, Direction.SOUTH);
        new Wall(bo, 3, 9, Direction.SOUTH);
        new Wall(bo, 3, 1, Direction.EAST);
        new Wall(bo, 3, 2, Direction.EAST);
        new Wall(bo, 3, 4, Direction.EAST);
        new Wall(bo, 3, 7, Direction.EAST);

        //place thing
        new Thing(bo, 3, 9);

        //move robot over hurdles

        while (!ss.canPickThing()) {
            if (!ss.frontIsClear()) {
                ss.turnLeft();
                ss.move();
                if (ss.getStreet() == 2) {
                    ss.turnLeft();
                    ss.turnLeft();
                    ss.turnLeft();
                    if (ss.frontIsClear()) {
                        ss.move();
                        ss.turnLeft();
                        ss.turnLeft();
                        ss.turnLeft();
                        ss.move();
                        ss.turnLeft();
                                           }
                }

            }else{
                ss.move();
            }


        }


    }
}
