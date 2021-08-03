//Code practicing priority queue

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collection;

public class PriorityQApp {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(3);
		q1.add(10);
		q1.add(-5);
		q1.add(7);
		
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(3);
		c.add(10);
		c.add(-5);
		c.add(7);
		PriorityQueue<Integer> q2 = new PriorityQueue<Integer>(c);

		while(!q2.isEmpty())
		System.out.println(q2.remove());
		
		//Using customized comparator
		//application to ER
		//priority determined ESI
		//if two people have same ESI
		//then FIFS
		PriorityQueue<Patient> q3 = new PriorityQueue<Patient>(new PatientComparator());
		q3.add(new Patient());
		q3.add(new Patient("John", 3));
		q3.add(new Patient("Joe", 2));
		q3.add(new Patient("Mike", 4));
		q3.add(new Patient("Jack", 1));
		q3.add(new Patient("Brian", 2));
		while(!q3.isEmpty()) {
			q3.remove().display();
			System.out.println();
		}
		/**************************
		 * Priority() for student registration
		 * Priority: based on credits completed first, then GPA
		 */
		System.out.println("********************************************************");
		PriorityQueue<Student> q4 = new PriorityQueue<Student>(new StudentComparator());
		q4.add(new Student());
		q4.add(new Student("John", 20, 3.0));
		q4.add(new Student("Joe", 30, 2.0));
		q4.add(new Student("Mike", 10, 3.5));
		q4.add(new Student("Jack", 10, 3.7));
		q4.add(new Student("Brian", 30, 3.0));
		while(!q4.isEmpty()) {
			q4.remove().display();
			System.out.println();
		}
	}
	private static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}

