
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create City
        City LosSantos = new City();
        new Thing(LosSantos, 1, 2);
        new Thing(LosSantos, 1, 3);
        new Thing(LosSantos, 1, 4);
        new Thing(LosSantos, 1, 5);
        new Thing(LosSantos, 1, 6);
        new Thing(LosSantos, 1, 7);
        new Thing(LosSantos, 1, 8);
        new Thing(LosSantos, 1, 9);
        new Thing(LosSantos, 1, 10);
        new Thing(LosSantos, 1, 11);
        //Create Robot
        Robot gurveer = new Robot(LosSantos, 1, 1, Direction.EAST);
        while (gurveer.frontIsClear()) {
            gurveer.move();
            if (gurveer.getAvenue() == 12) {
                break;
            }
            if (gurveer.canPickThing()) {
                if (gurveer.countThingsInBackpack() < 7) {
                    gurveer.pickThing();
                }
                {
                }




            }



        }

    }
}
