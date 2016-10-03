
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
 * @author ayyaf3300
 */
public class ProgrammingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a city
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 1, 1, Direction.EAST);

        //creat things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        // create algorithem to tell robot to collect things until a specific street and avenue
        while (dino.frontIsClear()) {
            
            dino.move();

            if (dino.canPickThing() && dino.countThingsInBackpack() < 7)
            {
                dino.pickThing();
            }  
              if (dino.getAvenue() == 12){
               break;   
              }
              }
                    
              
                       
              
       }

    }

