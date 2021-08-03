//Sample code to practice string manipulation

package chapter6;

import java.util.Scanner;

public class E64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Please enter a string input:");
		input = sc.next();
		System.out.println("PART A: Uppercased string is " + input.toUpperCase());
		System.out.print("PART B: Every second letter of string is ");
		for (int x = 1; x<input.length(); x= x+2)
			System.out.print(input.charAt(x) + " ");
		System.out.println();
		System.out.print("PART C: The number of vowels in string is ");
		int vowelCount = 0;
		for (int x = 0; x < input.length(); x++) {
			if (input.charAt(x)== 'a' || input.charAt(x)== 'A' || input.charAt(x)== 'e'|| input.charAt(x)== 'E' || input.charAt(x)== 'i' || input.charAt(x)== 'I' || input.charAt(x)== 'o'||  input.charAt(x)== 'O' || input.charAt(x)== 'u'|| input.charAt(x)== 'U') 
				vowelCount++;
		}//for
		System.out.print(vowelCount + ".");
		System.out.println();
		System.out.print("PART D: The positions of all vowels in string are ");
		for (int x = 0; x < input.length(); x++) {
			if (input.charAt(x)== 'a' || input.charAt(x)== 'A' || input.charAt(x)== 'e'|| input.charAt(x)== 'E' || input.charAt(x)== 'i' || input.charAt(x)== 'I' || input.charAt(x)== 'o'||  input.charAt(x)== 'O' || input.charAt(x)== 'u'|| input.charAt(x)== 'U') 
				System.out.print(x + 1 + ", ");
		}//for 
		sc.close();
	}//main

}//class
