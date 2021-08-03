package chapter5;

import java.util.Scanner;

public class E510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int OVERTIME = 40;
		String name = "";
		double hourlyWage = 0;
		double hoursWorked =0;
		double pay = 0;
		System.out.println("What is the name of the employee?");
		name = sc.next();
		System.out.println("What is their hourly wage?");
		hourlyWage = sc.nextDouble();
		System.out.println("How many hours has the employee worked in the past week?");
		hoursWorked = sc.nextDouble();
		if (hoursWorked>OVERTIME)
			pay = (hoursWorked-OVERTIME)*hourlyWage*1.5 + OVERTIME*hourlyWage;
		else 
			pay = hoursWorked*hourlyWage;
		System.out.println(name + " earned $" + pay +" for last week.");
		
	}//main

}//E510 class
