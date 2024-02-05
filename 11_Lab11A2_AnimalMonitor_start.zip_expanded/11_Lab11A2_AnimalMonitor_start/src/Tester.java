/**
 * Driver to test Animal Monitoring
 *   for OOPDA Lab 11A2 
 * 
 * @author Prof W
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		AnimalMonitor am = new AnimalMonitor();
		am.addSightings("sightings.csv");  //load the file
		am.printList();   //display all the sightings
		 

	}

}
