
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot d = new Robot(JT,0,1,Direction.EAST);
        //create walls 4 castle
        new Wall(JT,1,1,Direction.EAST);
        new Wall(JT,1,1,Direction.NORTH);
        new Wall(JT,1,1,Direction.SOUTH);
        new Wall(JT,1,1,Direction.WEST);
        new Wall(JT,1,4,Direction.EAST);
        new Wall(JT,1,4,Direction.SOUTH);
        new Wall(JT,1,4,Direction.NORTH);
        new Wall(JT,1,4,Direction.WEST);
        new Wall(JT,4,1,Direction.EAST);
        new Wall(JT,4,1,Direction.NORTH);
        new Wall(JT,4,1,Direction.SOUTH);
        new Wall(JT,4,1,Direction.WEST);
        new Wall(JT,4,4,Direction.EAST);
        new Wall(JT,4,4,Direction.NORTH);
        new Wall(JT,4,4,Direction.WEST);
        new Wall(JT,4,4,Direction.SOUTH);
        new Wall(JT,2,2,Direction.NORTH);
        new Wall(JT,2,2,Direction.WEST);
        new Wall(JT,2,3,Direction.NORTH);
        new Wall(JT,2,3,Direction.EAST);
        new Wall(JT,3,2,Direction.WEST);
        new Wall(JT,3,2,Direction.SOUTH);
        new Wall(JT,3,3,Direction.EAST);
        new Wall(JT,3,3,Direction.SOUTH);
        //move d around wall
        while(d.getCity()==JT){
            d.move();
            d.turnLeft();
            d.turnLeft();
            d.turnLeft();
            d.move();
            d.turnLeft();
            d.move();
            d.turnLeft();
            d.move();
            d.turnLeft();
            d.turnLeft();
            d.turnLeft();
            d.move();
            d.move();
            d.turnLeft();
            d.turnLeft();
            d.turnLeft();
            d.move();
            
            }
            
        }
    }
