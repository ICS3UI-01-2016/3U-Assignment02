
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
 * @author bulka4927
 */
public class A2ProgrammingExcercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      City dc = new City();
      Robot lw = new Robot(dc,1,1,Direction.EAST);
      
      //placing things
      new Thing(dc,1,2);
      new Thing(dc,1,3);
      new Thing(dc,1,4);
      new Thing(dc,1,5);
      new Thing(dc,1,6);
      new Thing(dc,1,7);
      new Thing(dc,1,8);
      new Thing(dc,1,9);
      new Thing(dc,1,10);
      new Thing(dc,1,11);
      
      //robot picking things
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.pickThing();
      lw.move();
      lw.move();
      lw.move();
      lw.move();
              
    }
}
