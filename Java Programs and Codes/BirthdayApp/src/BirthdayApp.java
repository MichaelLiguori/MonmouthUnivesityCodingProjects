
public class BirthdayApp {
	public static void main(String args[]) {
		
		BirthSim sim = new BirthSim(305, 2); //# of people, # of simulations
		System.out.println(sim.simulation());
		sim.displayStatements();
		
		BirthSim sim2 = new BirthSim(50, 1000); //# of people, # of simulations
		System.out.println(sim2.simulation());
		sim2.displayStatements();
		
		BirthSim sim3 = new BirthSim(1, 20); //# of people, # of simulations
		System.out.println(sim3.simulation2());
		sim3.displayStatements();
		
		BirthSim sim4 = new BirthSim(50, 1000); //# of people, # of simulations
		System.out.println(sim4.simulation2());
		sim4.displayStatements();
	}

}
