
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


        City af = new City();
        new Wall(af, 1, 1, Direction.SOUTH);
        new Wall(af, 1, 1, Direction.NORTH);
        new Wall(af, 1, 1, Direction.EAST);
        new Wall(af, 1, 1, Direction.WEST);
        new Wall(af, 1, 4, Direction.SOUTH);
        new Wall(af, 1, 4, Direction.WEST);
        new Wall(af, 1, 4, Direction.NORTH);
        new Wall(af, 1, 4, Direction.EAST);
        new Wall(af, 4, 1, Direction.SOUTH);
        new Wall(af, 4, 1, Direction.NORTH);
        new Wall(af, 4, 1, Direction.EAST);
        new Wall(af, 4, 1, Direction.WEST);
        new Wall(af, 4, 4, Direction.SOUTH);
        new Wall(af, 4, 4, Direction.NORTH);
        new Wall(af, 4, 4, Direction.EAST);
        new Wall(af, 4, 4, Direction.WEST);
        new Wall(af, 3, 2, Direction.WEST);
        new Wall(af, 2, 2, Direction.WEST);
        new Wall(af, 2, 3, Direction.EAST);
        new Wall(af, 3, 3, Direction.EAST);
        new Wall(af, 2, 2, Direction.NORTH);
        new Wall(af, 2, 3, Direction.NORTH);
        new Wall(af, 3, 2, Direction.SOUTH);
        new Wall(af, 3, 3, Direction.SOUTH);



        Robot rem = new Robot(af, 2, 1, Direction.NORTH);

        while (true) {
            // Make Rem rotate around the castle
            if (rem.frontIsClear()) {
                rem.turnLeft();
                rem.turnLeft();
                rem.turnLeft();
                rem.move();
                rem.move();
                rem.turnLeft();
                rem.turnLeft();
                rem.turnLeft();
                rem.move();
                rem.move();
                rem.turnLeft();
                rem.turnLeft();
                rem.turnLeft();
                rem.move();






                // Make Rem go around the towers
            } else if (!rem.frontIsClear()) {
                rem.turnLeft();
                rem.move();






            }

        }
    }
}
