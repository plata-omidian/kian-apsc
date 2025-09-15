package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/finalTestWorld2024.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 25, 101);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba = new Robot(26,101,East,0);

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
		int totalBeepers = 99;
		int totalSpaces=0; 
		int largestPile=0;
		int pileSize=0;
		int largestPileLocationX = 0;
		int largestPileLocationY = 0;
		int totalPiles=0;


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		// keyword while (condition)
		while (roomba.frontIsClear()) {
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				totalBeepers++;
				pileSize++;
				if (pileSize>largestPile) {
					largestPile=pileSize;
					largestPileLocationX=roomba.street();
					largestPileLocationY=roomba.avenue();
				}
			}
			roomba.move();
			totalSpaces++;
			pileSize=0;
			if (pileSize>0){
				totalPiles++;
			}
			if (!roomba.frontIsClear()) {
				if (roomba.facingWest()) {
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.move();
					totalSpaces++;
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				}
				else{
					roomba.turnLeft();
					roomba.move();
					totalSpaces++;
					roomba.turnLeft();
				}
				
			}
			System.out.println("the area of the room is "+totalSpaces);
			System.out.println("the largest pile was "+largestPile+" beepers and is located at ("+largestPileLocationX+","+largestPileLocationY+")");
			System.out.println("there were "+totalPiles+" piles");
		}
		return totalBeepers;
		
		
	}
		
		 // Need to move this somewhere else.
        // This method should return the total number of beepers cleaned up.
	
}