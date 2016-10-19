
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
 * @author katop7929
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kpl = new City();
        
        //create a robot 
        Robot obama = new Robot(kpl,1,1,Direction.EAST);
        
        //create walls 
        new Wall(kpl,1,1,Direction.EAST);
        new Wall(kpl,1,2,Direction.EAST);
        new Wall(kpl,1,4,Direction.EAST);
        new Wall(kpl,1,7,Direction.EAST);
        new Wall(kpl,1,1,Direction.SOUTH);
        new Wall(kpl,1,2,Direction.SOUTH);
        new Wall(kpl,1,3,Direction.SOUTH);
        new Wall(kpl,1,4,Direction.SOUTH);
        new Wall(kpl,1,5,Direction.SOUTH);
        new Wall(kpl,1,6,Direction.SOUTH);
        new Wall(kpl,1,7,Direction.SOUTH);
        new Wall(kpl,1,8,Direction.SOUTH);
        new Wall(kpl,1,9,Direction.SOUTH);
        
        //place a thing 
        new Thing(kpl,1,9);
        
        //get obama to move 
        while(!obama.canPickThing()){
            if(obama.frontIsClear()){
                obama.move();
        }
        if(!obama.frontIsClear()){
            obama.turnLeft();
            obama.move();
            obama.turnLeft();
            obama.turnLeft();
            obama.turnLeft(); 
            obama.move();
            obama.turnLeft();
            obama.turnLeft();
            obama.turnLeft();
            obama.move();
            obama.turnLeft();
        }
        }
                        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
