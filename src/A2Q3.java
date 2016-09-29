
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
        RobotSE jim = new RobotSE(kw,-5,-5,Direction.EAST);
        jim.setLabel("Jim");
        jim.setColor(Color.blue);
        while(jim.getAvenue() !=0 || jim.getStreet() !=0 ){
            if(jim.getAvenue()>0){
                if(!jim.isFacingWest()){
                    jim.turnLeft();
                }
                else if(jim.isFacingWest()){
                    jim.move();
                }
        }
            else if(jim.getAvenue()<0){
                if(!jim.isFacingEast()){
                    jim.turnLeft();
                }
                else if(jim.isFacingEast()){
                    jim.move();
                }
            }
            else if(jim.getStreet()>0){
                if(!jim.isFacingNorth()){
                    jim.turnLeft();
                }
                else if(jim.isFacingNorth()){
                    jim.move();
                }
            }
            else if(jim.getStreet()<0){
                if(!jim.isFacingSouth()){
                    jim.turnLeft();
                }
                else if(jim.isFacingSouth()){
                    jim.move();
                }
            }
        }
    }
}
