
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City af = new City();
        // make shovelBot
        Robot karel = new Robot(af, 1, 3, Direction.SOUTH);
        Robot tina = new Robot(af, 1, 3, Direction.SOUTH);
        
        // make snow
        new Thing(af, 2, 3);
        new Thing(af, 2, 4);
        new Thing(af, 2, 5);
        new Thing(af, 2, 6);
        new Thing(af, 3, 7);
        new Thing(af, 3, 5);
        new Thing(af, 3, 3);
        new Thing(af, 5, 3);
        new Thing(af, 5, 4);
        new Thing(af, 5, 5);
        new Thing(af, 8, 3);
        new Thing(af, 8, 4);
        new Thing(af, 9, 4);
        new Thing(af, 9, 5);
        new Thing(af, 9, 7);
        new Thing(af, 8, 8);
        new Thing(af, 2, 7);

        karel.setLabel("K");
        tina.setLabel("T");
        karel.setColor(Color.BLUE);





        // make Road
        new Wall(af, 1, 1, Direction.WEST);
        new Wall(af, 2, 1, Direction.WEST);
        new Wall(af, 3, 1, Direction.WEST);
        new Wall(af, 4, 1, Direction.WEST);
        new Wall(af, 5, 1, Direction.WEST);
        new Wall(af, 6, 1, Direction.WEST);
        new Wall(af, 7, 1, Direction.WEST);
        new Wall(af, 8, 1, Direction.WEST);
        new Wall(af, 9, 1, Direction.WEST);
        new Wall(af, 10, 1, Direction.WEST);
        
        // make sidewalk
        new Wall(af, 1, 2, Direction.EAST);
        new Wall(af, 2, 2, Direction.EAST);
        new Wall(af, 3, 2, Direction.EAST);
        new Wall(af, 4, 2, Direction.EAST);
        new Wall(af, 5, 2, Direction.EAST);
        new Wall(af, 6, 2, Direction.EAST);
        new Wall(af, 7, 2, Direction.EAST);
        new Wall(af, 8, 2, Direction.EAST);
        new Wall(af, 9, 2, Direction.EAST);
        new Wall(af, 10, 2, Direction.EAST);
        new Wall(af, 1, 3, Direction.EAST);
        new Wall(af, 4, 3, Direction.EAST);
        new Wall(af, 6, 3, Direction.EAST);
        new Wall(af, 7, 3, Direction.EAST);
        new Wall(af, 10, 3, Direction.EAST);
        new Wall(af, 10, 3, Direction.SOUTH);
        
        // make driveway
        new Wall(af, 2, 4, Direction.NORTH);
        new Wall(af, 2, 5, Direction.NORTH);
        new Wall(af, 2, 6, Direction.NORTH);
        new Wall(af, 2, 7, Direction.NORTH);
        new Wall(af, 2, 7, Direction.EAST);
        new Wall(af, 3, 7, Direction.EAST);
        new Wall(af, 3, 7, Direction.SOUTH);
        new Wall(af, 3, 6, Direction.SOUTH);
        new Wall(af, 3, 5, Direction.SOUTH);
        new Wall(af, 3, 4, Direction.SOUTH);
        new Wall(af, 5, 4, Direction.NORTH);
        new Wall(af, 5, 5, Direction.NORTH);
        new Wall(af, 5, 6, Direction.NORTH);
        new Wall(af, 5, 6, Direction.EAST);
        new Wall(af, 5, 6, Direction.SOUTH);
        new Wall(af, 5, 5, Direction.SOUTH);
        new Wall(af, 5, 4, Direction.SOUTH);
        new Wall(af, 8, 4, Direction.NORTH);
        new Wall(af, 8, 5, Direction.NORTH);
        new Wall(af, 8, 6, Direction.NORTH);
        new Wall(af, 8, 7, Direction.NORTH);
        new Wall(af, 8, 8, Direction.NORTH);
        new Wall(af, 8, 8, Direction.EAST);
        new Wall(af, 9, 8, Direction.EAST);
        new Wall(af, 9, 8, Direction.SOUTH);
        new Wall(af, 9, 7, Direction.SOUTH);
        new Wall(af, 9, 6, Direction.SOUTH);
        new Wall(af, 9, 5, Direction.SOUTH);
        new Wall(af, 9, 4, Direction.SOUTH);

        while (true) {
            // Everytime he skips 3 Avenue and 3 Streets down the sidwalk, Karel moves without picking up snow
            if (karel.canPickThing() && (karel.getAvenue() == 3)) {
                karel.turnLeft();
                karel.move();



            } else if (karel.getDirection() == Direction.WEST && (!karel.frontIsClear())) {
                karel.turnLeft();

            } else if (karel.getStreet() == 10 && (karel.getAvenue()) == 3) {

                break;
                //When karel is near garage he turns right
            } else if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            } else if (karel.canPickThing()) {
                karel.pickThing();
                karel.move();
                // When karel has no snow to pick up he moves
            } else if (!karel.canPickThing() && (karel.getDirection() == Direction.WEST)) {
                karel.move();
                // Karel going through the sidewalk
            } else if (karel.getDirection() == Direction.SOUTH && (karel.frontIsClear())) {
                karel.move();
            } else if (karel.canPickThing() && (karel.getAvenue() == 3)) {
                karel.turnLeft();
            } else if (karel.getStreet() > 6 && (karel.getDirection() == Direction.EAST && (!karel.canPickThing()))) {
                karel.move();



            }

        }
        while (true) {

            //Tina picks up all the left over snow and stores it at end
            if (tina.canPickThing()) {

                tina.pickThing();


            }
            if (tina.frontIsClear()) {
                tina.move();
            } else if (tina.getAvenue() == 3 && (tina.getStreet() == 10)) {
                karel.putThing();
                break;

            }
        }
        
    }
}