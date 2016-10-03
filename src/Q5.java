
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City q5 = new City();

        // Create road
        new Wall(q5, 0, 0, Direction.WEST);
        new Wall(q5, 1, 0, Direction.WEST);
        new Wall(q5, 2, 0, Direction.WEST);
        new Wall(q5, 3, 0, Direction.WEST);
        new Wall(q5, 4, 0, Direction.WEST);
        new Wall(q5, 5, 0, Direction.WEST);
        new Wall(q5, 6, 0, Direction.WEST);
        new Wall(q5, 7, 0, Direction.WEST);
        new Wall(q5, 8, 0, Direction.WEST);
        new Wall(q5, 9, 0, Direction.WEST);
        new Wall(q5, 0, 1, Direction.EAST);
        new Wall(q5, 1, 1, Direction.EAST);
        new Wall(q5, 2, 1, Direction.EAST);
        new Wall(q5, 3, 1, Direction.EAST);
        new Wall(q5, 4, 1, Direction.EAST);
        new Wall(q5, 5, 1, Direction.EAST);
        new Wall(q5, 6, 1, Direction.EAST);
        new Wall(q5, 7, 1, Direction.EAST);
        new Wall(q5, 8, 1, Direction.EAST);
        new Wall(q5, 9, 1, Direction.EAST);

        // Create sidewalk
        new Wall(q5, 0, 2, Direction.EAST);
        new Wall(q5, 3, 2, Direction.EAST);
        new Wall(q5, 5, 2, Direction.EAST);
        new Wall(q5, 6, 2, Direction.EAST);
        new Wall(q5, 9, 2, Direction.EAST);
        new Wall(q5, 9, 2, Direction.SOUTH);

        // Create driveway 1
        new Wall(q5, 1, 3, Direction.NORTH);
        new Wall(q5, 1, 4, Direction.NORTH);
        new Wall(q5, 1, 5, Direction.NORTH);
        new Wall(q5, 1, 6, Direction.NORTH);
        new Wall(q5, 1, 6, Direction.EAST);
        new Wall(q5, 2, 6, Direction.EAST);
        new Wall(q5, 2, 3, Direction.SOUTH);
        new Wall(q5, 2, 4, Direction.SOUTH);
        new Wall(q5, 2, 5, Direction.SOUTH);
        new Wall(q5, 2, 6, Direction.SOUTH);

        // Create driveway 2
        new Wall(q5, 4, 3, Direction.NORTH);
        new Wall(q5, 4, 4, Direction.NORTH);
        new Wall(q5, 4, 5, Direction.NORTH);
        new Wall(q5, 4, 5, Direction.EAST);
        new Wall(q5, 4, 5, Direction.SOUTH);
        new Wall(q5, 4, 4, Direction.SOUTH);
        new Wall(q5, 4, 3, Direction.SOUTH);

        // Create driveway 3
        new Wall(q5, 7, 3, Direction.NORTH);
        new Wall(q5, 7, 4, Direction.NORTH);
        new Wall(q5, 7, 5, Direction.NORTH);
        new Wall(q5, 7, 6, Direction.NORTH);
        new Wall(q5, 7, 7, Direction.NORTH);
        new Wall(q5, 7, 7, Direction.EAST);
        new Wall(q5, 8, 7, Direction.EAST);
        new Wall(q5, 8, 7, Direction.SOUTH);
        new Wall(q5, 8, 6, Direction.SOUTH);
        new Wall(q5, 8, 5, Direction.SOUTH);
        new Wall(q5, 8, 4, Direction.SOUTH);
        new Wall(q5, 8, 3, Direction.SOUTH);

        // Create snow (things)
        new Thing(q5, 7, 7);
        new Thing(q5, 8, 6);
        new Thing(q5, 8, 4);
        new Thing(q5, 8, 3);
        new Thing(q5, 7, 3);
        new Thing(q5, 7, 2);
        new Thing(q5, 4, 2);
        new Thing(q5, 4, 3);
        new Thing(q5, 4, 4);
        new Thing(q5, 1, 2);
        new Thing(q5, 2, 2);
        new Thing(q5, 1, 3);
        new Thing(q5, 1, 4);
        new Thing(q5, 2, 4);
        new Thing(q5, 1, 5);
        new Thing(q5, 2, 6);

        // Create karel
        RobotSE karel = new RobotSE(q5, 0, 2, Direction.SOUTH);
        karel.setColor(Color.black);

        // Create tina
        RobotSE tina = new RobotSE(q5, 0, 2, Direction.SOUTH);
        tina.setColor(Color.black);

        while(karel.frontIsClear()){
            // Determine if driveway
            karel.turnLeft();
            // Driveway not found
            if (!karel.frontIsClear()) {
                karel.turnRight();
                karel.move();
            }
            else{
                // Driveway found
                while(karel.frontIsClear()){
                    karel.move();
                    if (karel.canPickThing()) {
                      karel.pickThing();
                    }else if(!karel.canPickThing() && karel.frontIsClear() ){
                        karel.move();
                    }else{
                        karel.turnAround();
                        do{
                        karel.move();
                        }while(karel.getAvenue() !=2);
                        karel.putAllThings();
                        karel.turnLeft();
                        karel.move();
                        break;
                    }  
                }
                }
            }
        }
        
        //overall loop
            //determine if driveway
                //turn left
                // if (wall) {
                // turn right
                // move
            // }else{
            // found driveway
                //loop while (frontIsClear){
                // move
                // if can pick thing {
                    // pick thing
                //} turn around
        // while front is clear
            // move
        // }
        // turn left
        // move
        
        
        
        
        // karel looks for a driveway (loop while front is clear)
        //while (karel.getAvenue() == 2 && karel.frontIsClear()) {
            //karel.move();
            //karel.turnLeft();
            // driveway found, turn into driveway
        
                    //while (karel.getAvenue() == 2 && karel.frontIsClear()) {
                //karel.move();
                // snow found, shovel snow
               // if (karel.canPickThing()) {
                    //karel.pickThing();
                    // no snow but not end of driveway; move forward
              // } else if (!karel.canPickThing() && karel.frontIsClear()) {
                    //karel.move();
                    // end of driveway; turn around and go back to sidewalk
                //} else if (!karel.frontIsClear()) {
                    //karel.turnAround();
                //}if (karel.getAvenue() == 2 && !karel.frontIsClear()) {
                //`karel.turnLeft();
               
            //} 
                    // do {
                    //    karel.move();
                   // } while (karel.getAvenue() != 2);
                    //karel.putAllThings();
                   // karel.turnLeft();
                    
                }
                // driveway not found, move along
            
        
    
