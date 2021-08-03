package chapter5;

import java.util.Scanner;

public class E511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String unit = "";
		String phase = "";
		double temp = 0;
		System.out.println("What is the temperature?");
		temp = sc.nextDouble();
		System.out.println("What is the unit of temperature? Input C/Celsuis or F/Fahrenhit");
		unit = sc.next();
		if (unit.equals("C") || unit.equals("Celsuis")) 
			if (temp < 0)
				phase = "solid";
			else if (0<temp && temp < 100)
				phase = "liquid";
			else 
				phase = "gas";
		else if (unit.equals("F") || unit.equals("Fahrenheit"))
			if (temp < 32)
				phase = "solid";
			else if ((32 < temp) && temp<212)
				phase = "liquid";
			else
				phase = "gas";
		else 
			phase = "unknown";
		System.out.println("Water is " + phase + " at " + temp + " degrees " + unit + ".");
		
	}//main

}//E511 class
