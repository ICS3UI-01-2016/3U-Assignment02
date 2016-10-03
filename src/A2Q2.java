
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 1, 1, Direction.EAST);

        //create hurdles
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.EAST);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 9, Direction.SOUTH);

        //create thing and get robot to move
        new Thing(kw, 1, 9);

        //create if statement  
        while (rick.isBesideThing(IPredicate.aWall)) {
              
            if (rick.frontIsClear()) {
                rick.move();
            } else {
                rick.turnLeft();
                rick.move();
                rick.turnLeft();
                rick.turnLeft();
                rick.turnLeft();
                rick.move();
                rick.turnLeft();
                rick.turnLeft();
                rick.turnLeft();
                rick.move();
                rick.turnLeft();
            }if (rick.canPickThing()){
            break;
            }
            }
        }
    }

