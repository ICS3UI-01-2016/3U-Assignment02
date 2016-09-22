
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Robot;
import becker.robots.Wall;
      
        

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City af = new City();
        // create a robot
        Robot Karel = new Robot(af,1,1,Direction.EAST);
        
        new Thing(af,1,9);
        // create hurdles
        new Wall(af,1,1,Direction.SOUTH);
        new Wall(af,1,2,Direction.SOUTH);
        new Wall(af,1,3,Direction.SOUTH);
        new Wall(af,1,4,Direction.SOUTH);
        new Wall(af,1,5,Direction.SOUTH);
        new Wall(af,1,6,Direction.SOUTH);
        new Wall(af,1,7,Direction.SOUTH);
        new Wall(af,1,8,Direction.SOUTH);
        new Wall(af,1,9,Direction.SOUTH);
        new Wall(af,1,2,Direction.EAST);
        new Wall(af,1,3,Direction.EAST);
        new Wall(af,1,8,Direction.EAST);
        
        // make karel jump hurdles
        
        
        while(Karel.frontIsClear()){
             Karel.move();
             
        }
        
        if(!Karel.frontIsClear()){
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.turnLeft();
        
            {
            
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
           
        }
        while(Karel.frontIsClear()){
            Karel.move();
        }
        if(!Karel.frontIsClear()){
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.turnLeft();
            
            {    
            
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
    }
        while(Karel.frontIsClear()){
            Karel.move();
    }
        if(!Karel.frontIsClear()){
            Karel.turnLeft();
            Karel.move();
            Karel.turnLeft();
            Karel.turnLeft();
            Karel.turnLeft();
}
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        
}
        if(Karel.canPickThing()){
            Karel.pickThing();
        }
        while(Karel.countThingsInBackpack() == 0){
            Karel.move();
            
          
         
        
        if(Karel.canPickThing()){
            Karel.pickThing();
        }
        else; {
        
           
 
     
        
}
}
}
    }
}


