import java.util.Scanner;

/**
 *Lab06A_Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: The professor provided most of the code for the project.
 * I had help from tutors who me explained the
 * concept of the searchByName method. The rest of the code was my own.
 * 
 * Purpose: Displaying RosterManager via Hashmap.
 * 
 * @author (Nicholas Sin)
 * @version Submitted (02/22/2023) 
 */

public class Tester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		RosterManager rm = new RosterManager();
		
		rm.addEntry(4219,"Nicholas",  20030409);
		rm.addEntry(4053,"James",  20020610);
		rm.addEntry(7584,"Brandon",  19990909);
		rm.addEntry(3832,"Nathan",  20040315);
		rm.addEntry(9685,"Kevin",  20050401);
		rm.addEntry(5865,"Sam",  20100213);
		rm.addEntry(8573,"Mason",  20030111);
		rm.addEntry(1234,"Haley",  20040512);
		rm.addEntry(6850,"Bob",  20030409);
		rm.addEntry(2323,"Nicole",  20030509);
		
		System.out.println("Search for name: "); // Search through the hashmap rm.
		String nm = s.nextLine();
		
		 System.out.println("Retrieved: " + rm.searchByName(nm)); 

		
	}

}
