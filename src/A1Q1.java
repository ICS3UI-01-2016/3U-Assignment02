
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // create city
           City af = new City();
           // create robot
           Robot Rem = new Robot(af,1,1,Direction.EAST);
           
           new Thing(af,1,2);
           new Thing(af,1,3);
           new Thing(af,1,4);
           new Thing(af,1,5);
           new Thing(af,1,6);
           new Thing(af,1,7);
           new Thing(af,1,8);
           new Thing(af,1,9);
           new Thing(af,1,10);
           new Thing(af,1,11);
           
           // create variable to move and pick Thing
           int moves = 0;
           
           // Move 7 times
           while(moves < 7){
            Rem.move();
            Rem.pickThing();
            // add 1 to the movement counter
            moves = moves + 1;
        }
            // make rem move at the end of the row
            Rem.move();
            Rem.move();
            Rem.move();
            Rem.move();
           }
               
               
   
           
    }
    

