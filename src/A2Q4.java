import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Robot;
import becker.robots.Wall;
      
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);

        Robot Rem = new Robot(kw, 2, 1, Direction.NORTH);

        while (true) {
            // Karel rotating around the castle
            if (Rem.frontIsClear()) {
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.move();
                Rem.move();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.move();
                Rem.move();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.turnLeft();
                Rem.move();






                //Karel going around the towers
            } else if (!Rem.frontIsClear()) {
                Rem.turnLeft();
                Rem.move();






            }

        }
    }
}
