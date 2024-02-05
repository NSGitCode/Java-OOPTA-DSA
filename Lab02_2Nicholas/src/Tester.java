/**
 * LAB02_2Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: I had help with some of my
 * classmates Jason Gaunt and Luke Passareooa. Some of the code were provided by the professor. The rest were
 * all of my own.
 * 
 * Purpose: To display an array list consisting of students and instructors.
 * 
 * @author (Nicholas Sin)
 * @version (01/25/2023)
 */
 
import java.util.*;

public class Tester {
	
	private static ArrayList<RoleDisplayable> RD;

	public static void main(String[] args) {
		RoleDisplayable student1 = new Student("JOHN");
		RoleDisplayable student2 = new Student("STEVE");
		RoleDisplayable student3 = new Student("NICHOLAS");
		RoleDisplayable instructor1 = new Instructor("JIMMY");
		RoleDisplayable instructor2 = new Instructor("HARVY");
		
		RD = new ArrayList<RoleDisplayable>();
		RD.add(student1);
		RD.add(student2);
		RD.add(student3);
		RD.add(instructor1);
		RD.add(instructor2);
		
		for(RoleDisplayable person : RD)
		{
			person.displayNameAndRole();
		}
		
	}

}
