import java.util.Date;

public class Patient {
	private static int ticketNumber = 0;
	private String name;
	private int category;
	private Date timeArrived;
	private int patientTicketNumber;
	
	//default constructor
	public Patient() {
		name = "Unknown";
		category = 5;
		timeArrived = new Date();
		ticketNumber++;
		patientTicketNumber = ticketNumber;
	}
	//overload constructor
	public Patient(String n, int c) {
		name = n;
		category = c;
		timeArrived = new Date();
		ticketNumber++;
		patientTicketNumber = ticketNumber;
	}
	
	//accessors
	public int getCategory() {
		return category;
	}
	public Date getTimeArrived() {
		return timeArrived;
	}
	public String getName() {
		return name;
	}
	public int getPatientTicketNumber() {
		return patientTicketNumber;
	}
	
	//display
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Category:" + category);
		System.out.println("Time Arrived:" + timeArrived);
		System.out.println("Patient Ticket Number:" + patientTicketNumber);
	}
}
