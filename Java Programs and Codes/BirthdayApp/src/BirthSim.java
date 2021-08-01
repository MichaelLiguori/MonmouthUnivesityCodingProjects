//Sample Code that simulates birthdays of a population to see how often the same birthday occurs
//Shows trends of "randomness" using java.utl.Random

import java.util.Random;

public class BirthSim {
	private int num;     // # of people
	private int m;	 // m times of simulations
	private int statements = 0;
	
	//constructor
	BirthSim(int n, int r){ statements++;
		num = n; statements++;
		m = r;	statements++;
	}
	
	//check if at least two people out of num have same birthday
	private Boolean haveSameBirthday() { statements++;
		int[] bDay = new int[num]; statements++;  //to store num birthdays
		
		for(int i=0; i<num; i++) {statements++;
			bDay[i] = -1;        statements++;
		}
		//create a Random instance
		Random rand = new Random(); statements++;
		
		int newBirthday = 0; statements++;
		
		//populate the with random birthdays in {0, 1, ... 364}
		for (int i=0; i<num; i++) { statements++;
			newBirthday = rand.nextInt(365); statements++;  // returns a number in {0, 1, ... 364}
			
			//check to see if the newly generated birthday already exists in the array
			for (int j=0; j<i; j++) { statements++;
				if(bDay[j] == newBirthday) { statements++;
				statements++; return true;
				}
			}
			
			//store newBirthday to the array
			bDay[i] = newBirthday; statements++;
		}
		
		//we get here because no two people have the same birthday
		statements++; return false; 
	}
	
	//Lab assignment 1:
	//implement a second simulation method, that creates a Boolean array of 365
	//initialize the array to false,
	//then going to a loop to generate a new birthday
	//check the Boolean array, if the value at the new birthday index is true;
	//...it means somebody else has that birthday, and return true;
	//otherwise (false), the birthday is not taken, and change the value to true
	//...and continue the loop.
	
	//simulation
	public double simulation() { statements++;
		int count = 0; statements++;// to store how many times out of m rounds of
		               // simulation at least two people have same birthday.
		
		// perform m rounds of simulation
		for (int i=0; i<m; i++) { statements++;
			//check to see if any 2 people out of num have the same birthday
			if(haveSameBirthday()) { statements++;
				count++; statements++;
			}
		}
		statements++; return (double)count/m; 
	}
	public double simulation2() { statements++;
		int count = 0; statements++; // to store how many times out of m rounds of
        			   // simulation at least two people have same birthday.
		
		// perform m rounds of simulation
		for (int i=0; i<m; i++) { statements++;
			//check to see if any 2 people out of num have the same birthday
			if(haveSameBirthday2()) {statements++;
				count++; statements++;
			}
		}
		statements++; return (double)count/m; 
	}
	
	private Boolean haveSameBirthday2() { statements++;
		boolean[] days365 = new boolean[365]; statements++; // initializes an array of 365 days
		for (int i = 0; i<365; i++) { statements++; //loops to set 
			days365[i] = false;     statements++; //all values to false
		}
		//create a Random instance
		Random rand = new Random(); statements++;
		
		int newBirthday = 0; statements++;
		
		//populate the with random birthdays in {0, 1, ... 364}
		for (int i=0; i<num; i++) { statements++;
			newBirthday = rand.nextInt(365);   statements++;// returns a number in {0, 1, ... 364}
			
			//check to see if the newly generated birthday already exists in the array
			if(days365[newBirthday] == false) { 	statements++;		//store newBirthday to the array if false
				days365[newBirthday] = true;  statements++;
			}else { statements++;
			statements++; return true;
			}
		}
		//we get here because no two people have the same birthday
		statements++; return false;
	}
	public void displayStatements() {
		System.out.println("# of statements: " + statements);
	}
}
