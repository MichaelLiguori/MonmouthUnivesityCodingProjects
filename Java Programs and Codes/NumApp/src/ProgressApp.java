
public class ProgressApp {
	public static void main(String args[]) {
		Progression p = new Progression();
		p.printProgression(10);
		
		System.out.println("\n\nFrom the arith sub class.........");
		Progression a = new ArithProgression();
		a.printProgression(10);
		
		System.out.println("\n\nFrom the arith sub class, inc=3.........");
		Progression a2 = new ArithProgression(3);
		a2.printProgression(10);
		
		System.out.println("\n\nFrom the Geom sub class, base=2.........");
		Progression g = new GeomProgression(3);
		g.printProgression(10);
		
		System.out.println("\n\nFrom the Fibo sub class, .........");
		Progression f = new FiboProgression();
		f.printProgression(10);
		
		
	}

}
