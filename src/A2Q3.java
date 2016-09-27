
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City af = new City();
        Robot Rem = new Robot(af,6,7,Direction.EAST);
        
        Rem.setLabel("R");
        // get Rem to face North
        while(Rem.getDirection() !=Direction.NORTH){
            Rem.turnLeft();
            
        }
        // get Rem to Street 0
        while(Rem.getStreet() != 0){
            Rem.move();
        }
        
        if(Rem.getAvenue() > 0){
            Rem.turnLeft();
        
        }    
        // get Rem to Avenue 0 
          while(Rem.getAvenue() != 0){
            Rem.move();
        }
        
    }
    
}
