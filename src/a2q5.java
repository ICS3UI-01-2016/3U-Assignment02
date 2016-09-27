
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
            Robot candice = new Robot (mtl,1,1,Direction.EAST);
            //change color of robot
            candice.setColor(Color.black);
            //build driveway,sidewalk,etc.
            new Wall(mtl,0,0,Direction.WEST);
            new Wall(mtl,1,0,Direction.WEST);
            new Wall(mtl,2,0,Direction.WEST);
            new Wall(mtl,3,0,Direction.WEST);
            new Wall(mtl,4,0,Direction.WEST);
            new Wall(mtl,5,0,Direction.WEST);
            new Wall(mtl,6,0,Direction.SOUTH);
            new Wall(mtl,7,0,Direction.SOUTH);
            new Wall(mtl,8,0,Direction.SOUTH);
            //make ten walls going down avenue,starting east 2+ walls of previous
            //turns left sees driveway... cleans it out by going down and back dowwn and back
    }
}
