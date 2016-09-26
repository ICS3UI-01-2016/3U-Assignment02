
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candice
 */
public class a2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,1,1,Direction.EAST);
            //change color of robot
            candice.setColor(Color.black);
            //create Things
            new Thing(mtl,1,2);
            new Thing(mtl,1,3);
            new Thing(mtl,1,4);
            new Thing(mtl,1,5);
            new Thing(mtl,1,6);
            new Thing(mtl,1,7);
            new Thing(mtl,1,8);
            new Thing(mtl,1,9);
            new Thing(mtl,1,10);
            new Thing(mtl,1,11);
            //move
            candice.move();
            //condition
            while(candice.canPickThing())//keep going until no more things
            {
                if(candice.countThingsInBackpack()<7)//pick up only 7 things
                {
                    candice.pickThing();
                }
                candice.move();
                
            }
    }
}