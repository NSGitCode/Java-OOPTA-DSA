/**
 * Lab03_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with Jason Gaunt helping 
 * me with some of the code while the rest were all of my own.
 * 
 * Purpose: Using Comparable to sort out students by name, id and birthdate.
 * 
 * @author (Nicholas Sin)
 * @version (01/30/2023)
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<>();
		roster.add(new Student("Smith", 1234, 19980422));
		roster.add(new Student("Jones", 1122, 19990422));
		roster.add(new Student("Thomas", 4567, 20000422));
		roster.add(new Student("Rubens", 0345, 19981122));
		display(roster);
		Collections.sort(roster);
		System.out.println("\nby ID Ascending:");
		display(roster);

	}
	
	public static void display(ArrayList<Student> section)
	{
		for(Student s : section)
			System.out.println(s);

	}

}
