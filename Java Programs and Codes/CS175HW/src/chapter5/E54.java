//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0;
		double b = 0;
		double c = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter three numbers. I will print whether they are all the same, all different, or neither. ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		if (a == b && b==c)
			System.out.println("All three numbers are the same.");
		else if (a!= b && a!= c && b!= c) 
			System.out.println("All three numbers are different.");
		else
			System.out.println("All three numbers are neither different or the same.");
	}//main

}//class
