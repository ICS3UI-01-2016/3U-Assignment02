
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make Cioty
        City aaa = new City();
        // Make robot
        RobotSE xxx = new RobotSE (aaa,0,2,Direction.SOUTH);
        RobotSE tina = new RobotSE(aaa,0,2,Direction.SOUTH);
        // Make the Walls
        new Wall(aaa,0,0,Direction.WEST);
        new Wall(aaa,1,0,Direction.WEST);
        new Wall(aaa,2,0,Direction.WEST);
        new Wall(aaa,3,0,Direction.WEST);
        new Wall(aaa,4,0,Direction.WEST);
        new Wall(aaa,5,0,Direction.WEST);
        new Wall(aaa,6,0,Direction.WEST);
        new Wall(aaa,7,0,Direction.WEST);
        new Wall(aaa,8,0,Direction.WEST);
        new Wall(aaa,9,0,Direction.WEST);
        new Wall(aaa,0,1,Direction.EAST);
        new Wall(aaa,1,1,Direction.EAST);
        new Wall(aaa,2,1,Direction.EAST);
        new Wall(aaa,3,1,Direction.EAST);
        new Wall(aaa,4,1,Direction.EAST);
        new Wall(aaa,5,1,Direction.EAST);
        new Wall(aaa,6,1,Direction.EAST);
        new Wall(aaa,7,1,Direction.EAST);
        new Wall(aaa,8,1,Direction.EAST);
        new Wall(aaa,9,1,Direction.EAST);
        new Wall(aaa,0,2,Direction.EAST);
        new Wall(aaa,1,3,Direction.NORTH);
        new Wall(aaa,1,4,Direction.NORTH);
        new Wall(aaa,1,5,Direction.NORTH);
        new Wall(aaa,1,6,Direction.NORTH);
        new Wall(aaa,1,6,Direction.EAST);
        new Wall(aaa,2,6,Direction.EAST);
        new Wall(aaa,2,3,Direction.SOUTH);
        new Wall(aaa,2,4,Direction.SOUTH);
        new Wall(aaa,2,5,Direction.SOUTH);
        new Wall(aaa,2,6,Direction.SOUTH);
        new Wall(aaa,3,2,Direction.EAST);
        new Wall(aaa,4,3,Direction.NORTH);
        new Wall(aaa,4,4,Direction.NORTH);
        new Wall(aaa,4,5,Direction.NORTH);
        new Wall(aaa,4,5,Direction.EAST);
        new Wall(aaa,4,3,Direction.SOUTH);
        new Wall(aaa,4,4,Direction.SOUTH);
        new Wall(aaa,4,5,Direction.SOUTH);
        new Wall(aaa,5,2,Direction.EAST);
        new Wall(aaa,6,2,Direction.EAST);
        new Wall(aaa,7,3,Direction.NORTH);
        new Wall(aaa,7,4,Direction.NORTH);
        new Wall(aaa,7,5,Direction.NORTH);
        new Wall(aaa,7,6,Direction.NORTH);
        new Wall(aaa,7,7,Direction.NORTH);
        new Wall(aaa,7,7,Direction.EAST);
        new Wall(aaa,8,7,Direction.EAST);
        new Wall(aaa,8,3,Direction.SOUTH);
        new Wall(aaa,8,4,Direction.SOUTH);
        new Wall(aaa,8,5,Direction.SOUTH);
        new Wall(aaa,8,6,Direction.SOUTH);
        new Wall(aaa,8,7,Direction.SOUTH);
        new Wall(aaa,9,2,Direction.EAST);
        new Wall(aaa,9,2,Direction.SOUTH);
        //Make things
        new Thing(aaa,1,2);
        new Thing(aaa,2,2);
        new Thing(aaa,1,3);
        new Thing(aaa,1,4);
        new Thing(aaa,1,5);
        new Thing(aaa,2,4);
        new Thing(aaa,2,6);
        new Thing(aaa,4,2);
        new Thing(aaa,4,3);
        new Thing(aaa,4,4);
        new Thing(aaa,7,2);
        new Thing(aaa,7,3);
        new Thing(aaa,8,3);
        new Thing(aaa,8,4);
        new Thing(aaa,7,7);
        new Thing(aaa,8,6);
        // Overall Loop
        while(xxx.frontIsClear()){
            // Determine if Driveway
            xxx.turnLeft();
            if(!xxx.frontIsClear()){
                xxx.turnRight();
                xxx.move();
            }else{
                //Found Driveway
                while(xxx.frontIsClear()){
                    xxx.move();
                    if(xxx.canPickThing()){
                      xxx.pickThing();
                      
                      
      
                      }
                  
                   
                }
                 xxx.turnAround();
                 while(xxx.frontIsClear()){
                     xxx.move();
                 }
                    xxx.turnLeft();
                    xxx.move();
                    
        
                }
                //End of Else
            
        } // End of While
        
        //Set Tina colour
        tina.setColor(Color.black);
        
         //Make Tina Loop
        while(tina.frontIsClear()){
            tina.move();
            if(tina.canPickThing()){
                tina.pickThing();
            }
        }
           
            
              
               
    
    
    
    
    }
                
            
                
            
    
}
