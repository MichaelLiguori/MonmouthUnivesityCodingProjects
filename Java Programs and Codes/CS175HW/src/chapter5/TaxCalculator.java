//HW assignment for practicing condition statements
//Also asks for input to determine future actions

package chapter5;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final double SINGLE_TAX_THRESHOLD = 32000;
		final double MARRIED_TAX_THRESHOLD = 64000;
		final double UNDER_TAX_THRESHOLD_TAX = .10;
		final double OVER_TAX_THRESHOLD_TAX = .25;
		double userTaxableIncome = 0;
		double userTax;
		String status= "";
		System.out.println("What is your taxable income?");
		userTaxableIncome = in.nextDouble();
		System.out.println("What is your status (S/SINGLE or M/MARRIED)?");
		status = in.next();
		if (status.equals("S") || status.equals("SINGLE")) 
			if (userTaxableIncome <= SINGLE_TAX_THRESHOLD) 
				userTax = userTaxableIncome * UNDER_TAX_THRESHOLD_TAX;
			else 
				userTax =( userTaxableIncome - SINGLE_TAX_THRESHOLD)  * OVER_TAX_THRESHOLD_TAX + SINGLE_TAX_THRESHOLD *UNDER_TAX_THRESHOLD_TAX;	
		else 
			if (userTaxableIncome <= MARRIED_TAX_THRESHOLD ) 
				userTax = userTaxableIncome * UNDER_TAX_THRESHOLD_TAX;	
			else 
				userTax = (userTaxableIncome - MARRIED_TAX_THRESHOLD)  * OVER_TAX_THRESHOLD_TAX + MARRIED_TAX_THRESHOLD * UNDER_TAX_THRESHOLD_TAX;
		System.out.println("Your tax due is $" + userTax + ".");
		}//main
	}//class

