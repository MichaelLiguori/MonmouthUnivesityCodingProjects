//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		String incDecNeither = "";
		System.out.println("Input three numbers, I will print if they are increasing, decreasing or neither.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (a<b && b<c)
			incDecNeither = "increasing.";
		else if (a>b && b>c)
			incDecNeither = "decreasing.";
		else
			incDecNeither = "neither increasing or decreasing";
		System.out.println("The numbers are " + incDecNeither);
		
	}//main
	
}//E55 class
