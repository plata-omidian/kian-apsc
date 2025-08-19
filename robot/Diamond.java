package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);
        World.setDelay(1);

        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
        Robot rob = new Robot(19,10,South,100);
        Robot bob = new Robot(18,9,South,100);
        Robot b = new Robot(17,8,South,100);
        Robot a = new Robot(16,7,South,100);
        Robot c = new Robot(15,6,South,100);
        Robot d = new Robot(14,7,South,100);
        Robot e = new Robot(13,8,South,100);
        Robot f = new Robot(12,9,South,100);
        Robot g = new Robot(11,10,South,100);
        Robot h = new Robot(12,11,South,100);
        Robot i = new Robot(13,12,South,100);
        Robot j = new Robot(14,13,South,100);
        Robot k = new Robot(15,14,South,100);
        Robot l = new Robot(16,13,South,100);
        Robot m = new Robot(17,12,South,100);
        Robot n = new Robot(18,11,South,100);

        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
        // move one step in the direction it is facing


        // starting the letter R

        
 





        // done with the line, now on the curve
        // rob.turnLeft();

    }
}
