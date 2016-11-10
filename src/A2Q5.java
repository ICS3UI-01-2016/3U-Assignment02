
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Neighbourhood
        City doon = new City();
        new Wall(doon, 0, 0, Direction.EAST);
        new Wall(doon, 1, 0, Direction.EAST);
        new Wall(doon, 2, 0, Direction.EAST);
        new Wall(doon, 3, 0, Direction.EAST);
        new Wall(doon, 4, 0, Direction.EAST);
        new Wall(doon, 5, 0, Direction.EAST);
        new Wall(doon, 6, 0, Direction.EAST);
        new Wall(doon, 7, 0, Direction.EAST);
        new Wall(doon, 8, 0, Direction.EAST);
        new Wall(doon, 9, 0, Direction.EAST);
        new Wall(doon, 10, 0, Direction.EAST);
        new Wall(doon, 0, 1, Direction.EAST);
        new Wall(doon, 1, 2, Direction.NORTH);
        new Wall(doon, 1, 3, Direction.NORTH);
        new Wall(doon, 1, 4, Direction.NORTH);
        new Wall(doon, 1, 5, Direction.NORTH);
        new Wall(doon, 1, 5, Direction.EAST);
        new Wall(doon, 2, 5, Direction.EAST);
        new Wall(doon, 2, 5, Direction.SOUTH);
        new Wall(doon, 2, 4, Direction.SOUTH);
        new Wall(doon, 2, 3, Direction.SOUTH);
        new Wall(doon, 2, 2, Direction.SOUTH);
        new Wall(doon, 3, 1, Direction.EAST);
        new Wall(doon, 4, 2, Direction.NORTH);
        new Wall(doon, 4, 3, Direction.NORTH);
        new Wall(doon, 4, 4, Direction.NORTH);
        new Wall(doon, 4, 4, Direction.EAST);
        new Wall(doon, 4, 4, Direction.SOUTH);
        new Wall(doon, 4, 3, Direction.SOUTH);
        new Wall(doon, 4, 2, Direction.SOUTH);
        new Wall(doon, 5, 1, Direction.EAST);
        new Wall(doon, 6, 1, Direction.EAST);
        new Wall(doon, 7, 2, Direction.NORTH);
        new Wall(doon, 7, 3, Direction.NORTH);
        new Wall(doon, 7, 4, Direction.NORTH);
        new Wall(doon, 7, 5, Direction.NORTH);
        new Wall(doon, 7, 5, Direction.EAST);
        new Wall(doon, 8, 5, Direction.EAST);
        new Wall(doon, 8, 5, Direction.SOUTH);
        new Wall(doon, 8, 4, Direction.SOUTH);
        new Wall(doon, 8, 3, Direction.SOUTH);
        new Wall(doon, 8, 2, Direction.SOUTH);
        new Wall(doon, 9, 1, Direction.EAST);
        new Wall(doon, 10, 1, Direction.SOUTH);
        new Wall(doon, 10, 1, Direction.EAST);
        //Place snow (Things)
        new Thing(doon, 1, 2);
        new Thing(doon, 1, 3);
        new Thing(doon, 2, 2);
        new Thing(doon, 1, 4);
        new Thing(doon, 2, 4);
        new Thing(doon, 4, 4);
        new Thing(doon, 4, 3);
        new Thing(doon, 4, 2);
        new Thing(doon, 7, 2);
        new Thing(doon, 7, 3);
        new Thing(doon, 7, 5);
        new Thing(doon, 8, 2);
        new Thing(doon, 8, 3);
        new Thing(doon, 8, 4);
        new Thing(doon, 8, 5);
        //Create shovel bots
        RobotSE karel = new RobotSE(doon, 0, 1, Direction.SOUTH);
        
        RobotSE maria = new RobotSE(doon, 0, 1, Direction.SOUTH);
        
        //SHOVEL!! 
        //while karel's front is clear
        while (karel.frontIsClear()){
            //check for driveway
            karel.turnLeft();
            if(!karel.frontIsClear()){
                karel.turnRight();
                karel.move();
            }else{
                while(karel.frontIsClear())
                    karel.move();
                //shovel things
                if(karel.canPickThing()){
                    karel.pickThing();
                }
            
                //leave driveway
                karel.turnAround();
                while(karel.frontIsClear())
                    karel.move();}
            karel.turnLeft();
            karel.move();
        }
    //make maria collect things off sidewalk
    while(maria.frontIsClear()){
        maria.move();
        if(maria.canPickThing()){
            maria.pickThing();
        }
    }
    karel.putAllThings();
    maria.putThing();
            }
        }

            
            
            
            
            
    



    

