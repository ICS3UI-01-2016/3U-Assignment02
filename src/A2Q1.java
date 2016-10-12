
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
 * @author fabed2976
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city
        City PH = new City ();
        Robot kris = new Robot (PH, 1,1, Direction. EAST);
        
        // create a thing first
        new Thing (PH, 1,2);
        new Thing (PH, 1,3);
        new Thing (PH, 1,4);
        new Thing (PH, 1,5);
        new Thing (PH, 1,6);
        new Thing (PH, 1,7);
        new Thing (PH, 1,8);
        new Thing (PH, 1,9);
        new Thing (PH, 1,10);
        new Thing (PH, 1,11);
        
     // while loop with no condition
     while( kris.frontIsClear()) {
         kris.move();
         // check for something to pick up
         if(kris.countThingsInBackpack() <=6) {
             kris.pickThing();
          } else if(kris.countThingsInBackpack() >=6) {
             kris.move();
             kris.move();
             kris.move();
             break;
          }
             
             
         }
         
         
         
     }
     
    }











         
         
         
   
     
     
     
    
     
        
             
       
     
         
         
         
         
         
        
         
    
     
       
     
           
          
        
       
        
                
        
        
                
        
        
    

