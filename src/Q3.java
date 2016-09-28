
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        City q3 = new City();
        RobotSE rick = new RobotSE(q3,5,4,Direction.SOUTH);
        
        // Right of intersection
        if(rick.getStreet()>0){
            // Turn WEST
            if(rick.getDirection()==Direction.NORTH || rick.getDirection()==Direction.EAST || rick.getDirection()==Direction.SOUTH){
                do {
                    rick.turnLeft();
                }while(rick.getDirection()!=Direction.WEST);
            }
            // Move to Street 0
            while(rick.getStreet()>0){
                rick.move();
                if(rick.getStreet()==0)
                    break;
            }
        }
        // Left of intersection
        if(rick.getStreet()<0){
            // Turn EAST
            if(rick.getDirection()==Direction.NORTH || rick.getDirection()==Direction.WEST || rick.getDirection()==Direction.SOUTH){
                do {
                    rick.turnRight();
                }while(rick.getDirection()!=Direction.EAST);
            }
            // Move to Street 0
        }
        // Below intersection
        if(rick.getAvenue()>0){
            // Turn NORTH
            // Move to Avenue 0
        }
        // Above intersection
        if(rick.getAvenue()<0){
            // Turn SOUTH
            // Move to Avenue 0
        }
    }      
}

