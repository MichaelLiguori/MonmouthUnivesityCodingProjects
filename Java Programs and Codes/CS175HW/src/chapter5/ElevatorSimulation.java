//HW assignment for practicing condition statements
//Simulates the missing elevator number 13 for some buildings

package chapter5;

import java.util.Scanner;

public class ElevatorSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int actualFloor;
		int floor;
		int thresholdFloor = 13;
		
		System.out.print("Floor:");
		floor = in.nextInt();
		if (floor == thresholdFloor) {
			actualFloor = floor;
			System.out.println("You cannot choose to go to floor 13. It is Bad Luck Sir!!!");
		}
		else if (floor != thresholdFloor){
				if (floor > thresholdFloor)
				actualFloor = floor - 1;
				else 
				actualFloor = floor;
				System.out.println("Floor number " + floor + " is actually floor number " + actualFloor + ".");
		}
		System.out.println();
		System.out.println("If threshold is 14:");
		thresholdFloor = 14;
		if (floor == thresholdFloor)
			System.out.println("You cannot choose to go to floor " + floor + ". It is Bad Luck Sir!!!");
		else if (floor!= thresholdFloor) {
			if (floor > thresholdFloor)
			actualFloor = floor-1;
			else 
			actualFloor = floor;
			System.out.println("Floor number " + floor + " is actually floor number " + actualFloor + ".");
		}
		System.out.println();
		System.out.println("If both 13 and 14 are skipped:");
		if (floor == thresholdFloor||floor == thresholdFloor-1)
			System.out.println("You cannot choose to go to floor " + floor + ". It is Bad Luck Sir!!!");
		else if (floor!=thresholdFloor){
			if (floor < thresholdFloor - 1)
				actualFloor = floor;
			else 
				actualFloor = floor -2;
			System.out.print("Floor number " + floor + " is actually floor number " + actualFloor + ".");
		}
	

	}

}
