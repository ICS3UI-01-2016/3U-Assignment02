
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woodc9217
 */
public class a2q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 0, 2, Direction.SOUTH);
        //change color of robot
        candice.setColor(Color.black);
        //build driveway,sidewalk,etc.
        new Wall(mtl, 0, 0, Direction.WEST);
        new Wall(mtl, 1, 0, Direction.WEST);
        new Wall(mtl, 2, 0, Direction.WEST);
        new Wall(mtl, 3, 0, Direction.WEST);
        new Wall(mtl, 4, 0, Direction.WEST);
        new Wall(mtl, 5, 0, Direction.WEST);
        new Wall(mtl, 6, 0, Direction.WEST);
        new Wall(mtl, 7, 0, Direction.WEST);
        new Wall(mtl, 8, 0, Direction.WEST);
        new Wall(mtl, 9, 0, Direction.WEST);
        //make ten walls going down avenue,starting east 2+ walls of previous
        //turns left sees driveway... cleans it out by going down and back dowwn and back
        new Wall(mtl, 0, 1, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.EAST);
        new Wall(mtl, 2, 1, Direction.EAST);
        new Wall(mtl, 3, 1, Direction.EAST);
        new Wall(mtl, 4, 1, Direction.EAST);
        new Wall(mtl, 5, 1, Direction.EAST);
        new Wall(mtl, 6, 1, Direction.EAST);
        new Wall(mtl, 7, 1, Direction.EAST);
        new Wall(mtl, 8, 1, Direction.EAST);
        new Wall(mtl, 9, 1, Direction.EAST);
        //moreee
        new Wall(mtl, 0, 2, Direction.EAST);
        new Wall(mtl, 3, 2, Direction.EAST);
        new Wall(mtl, 5, 2, Direction.EAST);
        new Wall(mtl, 6, 2, Direction.EAST);
        new Wall(mtl, 9, 2, Direction.EAST);
        //driveway 1
        new Wall(mtl, 1, 3, Direction.NORTH);
        new Wall(mtl, 1, 4, Direction.NORTH);
        new Wall(mtl, 1, 5, Direction.NORTH);
        new Wall(mtl, 1, 6, Direction.NORTH);
        //
        new Wall(mtl, 1, 6, Direction.EAST);
        new Wall(mtl, 2, 6, Direction.EAST);
        //
        new Wall(mtl, 2, 3, Direction.SOUTH);
        new Wall(mtl, 2, 4, Direction.SOUTH);
        new Wall(mtl, 2, 5, Direction.SOUTH);
        new Wall(mtl, 2, 6, Direction.SOUTH);
        //drivway 2
        new Wall(mtl, 4, 3, Direction.NORTH);
        new Wall(mtl, 4, 4, Direction.NORTH);
        new Wall(mtl, 4, 5, Direction.NORTH);
        //
        new Wall(mtl, 4, 5, Direction.EAST);
        //
        new Wall(mtl, 4, 3, Direction.SOUTH);
        new Wall(mtl, 4, 4, Direction.SOUTH);
        new Wall(mtl, 4, 5, Direction.SOUTH);
        //driveway 3
        new Wall(mtl, 7, 3, Direction.NORTH);
        new Wall(mtl, 7, 4, Direction.NORTH);
        new Wall(mtl, 7, 5, Direction.NORTH);
        new Wall(mtl, 7, 6, Direction.NORTH);
        new Wall(mtl, 7, 7, Direction.NORTH);
        //
        new Wall(mtl, 8, 3, Direction.SOUTH);
        new Wall(mtl, 8, 4, Direction.SOUTH);
        new Wall(mtl, 8, 5, Direction.SOUTH);
        new Wall(mtl, 8, 6, Direction.SOUTH);
        new Wall(mtl, 8, 7, Direction.SOUTH);
        //
        new Wall(mtl, 7, 7, Direction.EAST);
        new Wall(mtl, 8, 7, Direction.EAST);
        //Place things
        //driveway 1
        new Thing(mtl, 1, 2);
        new Thing(mtl, 1, 3);
        new Thing(mtl, 1, 4);
        new Thing(mtl, 1, 5);
        new Thing(mtl, 2, 2);
        new Thing(mtl, 2, 4);
        new Thing(mtl, 2, 6);
        //driveway 2
        new Thing(mtl, 4, 2);
        new Thing(mtl, 4, 3);
        new Thing(mtl, 4, 4);
        //driveway 3
        new Thing(mtl, 7, 2);
        new Thing(mtl, 7, 3);
        new Thing(mtl, 7, 7);
        new Thing(mtl, 8, 3);
        new Thing(mtl, 8, 4);
        new Thing(mtl, 8, 6);
        //while loop
        while (!candice.frontIsClear()) 
        {
            candice.turnLeft();
        }
        if (candice.frontIsClear()) 
        {
            //clean the driveway pickthing?move?
            candice.move();
        }
        if(candice.canPickThing())  
        {
            candice.pickThing();
        }
        if(!candice.canPickThing())
        {
            candice.turnLeft();
        }
        while(candice.frontIsClear())
        {
            candice.move();
        }







    }
}
