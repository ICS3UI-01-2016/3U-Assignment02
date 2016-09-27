
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
public class a2q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //build race
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,3,0,Direction.EAST);
            //change color of robot
            candice.setColor(Color.black);
            //create walls
            new Wall(mtl,3,0,Direction.SOUTH);
            new Wall(mtl,3,1,Direction.SOUTH);
            new Wall(mtl,3,2,Direction.SOUTH);
            new Wall(mtl,3,3,Direction.SOUTH);
            new Wall(mtl,3,4,Direction.SOUTH);
            new Wall(mtl,3,5,Direction.SOUTH);
            new Wall(mtl,3,6,Direction.SOUTH);
            new Wall(mtl,3,7,Direction.SOUTH);
            new Wall(mtl,3,8,Direction.SOUTH);
            new Wall(mtl,3,0,Direction.EAST);
            new Wall(mtl,3,1,Direction.EAST);
            new Wall(mtl,3,3,Direction.EAST);
            new Wall(mtl,3,6,Direction.EAST);
            //place thing
            new Thing(mtl,3,8);
            //condition
            while(!candice.frontIsClear())
            {
                candice.turnLeft();
                candice.move();
                candice.turnLeft();
                candice.turnLeft();
                candice.turnLeft();
                candice.move();
                candice.turnLeft();
                candice.turnLeft();
                candice.turnLeft();
                candice.move();
                candice.turnLeft();
                while(candice.frontIsClear())
                {
                    candice.move();//up until here works fine
                
                    if(candice.canPickThing())//presently not working-assign.notdone
                    {
                        candice.pickThing();
                    }
                }
            }    
    }
}
