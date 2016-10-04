
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City PH = new City ();
         Robot kris = new Robot (PH, 1,3, Direction.SOUTH);
         
         new Wall (PH, 1,2, Direction. EAST);
         new Wall (PH, 2,2, Direction. EAST);
         new Wall (PH, 3,2, Direction. EAST);
         new Wall (PH, 4,2, Direction. EAST);
         new Wall (PH, 5,2, Direction. EAST);
         new Wall (PH, 6,2, Direction. EAST);
         new Wall (PH, 7,2, Direction. EAST);
         new Wall (PH, 8,2, Direction. EAST);
         new Wall (PH, 9,2, Direction. EAST);
         new Wall (PH, 10,2, Direction. EAST);
         new Wall (PH, 1,1, Direction. WEST);
         new Wall (PH, 2,1, Direction. WEST);
         new Wall (PH, 3,1, Direction. WEST);
         new Wall (PH, 4,1, Direction. WEST);
         new Wall (PH, 5,1, Direction. WEST);
         new Wall (PH, 6,1, Direction. WEST);
         new Wall (PH, 7,1, Direction. WEST);
         new Wall (PH, 8,1, Direction. WEST);
         new Wall (PH, 9,1, Direction. WEST);
         new Wall (PH, 10,1, Direction. WEST);
         new Wall (PH, 1,3, Direction. EAST);
         new Wall (PH, 2,4, Direction. NORTH);
         new Wall (PH, 2,5, Direction. NORTH);
         new Wall (PH, 2,6, Direction. NORTH);
         new Wall (PH, 2,7, Direction. NORTH);
         new Wall (PH, 2,7, Direction. EAST);
         new Wall (PH,3,7, Direction. EAST);
         new Wall (PH, 3,4, Direction. SOUTH);
         new Wall (PH, 3,5, Direction. SOUTH);
         new Wall (PH, 3,6, Direction. SOUTH);
         new Wall (PH, 3,7, Direction. SOUTH);
         new Wall (PH, 4,3, Direction. EAST);
         new Wall (PH, 5,4, Direction. NORTH);
         new Wall (PH, 5,5, Direction. NORTH);
         new Wall (PH, 5,6, Direction. NORTH);
         new Wall (PH, 5,6, Direction. EAST);
         new Wall (PH, 5,4, Direction. SOUTH);
         new Wall (PH, 5,5, Direction. SOUTH);
         new Wall (PH, 5,6, Direction. SOUTH);
         new Wall (PH, 6,3, Direction. EAST);
         new Wall (PH, 7,3, Direction. EAST);
         new Wall (PH, 8,4, Direction. NORTH);
         new Wall (PH, 8,5, Direction. NORTH);
         new Wall (PH, 8,6, Direction. NORTH);
         new Wall (PH, 8,7, Direction. NORTH);
         new Wall (PH, 8,8, Direction. NORTH);
         new Wall (PH, 8,8, Direction. EAST);
         new Wall (PH, 9,8, Direction. EAST);
         new Wall (PH, 9,4, Direction. SOUTH);
         new Wall (PH, 9,5, Direction. SOUTH);
         new Wall (PH, 9,6, Direction. SOUTH);
         new Wall (PH, 9,7, Direction. SOUTH);
         new Wall (PH, 9,8, Direction. SOUTH);
         new Wall (PH, 10,3, Direction. EAST);
         new Wall (PH, 10,3, Direction. SOUTH);
         new Thing (PH, 2,3);
         new Thing (PH, 3,3);
         new Thing (PH, 5,3);
         new Thing (PH, 8,3 );
         new Thing (PH, 2,4);
         new Thing (PH, 2,5);
         new Thing (PH, 2,6);
         new Thing (PH, 3,5);
         new Thing (PH, 3,7);
         new Thing (PH, 5,4);
         new Thing (PH, 5,5);
         new Thing (PH, 8,4);
         new Thing (PH, 9,4);
         new Thing (PH, 9,5);
         new Thing (PH, 9,7);
         new Thing (PH, 8,8);
         
         kris.move();
         kris.turnLeft();
         
         
         if (!kris.frontIsClear()){
             kris.turnLeft();
             kris.turnLeft();
             kris.turnLeft();
             kris.move();
             
         } else {
              while(kris.frontIsClear()){
                  kris.move();
                  if(kris.canPickThing())
                  kris.pickThing();
              }
              while (!kris.frontIsClear()){
                  kris.turnLeft();
                  kris.turnLeft();
                  kris.turnLeft();
                  kris.move();
                  kris.turnLeft();
                  kris.turnLeft();
                  kris.turnLeft();
                  if(kris.canPickThing()){
                      kris.pickThing();
                      kris.move();
                      kris.move();
                      kris.pickThing();
                      kris.move();
                      kris.move();
                      kris.turnLeft();
                      kris.move();
                  }
                  while (kris.frontIsClear()){
                      kris.move();
                      kris.turnLeft();
                      kris.move();
                      kris.pickThing();
                      kris.move();
                      kris.pickThing();
                      kris.turnLeft();
                      kris.turnLeft();
                      kris.move();
                      if (!kris.frontIsClear()){
                          kris.move();
                          
                      }
                      
                    
                      
                      
                  }
                      
                      }
  
                      }
                      
                   
                              
                          }
                       
                         
                          
                      }
                     
                      
                      
                      
                      
                  
                    
                  
         
                  
                  
              
         
    


                    
               
                  
                  
                  
                  
                  
                    
                    
                        
                    
              
              
                    
                  
                  
                    
                    
                
                      
                      
                  
                      
                  
                      
                      
                       
                     
                      
                     
                      
                  
                  
                  
                          
              
                  
                  
             
           
             
         
             
           
             
           
              
                    
                 
             
         
   

