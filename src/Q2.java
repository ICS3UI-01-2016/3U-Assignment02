
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
 * @author tomlj9878
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot b = new Robot(JT,1,1,Direction.EAST);
        //Create walls/ hurdles
        new Wall(JT,1,1,Direction.EAST);
        new Wall(JT,1,1,Direction.SOUTH);
        new Wall(JT,1,2,Direction.EAST);
        new Wall(JT,1,2,Direction.SOUTH);
        new Wall(JT,1,3,Direction.SOUTH);
        new Wall(JT,1,4,Direction.EAST);
        new Wall(JT,1,4,Direction.SOUTH);
        new Wall(JT,1,5,Direction.SOUTH);
        new Wall(JT,1,6,Direction.SOUTH);
        new Wall(JT,1,7,Direction.SOUTH);
        new Wall(JT,1,7,Direction.EAST);
        new Wall(JT,1,8,Direction.SOUTH);
        new Wall(JT,1,9,Direction.SOUTH);
        //create thing
        new Thing(JT,1,9,Direction.EAST);
        //move B
        while(b.getAvenue()<9){
            if(!b.frontIsClear()){
                b.turnLeft();
                b.move();
                b.turnLeft();
                b.turnLeft();
                b.turnLeft();
                b.move();
                b.turnLeft();
                b.turnLeft();
                b.turnLeft();
                b.move();
                b.turnLeft();   
            }else if (b.frontIsClear()){
                b.move();
                
            }
            }
 }
}
