
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
 * @author shieg0688
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Bompton = new City();
        new Wall(Bompton, 4, 0, Direction.SOUTH);
        new Wall(Bompton, 4, 1, Direction.SOUTH);
        new Wall(Bompton, 4, 2, Direction.SOUTH);
        new Wall(Bompton, 4, 3, Direction.SOUTH);
        new Wall(Bompton, 4, 4, Direction.SOUTH);
        new Wall(Bompton, 4, 5, Direction.SOUTH);
        new Wall(Bompton, 4, 6, Direction.SOUTH);
        new Wall(Bompton, 4, 7, Direction.SOUTH);
        new Wall(Bompton, 4, 8, Direction.SOUTH);
        new Wall(Bompton, 4, 0, Direction.EAST);
        new Wall(Bompton, 4, 1, Direction.EAST);
        new Wall(Bompton, 4, 3, Direction.EAST);
        new Wall(Bompton, 4, 6, Direction.EAST);
        new Thing(Bompton, 4, 8);
        //Create Robot
        Robot brazy = new Robot(Bompton, 4, 0, Direction.EAST);
        //Command Robot

        while (!brazy.frontIsClear()) {
            brazy.turnLeft();
            brazy.move();
            brazy.turnLeft();
            brazy.turnLeft();
            brazy.turnLeft();
            brazy.move();
            brazy.turnLeft();
            brazy.turnLeft();
            brazy.turnLeft();
            brazy.move();
            brazy.turnLeft();
            while (brazy.frontIsClear()) {
                brazy.move();
                if (brazy.canPickThing()) {
                    break;
                }




            }

        }

    }
}
