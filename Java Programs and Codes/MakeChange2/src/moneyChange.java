import java.util.Scanner;
public class moneyChange{
	int a;
	public static void main(String arg[]) {
		try {
			Scanner input = new Scanner (System.in);

			System.out.println("Enter the money given: ");
			double given= input.nextDouble();
			System.out.println("Enter the money charged: ");
			double charged= input.nextDouble();

			double moneyNeededCal=given-charged;

			System.out.printf( "Receied $%.2f and charged $%.2f\nExchange: $%.2f. \n\nDetails: \n", given
					,charged,moneyNeededCal 
					);
			System.out.println("===============");
			System.out.println("Bill\tCnt");
			calculate(moneyNeededCal);
			System.out.println("===============");
		}catch(Exception e) {
			System.out.println("Exception encounterd: "+e.toString());
		}

	}