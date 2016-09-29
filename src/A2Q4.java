
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE kingJava = new RobotSE(kw,2,0,Direction.NORTH);
        kingJava.setLabel("KingJava");
        kingJava.setColor(Color.blue);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.EAST);
        new Wall(kw,4,1,Direction.SOUTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.EAST);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,4,4,Direction.SOUTH);
        new Wall(kw,2,2,Direction.NORTH);
        new Wall(kw,2,2,Direction.WEST);
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,3,Direction.EAST);
        new Wall(kw,3,3,Direction.SOUTH);
        while(true){
            kingJava.move();
            kingJava.move();
            kingJava.turnRight();
            kingJava.move();
            kingJava.move();
            kingJava.turnRight();
            kingJava.move();
            kingJava.turnLeft();
            kingJava.move();
            kingJava.turnLeft();
            kingJava.move();
            kingJava.turnRight();
        }
    }
}
