
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw=new City();
        //create robot
        Robot ok=new Robot(kw,1,1,Direction.EAST);
        //build some walls
        new Wall (kw,1,1,Direction.SOUTH);
        new Wall (kw,1,2,Direction.SOUTH);
        new Wall (kw,1,3,Direction.SOUTH);
        new Wall (kw,1,4,Direction.SOUTH);
        new Wall (kw,1,5,Direction.SOUTH);
        new Wall (kw,1,6,Direction.SOUTH);
        new Wall (kw,1,7,Direction.SOUTH);
        new Wall (kw,1,8,Direction.SOUTH);
        new Wall (kw,1,9,Direction.SOUTH);
        new Wall (kw,1,2,Direction.WEST);
        new Wall (kw,1,6,Direction.WEST);
        new Wall (kw,1,3,Direction.WEST);
        new Wall (kw,1,4,Direction.WEST);
        //create thing
         new Thing (kw,1,9); 
         
        while (!ok.canPickThing()){
           if(!ok.frontIsClear()){
               ok.turnLeft();
               ok.move();
              ok.turnLeft();
              ok.turnLeft();
              ok.turnLeft();
              ok.move();
              ok.turnLeft();
              ok.turnLeft();
              ok.turnLeft();
              ok.move();
              ok.turnLeft();
           }else{
               ok.move();
           }
            
    }
}
}