
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
 * @author ANNT0773
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw=new City();
        Robot a=new Robot(kw,3,4,Direction.EAST);
        
        while(a.frontIsClear()){
            a.turnLeft();
            a.move();
            a.move();
            
            
             
            }
        }
        // TODO code application logic here
    }

