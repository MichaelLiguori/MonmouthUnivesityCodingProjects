//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int x =0;
		String negZeroPos = "";
			System.out.println("Input an integer and I will print whether it is negative, positive, or zero. Enter 666 to exit");
			if(in.hasNextInt()) {
			x = in.nextInt();
				if (x<0)
					negZeroPos = "negative number.";
				else if  (x==0) 
					negZeroPos = "zero.";
				else
					negZeroPos ="positive number.";
				System.out.println(x + " is a " + negZeroPos);
				System.out.println();
			}
			else
				System.out.println("Input is not a number.");
	}//main

}//E51 class
