
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Intersection;
import becker.robots.Robot;

/*
 * 21/09/2016
 * Write an algorithm that gets Karel back to 0,0 no matter
 where he is in city
 * @author micla1676
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city for robot
        City Algorithm = new City();

        //create Robot

        Robot Algorbot = new Robot(Algorithm, -5, -2, Direction.NORTH);

        //algorithm to get robot back to 0,0
        while (Algorbot.getStreet() != 0) {
            
            //if Algorbot is on an avenue <0
            if (Algorbot.getStreet() < 0) {
                Algorbot.turnLeft();
                Algorbot.turnLeft();
                Algorbot.move();
            } 
            //if Algorbot is on an avenue > 0
            else if (Algorbot.getStreet() > 0) {
                Algorbot.move();     
            } 
            //if Algorbot is on 0
            else { break;
            
            }
        }
              Algorbot.turnLeft();
            while(Algorbot.getAvenue() != 0){
            
            
            
                
                //if Algorbot is on a street > 0
                if(Algorbot.getAvenue() > 0){
                    Algorbot.move();
                }
                
                //if Algorbot is on a street < 0
                    else if (Algorbot.getAvenue() < 0) {
                       Algorbot.move();
                    } 
                    
                    else{ break;
                }
            }
           
        }





    }
