
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * 26/09/2016
 * A2Q4
 *Get the robot to go around a "castle"
 * @author micla1676
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city for the robot
        City Castle = new City ();
        
        //create robot
        Robot Guard = new Robot(Castle,2,1,Direction.NORTH);
        
        //create walls for the castle
        new Wall(Castle,1,1,Direction.EAST);
        new Wall(Castle,1,1,Direction.NORTH);
        new Wall(Castle,1,1,Direction.SOUTH);
        new Wall(Castle,1,1,Direction.WEST);
        new Wall(Castle,2,2,Direction.WEST);
        new Wall(Castle,3,2,Direction.WEST);
        new Wall(Castle,4,1,Direction.WEST);
        new Wall(Castle,4,4,Direction.WEST);
        new Wall(Castle,1,4,Direction.WEST);
        new Wall(Castle,2,2,Direction.NORTH);
        new Wall(Castle,3,3,Direction.SOUTH);
        new Wall(Castle,3,3,Direction.EAST);
        new Wall(Castle,3,2,Direction.WEST);
        new Wall(Castle,3,2,Direction.SOUTH);
        new Wall(Castle,2,3,Direction.NORTH);
        new Wall(Castle,2,3,Direction.EAST);
        new Wall(Castle,4,1,Direction.NORTH);
        new Wall(Castle,4,1,Direction.SOUTH);
        new Wall(Castle,4,1,Direction.EAST);
        new Wall(Castle,4,1,Direction.WEST);
        new Wall(Castle,1,4,Direction.NORTH);
        new Wall(Castle,1,4,Direction.SOUTH);
        new Wall(Castle,1,4,Direction.EAST);
        new Wall(Castle,1,4,Direction.WEST);
        new Wall(Castle,4,4,Direction.NORTH);
        new Wall(Castle,4,4,Direction.SOUTH);
        new Wall(Castle,4,4,Direction.EAST);
        new Wall(Castle,4,4,Direction.WEST);
        
        //create pattern for the robot to travel along the castle
        
        while(true){
            Guard.turnLeft();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.move();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.move();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.move();
            Guard.turnLeft();
            Guard.move();
            
            
            
            
            
        }
            
        
        
        
        
        
    }
}
