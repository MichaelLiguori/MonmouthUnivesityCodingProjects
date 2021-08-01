//Meant to be MoneyChange*, this simulates a financial transaction that takes money provided with amount charged.
//Returns what bills and cents are required to give back correct change
import java.util.Scanner;

public class MoneyChamge{
	int a;
	public static void main(String arg[]) {
		double given;
		double charged;

		while(true) {
			try {
				Scanner input = new Scanner (System.in);
				System.out.println("Enter the money given: ");
				given= input.nextDouble();

				System.out.println("Enter the money charged: ");
				charged= input.nextDouble();
				break;
			}catch(Exception e) {
				System.out.println("Invalid Inputs. Try again!");
			}
		}
		double moneyNeededCal=given-charged;
		System.out.printf( "Received $%.2f and charged $%.2f\nExchange: $%.2f. \n\nDetails: \n", given,charged,moneyNeededCal);
		System.out.println("===============");
		System.out.println("Bill\tCnt");
		calculate(moneyNeededCal);
		System.out.println("===============");
	}
	private static void calculate(double moneyNeededCal) {
		// TODO Auto-generated method stub
		int bills[]= {2000,1000,500,100,25,10,5,1};
		int[] counter= new int[8];
		double amount=moneyNeededCal*100;
		for(int i=0;i<bills.length;i++) {
			if(amount>=bills[i]) {
				counter[i]= (int) (amount/bills[i]);
				amount=amount%bills[i];
			}
			System.out.printf("$%.2f \t %d \n",
					bills[i]/100.0,counter[i]);
		}
	}
}

