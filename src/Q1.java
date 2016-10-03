
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
 * @author tomlj9878
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot a = new Robot(JT,1,2,Direction.EAST);
        //create things
        new Thing(JT,1,3,Direction.EAST);
        new Thing(JT,1,4,Direction.EAST);
        new Thing(JT,1,5,Direction.EAST);
        new Thing(JT,1,6,Direction.EAST);
        new Thing(JT,1,7,Direction.EAST);
        new Thing(JT,1,8,Direction.EAST);
        new Thing(JT,1,9,Direction.EAST);
        new Thing(JT,1,10,Direction.EAST);
        new Thing(JT,1,11,Direction.EAST);
        new Thing(JT,1,12,Direction.EAST);
        //get things
        while(a.getAvenue()<9){
            a.move();
            if(a.canPickThing()){
                a.pickThing();
            }else{ 
                break;
                
                
}
        }
        a.move();
        a.move();
        a.move();
        a.move();
    }
}
