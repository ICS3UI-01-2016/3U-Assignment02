
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
 * @author shieg0688
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create King Java's castle
        City JavasCastle = new City();
        new Wall(JavasCastle, 1, 1, Direction.NORTH);
        new Wall(JavasCastle, 1, 1, Direction.EAST);
        new Wall(JavasCastle, 1, 1, Direction.SOUTH);
        new Wall(JavasCastle, 1, 1, Direction.WEST);
        new Wall(JavasCastle, 1, 4, Direction.WEST);
        new Wall(JavasCastle, 1, 4, Direction.NORTH);
        new Wall(JavasCastle, 1, 4, Direction.SOUTH);
        new Wall(JavasCastle, 1, 4, Direction.EAST);
        new Wall(JavasCastle, 4, 1, Direction.EAST);
        new Wall(JavasCastle, 4, 1, Direction.WEST);
        new Wall(JavasCastle, 4, 1, Direction.NORTH);
        new Wall(JavasCastle, 4, 1, Direction.SOUTH);
        new Wall(JavasCastle, 4, 1, Direction.WEST);
        new Wall(JavasCastle, 4, 4, Direction.NORTH);
        new Wall(JavasCastle, 4, 4, Direction.SOUTH);
        new Wall(JavasCastle, 4, 4, Direction.EAST);
        new Wall(JavasCastle, 4, 4, Direction.WEST);
        new Wall(JavasCastle, 2, 2, Direction.NORTH);
        new Wall(JavasCastle, 2, 3, Direction.NORTH);
        new Wall(JavasCastle, 3, 3, Direction.EAST);
        new Wall(JavasCastle, 2, 3, Direction.EAST);
        new Wall(JavasCastle, 3, 2, Direction.SOUTH);
        new Wall(JavasCastle, 3, 3, Direction.SOUTH);
        new Wall(JavasCastle, 2, 2, Direction.WEST);
        new Wall(JavasCastle, 3, 2, Direction.WEST);
        //Patrol robot
        Robot bowser = new Robot(JavasCastle, 3, 1, Direction.NORTH);
        while (bowser.frontIsClear()) {
            bowser.move();
            while (!bowser.frontIsClear()) {
                bowser.turnLeft();
                bowser.move();
                while (bowser.frontIsClear()) {
                    bowser.turnLeft();
                    bowser.turnLeft();
                    bowser.turnLeft();
                    bowser.move();
                    if (bowser.frontIsClear()) {
                        bowser.move();
                    }




                }
            }
        }
    }
}
