
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
 * @author wangk9757
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create new city
        City kw = new City();
        //create new robot
        Robot kevin= new Robot(kw,0,0,Direction.EAST);
        //create walls
        new Wall (kw,1,1,Direction.WEST);
        new Wall (kw,1,1,Direction.NORTH);
        new Wall (kw,1,1,Direction.EAST);
        new Wall (kw,1,1,Direction.SOUTH);
        
       new Wall (kw,4,1,Direction.WEST);
       new Wall (kw,4,1,Direction.NORTH);
       new Wall (kw,4,1,Direction.EAST);
       new Wall (kw,4,1,Direction.SOUTH);
       
       new Wall (kw,1,4,Direction.WEST);
       new Wall (kw,1,4,Direction.SOUTH);
       new Wall (kw,1,4,Direction.EAST);
       new Wall (kw,1,4,Direction.NORTH);
       
       new Wall (kw,2,2,Direction.NORTH);
       new Wall (kw,2,2,Direction.WEST);
       new Wall (kw,3,2,Direction.WEST);
       new Wall (kw,3,2,Direction.SOUTH);
        new Wall (kw,3,3,Direction.EAST);
        new Wall (kw,3,3,Direction.SOUTH);
        new Wall (kw,2,3,Direction.NORTH);
        new Wall (kw,2,3,Direction.EAST);
        
        new Wall (kw,4,4,Direction.EAST);
        new Wall (kw,4,4,Direction.SOUTH);
        new Wall (kw,4,4,Direction.WEST);
        new Wall (kw,4,4,Direction.NORTH);
        //get kevin to patrol
       
        
        int moves = 0;
      
        while (true){
             kevin.move();
             kevin.move();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.move();
             kevin.turnLeft();
           
             
             kevin.move();
             kevin.turnLeft();
             kevin.move();
           
            
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.move();
             kevin.move();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.move();
             kevin.move();
             
             kevin.turnLeft();
           kevin.turnLeft();
           kevin.turnLeft();
             
             kevin.move();
             kevin.turnLeft();
             kevin.move();
           
            
             kevin.turnLeft();
             
             kevin.move();
             kevin.turnLeft();
             kevin.turnLeft();
             kevin.turnLeft();
              kevin.move();
             kevin.move();
              kevin.turnLeft();
              kevin.turnLeft();
              kevin.turnLeft();
              
        }
           
             
    }
}
