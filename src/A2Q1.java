
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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // create city
           City af = new City();
           // create robot
           Robot Rem = new Robot(af,1,1,Direction.EAST);
           Rem.move();
           
           
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

           
           // Move 7 times
           while(true){
            //
            if (Rem.countThingsInBackpack() < 7){
                Rem.pickThing();
                Rem.move();
           }else {
                   break;
           
           
        }
            
           }
           Rem.move();
           Rem.move();
           Rem.move();
               
               
   
    }      
    }
    

