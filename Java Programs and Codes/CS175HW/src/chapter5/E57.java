//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		String order = "";
		System.out.println("Input three integers and I will print whether they are sorted in ascending or descending order, or not in order.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ((a<b && b<c) || (a>b && b>c) || (a<b && b==c) || (a>b && b==c) || (a==b && b<c) || (a==b && b>c))
			order = " are in order.";
		else 
			order = " are not in order.";
		System.out.println("The numbers " + a + ", " + b + ", and " + c + order);
		
	}//main

}//E57 class
