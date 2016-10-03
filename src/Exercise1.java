
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
 * @author macdt8987
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City 
        City aaa = new City();
        // Create a Robot
        Robot xxx = new Robot(aaa,1,1,Direction.EAST);
        //Create things
        new Thing(aaa,1,2);
        new Thing(aaa,1,3);
        new Thing(aaa,1,4);
        new Thing(aaa,1,5);
        new Thing(aaa,1,6);
        new Thing(aaa,1,7);
        new Thing(aaa,1,8);
        new Thing(aaa,1,9);
        new Thing(aaa,1,10);
        new Thing(aaa,1,11);
        //Make Robot Move
        while(xxx.frontIsClear())
        {
            xxx.move();
            if(xxx.canPickThing()){
                xxx.pickThing();
            }
            if(xxx.countThingsInBackpack() ==7){
              break;  
            }
         
        } 
    xxx.move();
    xxx.move();
    xxx.move();
    xxx.move();
    }
   
}
