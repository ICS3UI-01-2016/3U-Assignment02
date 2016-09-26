
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
        City af = new City();
        Robot Rem = new Robot(af,1,1,Direction.EAST);
        
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
        new Wall(af,1,7,Direction.EAST);
        new Wall(af,1,1,Direction.EAST);
        new Wall(af,1,2,Direction.EAST);
        new Wall(af,1,4,Direction.EAST);
        new Thing(af,1,9);
       
        
        while(true){
            // make Rem jump hurdles
            if(!Rem.frontIsClear()){
                Rem.turnLeft();
                
                
            }else{
                Rem.move();
            
        // make Rem turn right!
        if(Rem.frontIsClear()){
            Rem.turnLeft();
            Rem.turnLeft();
            Rem.turnLeft();
        }
        // make Rem stop near Thing
        if(Rem.getAvenue()==9){
             
                
                 if(Rem.getStreet()==1)
                 Rem.pickThing();
                
             break;
        }
        
    }
    }
}
}

