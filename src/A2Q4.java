
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the City.... or realm ;)
        City kingslanding = new City();
     
        //Create the castle a.k.a. Red Keep
       new Wall(kingslanding,1,1,Direction.WEST);
       new Wall(kingslanding,1,1,Direction.NORTH);
       new Wall(kingslanding,1,1,Direction.SOUTH);
       new Wall(kingslanding,1,1,Direction.EAST);
       
       new Wall(kingslanding,4,1,Direction.WEST);
       new Wall(kingslanding,4,1,Direction.NORTH);
       new Wall(kingslanding,4,1,Direction.EAST);
       new Wall(kingslanding,4,1,Direction.SOUTH);
       
       new Wall(kingslanding,4,4,Direction.EAST);
       new Wall(kingslanding,4,4,Direction.WEST);
       new Wall(kingslanding,4,4,Direction.NORTH);
       new Wall(kingslanding,4,4,Direction.SOUTH);
       
       new Wall(kingslanding,1,4,Direction.EAST);
       new Wall(kingslanding,1,4,Direction.WEST);
       new Wall(kingslanding,1,4,Direction.NORTH);
       new Wall(kingslanding,1,4,Direction.SOUTH);
       
       new Wall(kingslanding,2,2,Direction.WEST);
       new Wall(kingslanding,2,2,Direction.NORTH);
       new Wall(kingslanding,3,2,Direction.WEST);
       new Wall(kingslanding,3,2,Direction.SOUTH);
       new Wall(kingslanding,2,3,Direction.NORTH);
       new Wall(kingslanding,2,3,Direction.EAST);
       new Wall(kingslanding,3,3,Direction.EAST);
       new Wall(kingslanding,3,3,Direction.SOUTH);
       
       //Make way for the Queen's Gaurd!!!
       Robot jaime = new Robot (kingslanding,0,0,Direction.EAST);
       
       //En Garde!!
       jaime.turnLeft();
       
       int moves = 0;
       
       while(true){
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.move();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.turnLeft();
           jaime.move();
           jaime.move();
           
           
       }
       
       
               
      
    }
}