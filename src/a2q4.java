
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
 * @author woodc9217
 */
public class a2q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a guard
        Robot candice = new Robot(mtl, 1, 0, Direction.NORTH);
        //build King Java's castle
        new Wall(mtl, 1, 1, Direction.SOUTH);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 1, 1, Direction.EAST);//
        new Wall(mtl, 2, 2, Direction.NORTH);
        new Wall(mtl, 2, 3, Direction.NORTH);
        new Wall(mtl, 2, 2, Direction.WEST);
        new Wall(mtl, 3, 2, Direction.WEST);
        new Wall(mtl, 3, 3, Direction.EAST);
        new Wall(mtl, 2, 3, Direction.EAST);
        new Wall(mtl, 3, 2, Direction.SOUTH);
        new Wall(mtl, 3, 3, Direction.SOUTH);
        new Wall(mtl, 1, 4, Direction.SOUTH);//
        new Wall(mtl, 1, 4, Direction.NORTH);
        new Wall(mtl, 1, 4, Direction.WEST);
        new Wall(mtl, 1, 4, Direction.EAST);
        new Wall(mtl, 4, 4, Direction.SOUTH);//
        new Wall(mtl, 4, 4, Direction.NORTH);
        new Wall(mtl, 4, 4, Direction.WEST);
        new Wall(mtl, 4, 4, Direction.EAST);
        new Wall(mtl, 4, 1, Direction.SOUTH);//
        new Wall(mtl, 4, 1, Direction.NORTH);
        new Wall(mtl, 4, 1, Direction.WEST);
        new Wall(mtl, 4, 1, Direction.EAST);
       //loop forever(get guard to move)
       while(1==1)
       {
           candice.turnLeft();
           candice.turnLeft();
           candice.turnLeft();
           if(candice.frontIsClear())
           {
               candice.move();
           }else{
               candice.turnLeft();
               if(candice.frontIsClear())
               {
                   candice.move();
               }
               if(!candice.frontIsClear())
                   {
                   candice.turnLeft();
                   candice.move();
                   }
           }
       }
       

    }
}
