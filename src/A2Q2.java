
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
 * @author gavra1870
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City  for robot
        City Nm = new City();
        Robot Bet = new Robot(Nm, 1, 2, Direction.EAST);

        // Create Walls 
        new Wall(Nm, 1, 2, Direction.SOUTH);
        new Wall(Nm, 1, 2, Direction.EAST);
        new Wall(Nm, 1, 3, Direction.SOUTH);
        new Wall(Nm, 1, 3, Direction.EAST);
        new Wall(Nm, 1, 4, Direction.SOUTH);
        new Wall(Nm, 1, 5, Direction.SOUTH);
        new Wall(Nm, 1, 5, Direction.EAST);
        new Wall(Nm, 1, 6, Direction.SOUTH);
        new Wall(Nm, 1, 7, Direction.SOUTH);
        new Wall(Nm, 1, 8, Direction.SOUTH);
        new Wall(Nm, 1, 8, Direction.EAST);
        new Wall(Nm, 1, 9, Direction.SOUTH);
        new Wall(Nm, 1, 10, Direction.SOUTH);
        new Thing(Nm, 1, 10);


        //while loop with conditon
        while (!Bet.canPickThing()) {
            if (!Bet.frontIsClear()) {
                Bet.turnLeft();
                Bet.move();
                Bet.turnLeft();
                Bet.turnLeft();
                Bet.turnLeft();
                Bet.move();
                Bet.turnLeft();
                Bet.turnLeft();
                Bet.turnLeft();
                Bet.move();
                Bet.turnLeft();
            }
            if (Bet.frontIsClear()) {
                Bet.move();
            }

        }

    }
}
