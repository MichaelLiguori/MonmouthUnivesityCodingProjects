import java.util.Date;

public class Student {
	private static int iDs = 0;
	private String name;
	private int credits;
	private double gPA;
	private int studentID;
	//default constructor
	public Student() {
		name = "Unknown";
		credits = 0;
		gPA = 0;
		iDs++;
		studentID = iDs;
	}
	//overload constructor
	public Student(String n, int c, double d) {
		name = n;
		credits = c;
		gPA = d;
		iDs++;
		studentID = iDs;
	}
	//accessors
		public int getCredits() {
			return credits;
		}
		public double getGPA() {
			return gPA;
		}
		public String getName() {
			return name;
		}
		public int getStudentID() {
			return studentID;
		}
		
		//display
		public void display() {
			System.out.println("Name:" + name);
			System.out.println("Credits:" + credits);
			System.out.println("GPA:" + gPA);
			System.out.println("Student ID Number:" + studentID);
		}
}
