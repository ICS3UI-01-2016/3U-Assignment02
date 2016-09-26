
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Robot;
import becker.robots.Wall;
      
        

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City af = new City();
        Robot Rem = new Robot(af,1,1,Direction.EAST);
        
        // create hurdles
        new Wall(af,1,1,Direction.SOUTH);
        new Wall(af,1,2,Direction.SOUTH);
        new Wall(af,1,3,Direction.SOUTH);
        new Wall(af,1,4,Direction.SOUTH);
        new Wall(af,1,5,Direction.SOUTH);
        new Wall(af,1,6,Direction.SOUTH);
        new Wall(af,1,7,Direction.SOUTH);
        new Wall(af,1,8,Direction.SOUTH);
        new Wall(af,1,9,Direction.SOUTH);
        new Wall(af,1,7,Direction.EAST);
        new Wall(af,1,1,Direction.EAST);
        new Wall(af,1,2,Direction.EAST);
        new Wall(af,1,4,Direction.EAST);
        new Thing(af,1,9);
       
        // make rem 'jump' hurdles
        while (!Rem.canPickThing()) { 

            if (!Rem.frontIsClear()) {
                Rem.turnLeft();
                Rem.move();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.move();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.move();
                Rem.turnLeft();
            }
            if (Rem.frontIsClear()) {
                Rem.move();
            }
            
        }
                // make rem pick up thing
                Rem.pickThing();
    }
    
}

