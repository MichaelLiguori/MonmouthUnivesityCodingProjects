//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class MajorityAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Majority age threshold: ");
		int majorityThreshold = in.nextInt();
		
		System.out.println("Insert your age");
		int myAge = in.nextInt();
		
		System.out.println("Your age is: " + myAge);
		
		
		if (myAge < majorityThreshold) {
			System.out.println("You are in the minoirty age.");
			System.out.println("Bye");
		}
		else 
			System.out.println("You are in the majority age.");
		
		
		in.close();
	}

}
