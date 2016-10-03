
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot c = new Robot(JT,-5,-8,Direction.EAST);
        //move robot to avenue 0 first
        while(c.getAvenue()!=0 || c.getStreet()!=0){
            if(c.getAvenue()>0){
                c.move();
                if(c.getDirection()==Direction.EAST){
                    c.turnLeft();
                    c.turnLeft();
                }if(c.getDirection()==Direction.NORTH){
                    c.turnLeft();
                }if(c.getDirection()==Direction.SOUTH){
                    c.turnLeft();
                    c.turnLeft();
                    c.turnLeft();
                }
            }if(c.getAvenue()<0){
                c.move();
                if(c.getDirection()==Direction.WEST){
                    c.turnLeft();
                    c.turnLeft();
                }if(c.getDirection()==Direction.NORTH){
                    c.turnLeft();
                    c.turnLeft();
                    c.turnLeft();
                }if(c.getDirection()==Direction.SOUTH){
                    c.turnLeft();    
                }
         // move robot to street 0
            }if(c.getStreet()>0){
                c.move();
                if(c.getDirection()==Direction.EAST){
                    c.turnLeft();
                }if(c.getDirection()==Direction.SOUTH){
                    c.turnLeft();
                    c.turnLeft();
                }if(c.getDirection()==Direction.WEST){
                    c.turnLeft();
                    c.turnLeft();
                    c.turnLeft();
                }
            }if(c.getStreet()<0){
                c.move();
                if(c.getDirection()==Direction.EAST){
                    c.turnLeft();
                    c.turnLeft();
                    c.turnLeft();
                }if(c.getDirection()==Direction.WEST){
                    c.turnLeft();
                }if(c.getDirection()==Direction.NORTH){
                    c.turnLeft();
                    c.turnLeft();
                }
            }
         }
     }
 }

          

                
        
       

