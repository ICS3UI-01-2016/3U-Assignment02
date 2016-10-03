
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
 * @author petet9087
 */
public class ProgramExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City Go = new City ();
        // create a robot
        Robot guy = new Robot (Go,1,1,Direction.EAST);
        // create a new item
        new Thing (Go,1,2);
        new Thing (Go,1,3);
        new Thing (Go,1,4);
        new Thing (Go,1,5);
        new Thing (Go,1,6);
        new Thing (Go,1,7);
        new Thing (Go,1,8);
        new Thing (Go,1,9);
        new Thing (Go,1,10);
        new Thing (Go,1,11);
        
        while(guy.frontIsClear()){
            guy.move();            
            
            if(guy.canPickThing() && guy.countThingsInBackpack() < 7){
                guy.pickThing(); }     
            if (guy.getAvenue() == 12) {
                break;
            }
          
        }
        
     
        
    
    
    
    
    
    }
}
