
/**
 * Foxes v2 as Eclipse project
 * @author Barnes,Kolling 
 *     adapted by Prof W for OOPDA
 *
 * Lab07BNicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: The project file was provided by the professor,
 * had some help from my peers.
 * 
 * Purpose: Running the Fox and Rabbit Simulation for 500 times by moving 
 * incrementAge, canBreed, incrementAge, and breed to the Animal class.
 * 
 * @author (Nicholas Sin)
 * @version Submitted (03/1/2023) 
 *
 */
public class Tester {

	public static void main(String[] args) {
		 Simulator sim = new Simulator();
		 //sim.runLongSimulation();
		 sim.simulate(500);

	}

}
