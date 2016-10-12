
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
        City Ui = new City();
        Robot Bob = new Robot(Ui, 3, 1, Direction.SOUTH);

        //Create Walls

        new Wall(Ui, 11, 6, Direction.SOUTH);
        new Wall(Ui, 10, 6, Direction.NORTH);
        new Wall(Ui, 3, 1, Direction.WEST);
        new Wall(Ui, 4, 1, Direction.WEST);
        new Wall(Ui, 5, 1, Direction.WEST);
        new Wall(Ui, 6, 1, Direction.WEST);
        new Wall(Ui, 7, 1, Direction.WEST);
        new Wall(Ui, 8, 1, Direction.WEST);
        new Wall(Ui, 9, 1, Direction.WEST);
        new Wall(Ui, 7, 4, Direction.EAST);
        new Wall(Ui, 7, 4, Direction.SOUTH);
        new Wall(Ui, 7, 3, Direction.SOUTH);
        new Wall(Ui, 7, 2, Direction.NORTH);
        new Wall(Ui, 6, 1, Direction.EAST);
        new Wall(Ui, 5, 2, Direction.SOUTH);
        new Wall(Ui, 5, 3, Direction.SOUTH);
        new Wall(Ui, 5, 4, Direction.SOUTH);
        new Wall(Ui, 5, 5, Direction.SOUTH);
        new Wall(Ui, 5, 5, Direction.EAST);
        new Wall(Ui, 4, 5, Direction.EAST);
        new Wall(Ui, 4, 5, Direction.NORTH);
        new Wall(Ui, 4, 4, Direction.NORTH);
        new Wall(Ui, 4, 3, Direction.NORTH);
        new Wall(Ui, 4, 2, Direction.NORTH);
        new Wall(Ui, 3, 1, Direction.EAST);
        new Wall(Ui, 7, 2, Direction.SOUTH);
        new Wall(Ui, 8, 1, Direction.EAST);
        new Wall(Ui, 9, 1, Direction.EAST);
        new Wall(Ui, 10, 1, Direction.WEST);
        new Wall(Ui, 11, 1, Direction.WEST);
        new Wall(Ui, 12, 1, Direction.WEST);
        new Wall(Ui, 12, 1, Direction.SOUTH);
        new Wall(Ui, 12, 1, Direction.EAST);
        new Wall(Ui, 11, 2, Direction.SOUTH);
        new Wall(Ui, 11, 3, Direction.SOUTH);
        new Wall(Ui, 11, 4, Direction.SOUTH);
        new Wall(Ui, 11, 5, Direction.SOUTH);
        new Wall(Ui, 11, 6, Direction.EAST);
        new Wall(Ui, 10, 6, Direction.EAST);
        new Wall(Ui, 10, 4, Direction.NORTH);
        new Wall(Ui, 10, 3, Direction.NORTH);
        new Wall(Ui, 10, 2, Direction.NORTH);
        new Wall(Ui, 10, 5, Direction.NORTH);
        new Wall(Ui, 7, 2, Direction.NORTH);
        new Wall(Ui, 7, 3, Direction.NORTH);
        new Wall(Ui, 7, 4, Direction.NORTH);
        new Thing(Ui, 4, 1);
        new Thing(Ui, 4, 2);
        new Thing(Ui, 4, 3);
        new Thing(Ui, 4, 4);
        new Thing(Ui, 5, 1);
        new Thing(Ui, 5, 3);
        new Thing(Ui, 5, 5);
        new Thing(Ui, 7, 2);
        new Thing(Ui, 7, 3);
        new Thing(Ui, 7, 1);
        new Thing(Ui, 10, 1);
        new Thing(Ui, 10, 2);
        new Thing(Ui, 10, 5);
        new Thing(Ui, 11, 2);
        new Thing(Ui, 11, 3);
        new Thing(Ui, 11, 5);


        //loop while front is clear{
        while (Bob.frontIsClear()) {
               Bob.turnLeft();
               if (Bob.canPickThing()) {
                   Bob.pickThing();
                    }
               if (!Bob.frontIsClear()){
                    Bob.turnLeft();
                   
               }
                  
                        
                    }



                }
            }
        
    

