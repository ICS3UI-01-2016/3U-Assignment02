
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
 * @author khans4349
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        
        // new robot
        Robot karel = new Robot(kw,2,2,Direction.EAST);
        
        // create a wall
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,6,Direction.SOUTH);
        new Wall(kw,2,7,Direction.SOUTH);
        new Wall(kw,2,8,Direction.SOUTH);
        new Wall(kw,2,9,Direction.SOUTH);
        new Wall(kw,2,10,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,2,5,Direction.EAST);
        new Wall(kw,2,8,Direction.EAST);
         new Wall(kw,2,7,Direction.EAST);
         
        // create a thing
        new Thing(kw,2,10);
        
        // get robot to move
        while(!karel.canPickThing()){
            if(karel.frontIsClear()){
                karel.move();
            }
            if(!karel.frontIsClear()){
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
        
            
        
      
    }
}
