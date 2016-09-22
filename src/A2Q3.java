
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE Jim = new RobotSE(kw,-5,-5,Direction.EAST);
        Jim.setLabel("Jim");
        Jim.setColor(Color.blue);
        while(Jim.getAvenue() !=0 || Jim.getStreet() !=0 ){
            if(Jim.getAvenue()>0){
                if(!Jim.isFacingWest()){
                    Jim.turnLeft();
                }
                else if(Jim.isFacingWest()){
                    Jim.move();
                }
        }
            else if(Jim.getAvenue()<0){
                if(!Jim.isFacingEast()){
                    Jim.turnLeft();
                }
                else if(Jim.isFacingEast()){
                    Jim.move();
                }
            }
            else if(Jim.getStreet()>0){
                if(!Jim.isFacingNorth()){
                    Jim.turnLeft();
                }
                else if(Jim.isFacingNorth()){
                    Jim.move();
                }
            }
            else if(Jim.getStreet()<0){
                if(!Jim.isFacingSouth()){
                    Jim.turnLeft();
                }
                else if(Jim.isFacingSouth()){
                    Jim.move();
                }
            }
        }
    }
}
