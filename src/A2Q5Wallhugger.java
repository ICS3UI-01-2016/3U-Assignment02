
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*27/09/2016
 *A2Q5
 *Clean a sidewalk
 * @author micla1676
 */
public class A2Q5Wallhugger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Street = new City();

        //create shovelbots
        Robot karel = new Robot(Street, 1, 3, Direction.SOUTH);
        Robot tina = new Robot(Street, 1, 3, Direction.SOUTH);


        //lable karel
        karel.setLabel("K");
        //set color of karel
        karel.setColor(Color.BLUE);
        // set transparency of karel 
        karel.setTransparency(0.5);

        //lable tina
        tina.setLabel("T");
        //set color of Tina
        tina.setColor(Color.RED);
        // set transparency of Tina
        tina.setTransparency(0.5);


        //create road of street
        new Wall(Street, 1, 1, Direction.WEST);
        new Wall(Street, 2, 1, Direction.WEST);
        new Wall(Street, 3, 1, Direction.WEST);
        new Wall(Street, 4, 1, Direction.WEST);
        new Wall(Street, 5, 1, Direction.WEST);
        new Wall(Street, 6, 1, Direction.WEST);
        new Wall(Street, 7, 1, Direction.WEST);
        new Wall(Street, 8, 1, Direction.WEST);
        new Wall(Street, 9, 1, Direction.WEST);
        new Wall(Street, 10, 1, Direction.WEST);

        new Wall(Street, 1, 2, Direction.EAST);
        new Wall(Street, 2, 2, Direction.EAST);
        new Wall(Street, 3, 2, Direction.EAST);
        new Wall(Street, 4, 2, Direction.EAST);
        new Wall(Street, 5, 2, Direction.EAST);
        new Wall(Street, 6, 2, Direction.EAST);
        new Wall(Street, 7, 2, Direction.EAST);
        new Wall(Street, 8, 2, Direction.EAST);
        new Wall(Street, 9, 2, Direction.EAST);
        new Wall(Street, 10, 2, Direction.EAST);
        new Wall(Street, 1, 3, Direction.EAST);
        new Wall(Street, 4, 3, Direction.EAST);
        new Wall(Street, 6, 3, Direction.EAST);
        new Wall(Street, 7, 3, Direction.EAST);
        new Wall(Street, 10, 3, Direction.EAST);
        new Wall(Street, 10, 3, Direction.SOUTH);

        new Wall(Street, 2, 4, Direction.NORTH);
        new Wall(Street, 2, 5, Direction.NORTH);
        new Wall(Street, 2, 6, Direction.NORTH);
        new Wall(Street, 2, 7, Direction.NORTH);
        new Wall(Street, 2, 7, Direction.EAST);
        new Wall(Street, 3, 7, Direction.EAST);
        new Wall(Street, 3, 6, Direction.SOUTH);
        new Wall(Street, 3, 5, Direction.SOUTH);
        new Wall(Street, 3, 4, Direction.SOUTH);
        new Wall(Street, 3, 7, Direction.SOUTH);

        new Wall(Street, 8, 4, Direction.NORTH);
        new Wall(Street, 8, 5, Direction.NORTH);
        new Wall(Street, 8, 6, Direction.NORTH);
        new Wall(Street, 8, 7, Direction.NORTH);
        new Wall(Street, 8, 8, Direction.NORTH);
        new Wall(Street, 8, 8, Direction.EAST);
        new Wall(Street, 9, 8, Direction.EAST);
        new Wall(Street, 9, 6, Direction.SOUTH);
        new Wall(Street, 9, 5, Direction.SOUTH);
        new Wall(Street, 9, 4, Direction.SOUTH);
        new Wall(Street, 9, 7, Direction.SOUTH);
        new Wall(Street, 9, 8, Direction.SOUTH);

        new Wall(Street, 5, 4, Direction.NORTH);
        new Wall(Street, 5, 4, Direction.SOUTH);
        new Wall(Street, 5, 5, Direction.NORTH);
        new Wall(Street, 5, 5, Direction.SOUTH);
        new Wall(Street, 5, 6, Direction.NORTH);
        new Wall(Street, 5, 6, Direction.SOUTH);
        new Wall(Street, 5, 6, Direction.EAST);

        new Wall(Street, 1, 3, Direction.NORTH);


        //create things
        new Thing(Street, 2, 3);
        new Thing(Street, 2, 4);
        new Thing(Street, 2, 5);
        new Thing(Street, 2, 6);
        new Thing(Street, 3, 3);
        new Thing(Street, 3, 5);
        new Thing(Street, 3, 7);
        new Thing(Street, 5, 3);
        new Thing(Street, 5, 4);
        new Thing(Street, 5, 5);
        new Thing(Street, 8, 3);
        new Thing(Street, 8, 4);
        new Thing(Street, 8, 8);
        new Thing(Street, 9, 4);
        new Thing(Street, 9, 5);
        new Thing(Street, 9, 7);

        //get Karel out of square
        karel.move();

        //create algorithm to shovel things while backpack has less then 16 things
        while (karel.countThingsInBackpack() < 16) {
            karel.turnLeft();
            //move if front is clear, turn left twice if not
            if (karel.frontIsClear()) {
                karel.move();
            } else {
                karel.turnLeft();
                karel.turnLeft();
            }
            //if karel can pick thing, pick thing
           if (karel.canPickThing()) {
               karel.pickThing();
           }
        
        
        }
        //get karel to drop things in backpack
        while (karel.countThingsInBackpack() > 0) {
            karel.putThing();
        }
        karel.turnLeft();
        karel.turnLeft();
        while (karel.frontIsClear()){
            karel.move();
        }
        //get tina out of square
        tina.move();
        //get tina to pick things
        while(tina.frontIsClear()){
            if (tina.canPickThing()){
                tina.pickThing();
            }else{
                tina.move();
            }
            
        }
        //get tina to empty backpack
        while(tina.countThingsInBackpack() > 0){
            tina.putThing();
        }
        
        
    }
}

