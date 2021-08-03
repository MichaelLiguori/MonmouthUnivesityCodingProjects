//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String pairs = " are not two pairs";
		System.out.println("Input four integers, and I will print out whther it has two matching pairs or not. ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if  ((a==b && c==d) || (a==c && b==d) || (a==d && b==c))
			pairs = " are two pairs.";
		System.out.print("The numbers " + a + ", " + b + ", " + c + ", and " + d + pairs);
		
	}//main

}//E58 class
