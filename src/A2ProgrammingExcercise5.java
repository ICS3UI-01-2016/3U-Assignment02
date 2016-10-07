
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A2ProgrammingExcercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City ko = new City();
        //create a robot
        Robot kar = new Robot(ko, 0, 2, Direction.SOUTH);
        Robot ti = new Robot(ko, 0, 2, Direction.SOUTH);

        //creating walls
        new Wall(ko, 0, 0, Direction.WEST);
        new Wall(ko, 1, 0, Direction.WEST);
        new Wall(ko, 2, 0, Direction.WEST);
        new Wall(ko, 3, 0, Direction.WEST);
        new Wall(ko, 4, 0, Direction.WEST);
        new Wall(ko, 5, 0, Direction.WEST);
        new Wall(ko, 6, 0, Direction.WEST);
        new Wall(ko, 7, 0, Direction.WEST);
        new Wall(ko, 8, 0, Direction.WEST);
        new Wall(ko, 9, 0, Direction.WEST);

        new Wall(ko, 0, 1, Direction.EAST);
        new Wall(ko, 1, 1, Direction.EAST);
        new Wall(ko, 2, 1, Direction.EAST);
        new Wall(ko, 3, 1, Direction.EAST);
        new Wall(ko, 4, 1, Direction.EAST);
        new Wall(ko, 5, 1, Direction.EAST);
        new Wall(ko, 6, 1, Direction.EAST);
        new Wall(ko, 7, 1, Direction.EAST);
        new Wall(ko, 8, 1, Direction.EAST);
        new Wall(ko, 9, 1, Direction.EAST);

        new Wall(ko, 0, 2, Direction.EAST);
        new Wall(ko, 1, 3, Direction.NORTH);
        new Wall(ko, 1, 4, Direction.NORTH);
        new Wall(ko, 1, 5, Direction.NORTH);
        new Wall(ko, 1, 6, Direction.NORTH);
        new Wall(ko, 1, 6, Direction.EAST);
        new Wall(ko, 2, 6, Direction.EAST);
        new Wall(ko, 2, 3, Direction.SOUTH);
        new Wall(ko, 2, 4, Direction.SOUTH);
        new Wall(ko, 2, 5, Direction.SOUTH);
        new Wall(ko, 2, 6, Direction.SOUTH);
        new Wall(ko, 3, 2, Direction.EAST);

        //fix these
        new Wall(ko, 4, 3, Direction.NORTH);
        new Wall(ko, 4, 4, Direction.NORTH);
        new Wall(ko, 4, 5, Direction.NORTH);
        new Wall(ko, 4, 5, Direction.EAST);
        new Wall(ko, 4, 3, Direction.SOUTH);
        new Wall(ko, 4, 4, Direction.SOUTH);
        new Wall(ko, 4, 5, Direction.SOUTH);

        new Wall(ko, 5, 2, Direction.EAST);
        new Wall(ko, 6, 2, Direction.EAST);
        new Wall(ko, 7, 3, Direction.NORTH);
        new Wall(ko, 7, 4, Direction.NORTH);
        new Wall(ko, 7, 5, Direction.NORTH);
        new Wall(ko, 7, 6, Direction.NORTH);
        new Wall(ko, 7, 7, Direction.NORTH);
        new Wall(ko, 7, 7, Direction.EAST);
        new Wall(ko, 8, 7, Direction.EAST);
        new Wall(ko, 8, 3, Direction.SOUTH);
        new Wall(ko, 8, 4, Direction.SOUTH);
        new Wall(ko, 8, 5, Direction.SOUTH);
        new Wall(ko, 8, 6, Direction.SOUTH);
        new Wall(ko, 8, 7, Direction.SOUTH);
        new Wall(ko, 9, 2, Direction.EAST);
        new Wall(ko, 9, 2, Direction.SOUTH);

        //placing things
        new Thing(ko, 0, 1);
        new Thing(ko, 1, 0);
        new Thing(ko, 2, 0);
        new Thing(ko, 3, 0);
        new Thing(ko, 4, 0);
        new Thing(ko, 3, 1);
        new Thing(ko, 5, 1);
        new Thing(ko, 7, 1);
        new Thing(ko, 7, 0);
        new Thing(ko, 8, 1);
        new Thing(ko, 9, 1);
        new Thing(ko, 9, 0);

        new Thing(ko, 0, 4);
        new Thing(ko, 0, 5);
        new Thing(ko, 0, 7);
        new Thing(ko, 1, 3);
        new Thing(ko, 1, 4);
        new Thing(ko, 1, 5);
        new Thing(ko, 1, 6);
        new Thing(ko, 1, 7);
        new Thing(ko, 2, 2);
        new Thing(ko, 2, 4);
        new Thing(ko, 2, 6);
        new Thing(ko, 3, 4);
        new Thing(ko, 3, 6);
        new Thing(ko, 4, 2);
        new Thing(ko, 4, 3);
        new Thing(ko, 4, 4);
        new Thing(ko, 4, 6);
        new Thing(ko, 4, 7);
        new Thing(ko, 5, 5);
        new Thing(ko, 5, 7);
        new Thing(ko, 6, 4);
        new Thing(ko, 6, 6);
        new Thing(ko, 7, 2);
        new Thing(ko, 7, 3);
        new Thing(ko, 7, 7);
        new Thing(ko, 8, 3);
        new Thing(ko, 8, 4);
        new Thing(ko, 8, 6);
        new Thing(ko, 9, 3);
        new Thing(ko, 9, 4);
        new Thing(ko, 9, 6);

        //karel shovel snow and out on sidewalk 
        while (kar.frontIsClear()) {
            kar.move();
            if (kar.getAvenue() == 2 && kar.getStreet() == 1) {
                kar.turnLeft();
                kar.move();
                kar.pickThing();
                kar.move();
                kar.pickThing();
                kar.move();
                kar.pickThing();
                kar.move();
                kar.pickThing();

            }
        }
        if (!kar.frontIsClear()) {
            kar.turnLeft();
            kar.turnLeft();
            kar.move();
            kar.move();
            kar.move();
            kar.move();

            while (kar.countThingsInBackpack() > 0) {
                kar.putThing();
            }
            if (kar.getAvenue() == 2 && kar.getStreet() == 1) {
                kar.turnLeft();
                kar.move();
                kar.turnLeft();
                kar.move();
                kar.move();
                kar.pickThing();
                kar.move();
                kar.move();
                kar.pickThing();
            }
        }
        if (!kar.frontIsClear()) {
            kar.turnLeft();
            kar.turnLeft();
            kar.move();
            kar.move();
            kar.move();
            kar.move();

            while (kar.countThingsInBackpack() > 0) {
                kar.putThing();
            }
        }

        if (kar.getAvenue() == 2 && kar.getStreet() == 2) {
            kar.turnLeft();
            kar.move();
            kar.move();
            kar.turnLeft();
            kar.move();
            kar.pickThing();
            kar.move();
            kar.pickThing();
            kar.move();

            if (!kar.frontIsClear()) {
                kar.turnLeft();
                kar.turnLeft();
                kar.move();
                kar.move();
                kar.move();

                while (kar.countThingsInBackpack() > 0) {
                    kar.putThing();
                }
            }
            if (kar.getAvenue() == 2 && kar.getStreet() == 4) {
                kar.turnLeft();
                kar.move();
                kar.move();
                kar.move();
                kar.turnLeft();
                kar.move();
                kar.pickThing();
                kar.move();
                kar.move();
                kar.move();
                kar.move();
                kar.pickThing();

                if (!kar.frontIsClear()) {
                    kar.turnLeft();
                    kar.turnLeft();
                    kar.move();
                    kar.move();
                    kar.move();
                    kar.move();
                    kar.move();

                    while (kar.countThingsInBackpack() > 0) {
                        kar.putThing();
                    }
                }
                if (kar.getAvenue() == 2 && kar.getStreet() == 7) {
                    kar.turnLeft();
                    kar.move();
                    kar.turnLeft();
                    kar.move();
                    kar.pickThing();
                    kar.move();
                    kar.pickThing();
                    kar.move();
                    kar.move();
                    kar.pickThing();
                    kar.move();

                    if (!kar.frontIsClear()) {
                        kar.turnLeft();
                        kar.turnLeft();
                        kar.move();
                        kar.move();
                        kar.move();
                        kar.move();
                        kar.move();

                        while (kar.countThingsInBackpack() > 0) {
                            kar.putThing();
                            kar.turnLeft();
                            kar.move();
                            break;

                        }
//tina shovel all snow off sidewalk
                        while (ti.frontIsClear()) {
                            ti.move();
                            while (ti.canPickThing()) {
                                ti.pickThing();
                            }
                            if (ti.countThingsInBackpack() > 0) {
                                ti.putThing();

                            }


                        }
                    }
                }
            }
        }
    }
}
