
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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for robot
        City ui = new City();
        Robot bob = new Robot(ui, 3, 1, Direction.SOUTH);
        Robot rush = new Robot(ui, 3, 2, Direction.SOUTH);

        //Create Walls

        new Wall(ui, 11, 6, Direction.SOUTH);
        new Wall(ui, 10, 6, Direction.NORTH);
        new Wall(ui, 3, 1, Direction.WEST);
        new Wall(ui, 4, 1, Direction.WEST);
        new Wall(ui, 5, 1, Direction.WEST);
        new Wall(ui, 6, 1, Direction.WEST);
        new Wall(ui, 7, 1, Direction.WEST);
        new Wall(ui, 8, 1, Direction.WEST);
        new Wall(ui, 9, 1, Direction.WEST);
        new Wall(ui, 7, 4, Direction.EAST);
        new Wall(ui, 7, 4, Direction.SOUTH);
        new Wall(ui, 7, 3, Direction.SOUTH);
        new Wall(ui, 7, 2, Direction.NORTH);
        new Wall(ui, 6, 1, Direction.EAST);
        new Wall(ui, 5, 2, Direction.SOUTH);
        new Wall(ui, 5, 3, Direction.SOUTH);
        new Wall(ui, 5, 4, Direction.SOUTH);
        new Wall(ui, 5, 5, Direction.SOUTH);
        new Wall(ui, 5, 5, Direction.EAST);
        new Wall(ui, 4, 5, Direction.EAST);
        new Wall(ui, 4, 5, Direction.NORTH);
        new Wall(ui, 4, 4, Direction.NORTH);
        new Wall(ui, 4, 3, Direction.NORTH);
        new Wall(ui, 4, 2, Direction.NORTH);
        new Wall(ui, 3, 1, Direction.EAST);
        new Wall(ui, 7, 2, Direction.SOUTH);
        new Wall(ui, 8, 1, Direction.EAST);
        new Wall(ui, 9, 1, Direction.EAST);
        new Wall(ui, 10, 1, Direction.WEST);
        new Wall(ui, 11, 1, Direction.WEST);
        new Wall(ui, 12, 1, Direction.WEST);
        new Wall(ui, 12, 1, Direction.SOUTH);
        new Wall(ui, 12, 1, Direction.EAST);
        new Wall(ui, 11, 2, Direction.SOUTH);
        new Wall(ui, 11, 3, Direction.SOUTH);
        new Wall(ui, 11, 4, Direction.SOUTH);
        new Wall(ui, 11, 5, Direction.SOUTH);
        new Wall(ui, 11, 6, Direction.EAST);
        new Wall(ui, 10, 6, Direction.EAST);
        new Wall(ui, 10, 4, Direction.NORTH);
        new Wall(ui, 10, 3, Direction.NORTH);
        new Wall(ui, 10, 2, Direction.NORTH);
        new Wall(ui, 10, 5, Direction.NORTH);
        new Wall(ui, 7, 2, Direction.NORTH);
        new Wall(ui, 7, 3, Direction.NORTH);
        new Wall(ui, 7, 4, Direction.NORTH);
        new Thing(ui, 4, 1);
        new Thing(ui, 4, 2);
        new Thing(ui, 4, 3);
        new Thing(ui, 4, 4);
        new Thing(ui, 5, 1);
        new Thing(ui, 5, 3);
        new Thing(ui, 5, 5);
        new Thing(ui, 7, 2);
        new Thing(ui, 7, 3);
        new Thing(ui, 7, 1);
        new Thing(ui, 10, 1);
        new Thing(ui, 10, 2);
        new Thing(ui, 10, 5);
        new Thing(ui, 11, 2);
        new Thing(ui, 11, 3);
        new Thing(ui, 11, 5);

        while (bob.frontIsClear()) {
            // Determine if there is a driveway
               bob.turnLeft();
            //Driveway not found
            if (!bob.frontIsClear()) {
                 bob.turnLeft();
                 bob.turnLeft();
                 bob.turnLeft();
                 bob.move();


            } else {
                //Dirveway found 
                while (bob.frontIsClear()) {
                       bob.move();
                   if (bob.canPickThing()) {
                       bob.pickThing();

                   }
                   if (!bob.frontIsClear()) {
                        bob.turnLeft();
                        bob.turnLeft();
                        do {
                                 bob.move();

                        } while (bob.getAvenue() != 1);
                        bob.putThing();
                        bob.turnLeft();
                        bob.move();
                        break;







                    }

                }
            }
        }



        // Get rush to shovel sidewalk 
        while (rush.frontIsClear()) {
               rush.move();
           if (rush.canPickThing()) {
               rush.pickThing();
            }
        }
    }
}
