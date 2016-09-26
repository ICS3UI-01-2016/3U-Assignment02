
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

        Robot Algorbot = new Robot(Algorithm, 7, 2, Direction.WEST);



//if Algorbot is facing the oppisite direction of the origin turn him around.
        if (Algorbot.getDirection() == Direction.NORTH) {
            if (Algorbot.getStreet() < 0) {
                Algorbot.turnLeft();
                Algorbot.turnLeft();
            }
//if Algorbot is facing the oppisite direction of the origin turn him around.                
        } else if (Algorbot.getDirection() == Direction.SOUTH) {
            if (Algorbot.getStreet() > 0) {
                Algorbot.turnLeft();
                Algorbot.turnLeft();
            }
        }

//if Algorbot is facing the oppisite direction of the origin turn him around.
        if (Algorbot.getDirection() == Direction.EAST) {
            if (Algorbot.getStreet() < 0) {
                Algorbot.turnLeft();

            } else if (Algorbot.getStreet() > 0) {
                Algorbot.turnLeft();
                Algorbot.turnLeft();
                Algorbot.turnLeft();
            }

//if Algorbot is facing the oppisite direction of the origin turn him around.
        } else if (Algorbot.getDirection() == Direction.WEST) {
            if (Algorbot.getStreet() < 0) {
                Algorbot.turnLeft();
            } else if (Algorbot.getStreet() > 0) {
                Algorbot.turnLeft();
                Algorbot.turnLeft();
                Algorbot.turnLeft();
            }





            //algorithm to get robot back to 0,0

            //keep moving until robot hits the street with 0
            while (Algorbot.getStreet() != 0) {
                Algorbot.move();
            }

            //if Algorbot is facing the oppisite direction of the origin 
            //turn him around.

            if (Algorbot.getDirection() == Direction.NORTH) {
                if (Algorbot.getAvenue() > 0) {
                    Algorbot.turnLeft();
                } else if (Algorbot.getAvenue() < 0) {
                    Algorbot.turnLeft();
                    Algorbot.turnLeft();
                    Algorbot.turnLeft();
                }
                //if Algorbot is facing the oppisite direction of the origin turn 
                //him around.                
            }
            if (Algorbot.getDirection() == Direction.SOUTH) {
                if (Algorbot.getAvenue() < 0) {
                    Algorbot.turnLeft();
                } else if (Algorbot.getAvenue() > 0) {
                    Algorbot.turnLeft();
                    Algorbot.turnLeft();
                    Algorbot.turnLeft();


                }
            }

            while (Algorbot.getAvenue() != 0) {
                Algorbot.move();
            }
        }
    }
}
