//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class E53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int digits = 0;
		System.out.println("Input an interger, I will print out how many digits the number has.");
		x = sc.nextInt();
		if (x <0)
			x = x *-1;
		else
			if (x>=0 && x <10)
				digits = 1;
			else if (x>=10 && x <100)
				digits = 2;
			else if (x>=100 && x <1000)
				digits = 3;
			else if (x>=1000 && x <10000)
				digits = 4;
			else if (x>=10000 && x <100000)
				digits = 5;
			else if (x>=100000 && x <1000000)
				digits = 6;
			else if (x>=1000000 && x <10000000)
				digits = 7;
			else if (x>=10000000 && x <100000000)
				digits = 8;
			else if (x>=100000000 && x <1000000000)
				digits = 9;
			else if (x>=1000000000 && x <10000000000L)
				digits = 10;
		System.out.print("There are " + digits + " many digits in the integer " + x + ".");
	}//main

}// E53 class
