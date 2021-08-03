//HW assignment for practicing condition statements

package chapter5;

import java.util.Scanner;

public class EarthquakeClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double richter;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the richter Scale value?");
		richter = in.nextDouble();
		
		if (richter >= 8.0)
			System.out.println("Most structures will fall.");
		
		else if(richter >= 7.0)
			System.out.println("Many buildings destroyed.");
		
		else if (richter >= 6.0)
			System.out.println("Many buildings considerably damaged, some collapse.");
		
		else if (richter >= 4.5)
			System.out.println("Damage to poorly constructed buildings.");
		
		else 
			System.out.println("No damage occurs");
		
		
		
		
	}

}
