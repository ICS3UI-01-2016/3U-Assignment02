
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
        Robot kur = new Robot(pol, 1, 0, Direction.NORTH);
        // TODO code application logic here

        //placing walls
        new Wall(pol, 1, 1, Direction.NORTH);
        new Wall(pol, 1, 1, Direction.EAST);
        new Wall(pol, 1, 1, Direction.WEST);
        new Wall(pol, 1, 1, Direction.SOUTH);

        new Wall(pol, 4, 1, Direction.NORTH);
        new Wall(pol, 4, 1, Direction.EAST);
        new Wall(pol, 4, 1, Direction.WEST);
        new Wall(pol, 4, 1, Direction.SOUTH);

        new Wall(pol, 1, 4, Direction.NORTH);
        new Wall(pol, 1, 4, Direction.EAST);
        new Wall(pol, 1, 4, Direction.SOUTH);
        new Wall(pol, 1, 4, Direction.WEST);

        new Wall(pol, 4, 4, Direction.NORTH);
        new Wall(pol, 4, 4, Direction.EAST);
        new Wall(pol, 4, 4, Direction.SOUTH);
        new Wall(pol, 4, 4, Direction.WEST);

        new Wall(pol, 2, 2, Direction.NORTH);
        new Wall(pol, 2, 2, Direction.WEST);
        new Wall(pol, 3, 2, Direction.WEST);
        new Wall(pol, 3, 2, Direction.SOUTH);
        new Wall(pol, 3, 3, Direction.SOUTH);
        new Wall(pol, 3, 3, Direction.EAST);
        new Wall(pol, 2, 3, Direction.EAST);
        new Wall(pol, 2, 3, Direction.NORTH);

        //setting up the guarding
        while (kur.frontIsClear()) {
            //loop robot around castle
            kur.move();
            if (kur.getAvenue() == 0 && kur.getStreet() == 0) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
                kur.move();
                kur.move();
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
                kur.move();
                kur.turnLeft();
            }
            while (!kur.frontIsClear()) {
                kur.turnLeft();
                kur.move();
            }
            if (kur.getAvenue() == 3 && kur.getStreet() == 0) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 5 && kur.getStreet() == 0) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 5 && kur.getStreet() == 2) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
                kur.move();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 5 && kur.getStreet() == 3) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 5 && kur.getStreet() == 5) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 3 && kur.getStreet() == 5) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 2 && kur.getStreet() == 5) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
            if (kur.getAvenue() == 0 && kur.getStreet() == 5) {
                kur.turnLeft();
                kur.turnLeft();
                kur.turnLeft();
            }
        }
    }
}