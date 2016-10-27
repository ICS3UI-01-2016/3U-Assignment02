
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new city
        City kw = new City ();
        //create new robot
        Robot karel= new Robot (kw,5737,7748,Direction.WEST);
        //GET KAREL TO FACE THE RIGHT DIRECION
        while (karel.getDirection()!=Direction.NORTH){
            karel.turnLeft();}
        
        {while(karel.getStreet()!=0)
                karel.move();}
            
            karel.turnLeft();
            
            { while (karel.getAvenue()!=0)
            karel.move();
                
            
            
         
    
        
            
    }
    }
}
    



    
