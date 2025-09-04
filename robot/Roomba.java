package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba = new Robot(9,8,North,100);

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(1);
		int totalBeepers = 100;


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		roomba.turnLeft();
		roomba.move();
		for(int i=1;i<7;i++){
			roomba.pickBeeper();
		}
		roomba.turnLeft();
		roomba.move();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		for(int i=1;i<8;i++){
			roomba.pickBeeper();
		}
		roomba.move();
		for(int i=1;i<7;i++){
			roomba.pickBeeper();
		}
		roomba.move();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		for(int i=1;i<4;i++){
			roomba.pickBeeper();
		}
		roomba.move();
		for(int i=1;i<14;i++){
			roomba.pickBeeper();
		}
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		roomba.move();
		for(int i=1;i<8;i++){
			roomba.pickBeeper();
		}
		roomba.move();
		for(int i=1;i<=3;i++){
			roomba
			.turnLeft();
		}
		roomba.move();
		for(int i=1;i<=5;i++){
			roomba.pickBeeper();
		}
		for(int i=1;i<=3;i++){
			roomba
			.turnLeft();
		}
		roomba.move();
		roomba.move();
		for(int i=1;i<=6;i++){
			roomba.pickBeeper();
		}
		for(int i=1;i<=3;i++){
			roomba.move();
		}
		for(int i=1;i<=6;i++){
			roomba.pickBeeper();
		}
		 // Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;
	}
}
