
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
 * @author slatz8075
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A2Q2 = new City();
        //Create robot
        Robot karel = new Robot (A2Q2,1,1,Direction.EAST);
        //Create the course
        new Wall(A2Q2, 1, 1, Direction.SOUTH);
        new Wall(A2Q2, 1, 2, Direction.SOUTH);
        new Wall(A2Q2, 1, 3, Direction.SOUTH);
        new Wall(A2Q2, 1, 4, Direction.SOUTH);
        new Wall(A2Q2, 1, 5, Direction.SOUTH);
        new Wall(A2Q2, 1, 6, Direction.SOUTH);
        new Wall(A2Q2, 1, 7, Direction.SOUTH);
        new Wall(A2Q2, 1, 8, Direction.SOUTH);
        new Wall(A2Q2, 1, 9, Direction.SOUTH);
        new Wall(A2Q2, 1, 10, Direction.SOUTH);
        //create the "random" walls
        new Wall(A2Q2,1,2,Direction.EAST);
        new Wall(A2Q2,1,4,Direction.EAST);
        new Wall(A2Q2,1,7,Direction.EAST);
        new Wall(A2Q2,1,8,Direction.EAST);
        //create the goal (thing)
        new Thing(A2Q2,1,10);
        //the hurdles algorithm
        while(!karel.canPickThing()){
            //move the robot
            if(karel.frontIsClear()){
            karel.move();
            }
            //check for hurdel
            if(!karel.frontIsClear()){
                //jump over it
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft(); 

            }
        }
karel.pickThing();
    }
}     
