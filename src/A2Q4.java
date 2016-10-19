
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
 * @author katop7929
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // craete a city 
        City kpl = new City();
        
        //create a robot 
        Robot obama = new Robot(kpl,0,0,Direction.NORTH); 
        
        // craete walls 
        new Wall(kpl,1,1,Direction.NORTH); 
        new Wall(kpl,1,4,Direction.NORTH);
        new Wall(kpl,4,4,Direction.NORTH);
        new Wall(kpl,4,1,Direction.NORTH);
        new Wall(kpl,2,2,Direction.NORTH);
        new Wall(kpl,2,3,Direction.NORTH);
        new Wall(kpl,1,1,Direction.EAST); 
        new Wall(kpl,1,4,Direction.EAST);
        new Wall(kpl,4,4,Direction.EAST);
        new Wall(kpl,4,1,Direction.EAST);
        new Wall(kpl,2,3,Direction.EAST);
        new Wall(kpl,3,3,Direction.EAST);
        new Wall(kpl,1,1,Direction.SOUTH); 
        new Wall(kpl,1,4,Direction.SOUTH);
        new Wall(kpl,4,4,Direction.SOUTH);
        new Wall(kpl,4,1,Direction.SOUTH);
        new Wall(kpl,3,2,Direction.SOUTH);
        new Wall(kpl,3,3,Direction.SOUTH);
        new Wall(kpl,1,1,Direction.WEST); 
        new Wall(kpl,1,4,Direction.WEST);
        new Wall(kpl,4,4,Direction.WEST);
        new Wall(kpl,4,1,Direction.WEST);
        new Wall(kpl,2,2,Direction.WEST);
        new Wall(kpl,3,2,Direction.WEST); 
        
        // get robot to move around the walls
        obama.turnLeft();
        
        int moves = 0; 
        
        while(true){
            obama.turnLeft();
            obama.move();
            obama.move(); 
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
            obama.move();
            obama.move();  
        }
    }
}
