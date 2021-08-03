//HW assignment for practicing inputs
//and finishing certain tasks with those inputs

package chapter6;

import java.util.Scanner;

public class E63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String stringInput = "";
		String concatenatedStringInput = "";
		String concatednatedCumulativeTotal = "";
		int input = 0;
		int lowest = Integer.MIN_VALUE;
		int highest = Integer.MAX_VALUE;
		int cumulativeTotal = 0;
		int evenInputs = 0;
		int oddInputs = 0;
		int counter = 0;
		boolean stop = false;

		System.out.println("Enter a sequence of integer inputs ending with \"STOP\"");
		do {
			stringInput = sc.next();
			if (stringInput.equals("STOP"))
				stop = true;
			else {
				concatenatedStringInput = concatenatedStringInput.concat(stringInput);
				input = Integer.parseInt(stringInput);
				cumulativeTotal = cumulativeTotal + input;
				if (counter == 0) {
					highest = input;
					lowest = input;
					counter++;
				}//if
				if (input%2 ==0)
					evenInputs++;
				else
					oddInputs++;
				if (input > highest) {
					highest = input;
				}//if
				else if (input < lowest) {
					lowest = input;

				}//else if
				concatednatedCumulativeTotal = concatednatedCumulativeTotal.concat(Integer.toString(cumulativeTotal) + " ");
			}//else
			
		} while ( stop == false);
		
		System.out.println("PART A:The smallest input is " + lowest + " and the largest input is "+ highest + ".");
		System.out.println("PART B:There are " + evenInputs + " even inputs and "+ oddInputs + " odd inputs.");
		System.out.println("PART C:The cumulative totals of the inputs are " + concatednatedCumulativeTotal + ".");
		System.out.print("PART D:The adjecent duplicates, if any. ");

		for ( int x = 1; x < concatenatedStringInput.length(); x++) 
			if (concatenatedStringInput.charAt(x) == concatenatedStringInput.charAt(x-1))
				System.out.print(concatenatedStringInput.charAt(x) + " ");
	
		
	}//main

}//class
