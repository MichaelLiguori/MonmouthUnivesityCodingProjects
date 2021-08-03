import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	public int compare(Student p1, Student p2) {
		if (p1.getCredits() > p2.getCredits())
			return -1;
		else if (p1.getCredits() < p2.getCredits())
			return 1;
		else {
			if (p1.getGPA() >(p2.getGPA()))
				return -1;
			else
				return 1;
		}
	}
}
