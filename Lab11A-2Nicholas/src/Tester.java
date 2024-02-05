import java.util.ArrayList;

/**
 * Driver to test Animal Monitoring
 *   for OOPDA Lab 11A2 
 * 
 * @author Prof W
 *
 * Lab11A-2Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, 
 * while the rest were all of my own.
 * 
 * Purpose: Test Animal Monitoring using lambdas and stream.
 * 
 * @author (Nicholas Sin)
 * @version (04/03/2023)
 *
 */
public class Tester {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add(new String("Mountain Gorilla"));
		animal.add(new String("Buffalo"));
		animal.add(new String("Elephant"));
		
		AnimalMonitor am = new AnimalMonitor();
		am.addSightings("sightings.csv");  //load the file
		am.printList();   //display all the sightings
		//am.getCount();
		am.printEndangered(animal, 100);

	}

}
