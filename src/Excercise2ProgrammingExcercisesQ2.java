
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
 * @author manok5757
 */
public class Excercise2ProgrammingExcercisesQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        // create a robot
        Robot cliff = new Robot (km,2,0,Direction.EAST);
        // create the hurdle track
        new Wall (km,2,0,Direction.SOUTH);
        new Wall (km,2,0,Direction.EAST);
        new Wall (km,2,1,Direction.SOUTH);
        new Wall (km,2,1,Direction.EAST);
        new Wall (km,2,2,Direction.SOUTH);
        new Wall (km,2,3,Direction.SOUTH);
        new Wall (km,2,3,Direction.EAST);
        new Wall (km,2,4,Direction.SOUTH);
        new Wall (km,2,5,Direction.SOUTH);
        new Wall (km,2,6,Direction.SOUTH);
        new Wall (km,2,6,Direction.EAST);
        new Wall (km,2,7,Direction.SOUTH);
        new Wall (km,2,8,Direction.SOUTH);
        // place thing at finish line
        new Thing(km,2,8);
        // make algorithim to beat hurdle race
        while(true)
        if(!cliff.frontIsClear()){
            cliff.turnLeft();
            cliff.move();
        }else
         if(cliff.getStreet()== 1){
            cliff.turnLeft();
            cliff.turnLeft();
            cliff.turnLeft();
            cliff.move();
            cliff.turnLeft();
            cliff.turnLeft();
            cliff.turnLeft();
            cliff.move();
            cliff.turnLeft();
        } 
         else{
             cliff.move();
            
         } 
         if(cliff.canPickThing()){ 
             break;
         }
         }
            
         }