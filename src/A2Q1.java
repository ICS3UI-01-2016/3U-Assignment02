
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing; 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kpl = new City(); 
        
        //integers 
        int PickingUpThings = 0;
        
        //create a robot
        Robot obama = new Robot(kpl,1,1,Direction.EAST);
        
        //Make a thing 
        new Thing(kpl,1,2); 
        new Thing(kpl,1,3); 
        new Thing(kpl,1,4); 
        new Thing(kpl,1,5); 
        new Thing(kpl,1,6); 
        new Thing(kpl,1,7);
        new Thing(kpl,1,8); 
        new Thing(kpl,1,9); 
        new Thing(kpl,1,10);
        new Thing(kpl,1,11); 
       
        //get obama to move
        while(obama.frontIsClear()){
            obama.move();
            if(obama.getAvenue()==12){
                break;
        }
        //get obama to pick up things    
        if(obama.canPickThing()){ 
            if(obama.countThingsInBackpack() <7){
                obama.pickThing();
            }
        }
        }
}
}
      

            
     
