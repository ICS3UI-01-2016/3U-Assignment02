
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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kpl = new City(); 
        
        //create two robots 
        Robot obama = new Robot(kpl,0,2,Direction.SOUTH); 
        Robot trump = new Robot(kpl,0,2,Direction.SOUTH);
        
        //give robots initials 
        obama.setLabel("O");
        trump.setLabel("T");
        
        //create walls 
        new Wall(kpl,0,0,Direction.WEST); 
        new Wall(kpl,1,0,Direction.WEST); 
        new Wall(kpl,2,0,Direction.WEST); 
        new Wall(kpl,3,0,Direction.WEST); 
        new Wall(kpl,4,0,Direction.WEST); 
        new Wall(kpl,5,0,Direction.WEST); 
        new Wall(kpl,6,0,Direction.WEST); 
        new Wall(kpl,7,0,Direction.WEST); 
        new Wall(kpl,8,0,Direction.WEST); 
        new Wall(kpl,9,0,Direction.WEST); 
        new Wall(kpl,0,1,Direction.EAST); 
        new Wall(kpl,1,1,Direction.EAST);
        new Wall(kpl,2,1,Direction.EAST); 
        new Wall(kpl,3,1,Direction.EAST); 
        new Wall(kpl,4,1,Direction.EAST); 
        new Wall(kpl,5,1,Direction.EAST);
        new Wall(kpl,6,1,Direction.EAST); 
        new Wall(kpl,7,1,Direction.EAST); 
        new Wall(kpl,8,1,Direction.EAST); 
        new Wall(kpl,9,1,Direction.EAST); 
        new Wall(kpl,0,2,Direction.EAST);
        new Wall(kpl,3,2,Direction.EAST);
        new Wall(kpl,5,2,Direction.EAST);
        new Wall(kpl,6,2,Direction.EAST);
        new Wall(kpl,9,2,Direction.EAST);
        new Wall(kpl,1,3,Direction.NORTH);
        new Wall(kpl,1,4,Direction.NORTH);
        new Wall(kpl,1,5,Direction.NORTH);
        new Wall(kpl,1,6,Direction.NORTH);
        new Wall(kpl,4,3,Direction.NORTH);
        new Wall(kpl,4,4,Direction.NORTH);
        new Wall(kpl,4,5,Direction.NORTH);
        new Wall(kpl,7,3,Direction.NORTH);
        new Wall(kpl,7,4,Direction.NORTH);
        new Wall(kpl,7,5,Direction.NORTH);
        new Wall(kpl,7,6,Direction.NORTH);
        new Wall(kpl,7,7,Direction.NORTH);
        new Wall(kpl,2,3,Direction.SOUTH);
        new Wall(kpl,2,4,Direction.SOUTH);
        new Wall(kpl,2,5,Direction.SOUTH);
        new Wall(kpl,2,6,Direction.SOUTH);
        new Wall(kpl,4,3,Direction.SOUTH);
        new Wall(kpl,4,4,Direction.SOUTH);
        new Wall(kpl,4,5,Direction.SOUTH);
        new Wall(kpl,8,3,Direction.SOUTH);
        new Wall(kpl,8,4,Direction.SOUTH);
        new Wall(kpl,8,5,Direction.SOUTH);
        new Wall(kpl,8,6,Direction.SOUTH);
        new Wall(kpl,8,7,Direction.SOUTH);
        new Wall(kpl,9,2,Direction.SOUTH);
        new Wall(kpl,1,6,Direction.EAST);
        new Wall(kpl,2,6,Direction.EAST);
        new Wall(kpl,4,5,Direction.EAST);
        new Wall(kpl,7,7,Direction.EAST);
        new Wall(kpl,8,7,Direction.EAST);
       
        //place snow on the driveways and sidewalk (things)
        new Thing(kpl,1,2);
        new Thing(kpl,1,3);
        new Thing(kpl,1,4);
        new Thing(kpl,1,5);
        new Thing(kpl,2,2);
        new Thing(kpl,2,4);
        new Thing(kpl,2,6);
        new Thing(kpl,4,2);
        new Thing(kpl,4,3);
        new Thing(kpl,4,4);
        new Thing(kpl,7,2);
        new Thing(kpl,7,3);
        new Thing(kpl,7,7);
        new Thing(kpl,8,3);
        new Thing(kpl,8,4);
        new Thing(kpl,8,6);
        
        //get the robots to pick up snow (things) on the driveways and sidewalk 
        while(obama.frontIsClear()){
            
            //if there is a driveway
            obama.turnLeft();
            if(!obama.frontIsClear()){
                obama.turnLeft();
                obama.turnLeft();
                obama.turnLeft();
                obama.move();
            }else{
                while(obama.frontIsClear()){
                    obama.move();
                    if(obama.canPickThing()){
                        obama.pickThing();
                    }
                }
              obama.turnLeft();
              obama.turnLeft();
              obama.turnLeft();
              while(obama.frontIsClear()){
                  obama.move();
              }
              obama.turnLeft();
              obama.turnLeft();
              obama.turnLeft();
              obama.move();
            }
        }
        while(trump.frontIsClear()){
            trump.move();
            if(trump.canPickThing()){
                trump.pickThing();
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
