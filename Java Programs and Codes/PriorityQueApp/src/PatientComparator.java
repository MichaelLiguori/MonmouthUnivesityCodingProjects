import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
	public int compare(Patient p1, Patient p2) {
		if (p1.getCategory() < p2.getCategory())
			return -1;
		else if (p1.getCategory() > p2.getCategory())
			return 1;
		else {
			if (p1.getPatientTicketNumber() <(p2.getPatientTicketNumber()))
				return -1;
			else
				return 1;
		}
	}
}
