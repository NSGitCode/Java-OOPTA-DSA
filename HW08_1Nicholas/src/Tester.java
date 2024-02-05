import java.util.ArrayList;
import java.util.List;
/**
 * HW08_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help form my peers.
 * 
 * Purpose: Using the builder pattern to create a list for CSCourses.
 * 
 * @author (Nicholas Sin)
 * @version (03/09/2023)
 */
public class Tester {

	public static void main(String[] args) {
		
		ArrayList<CSCourse> courses = new ArrayList<>();
		
		courses.add(
				new CSCourse.CSBuilder("CS","04114", "OOPDA")
				.credits(3)
				.required(true)
				.build()
				);
		
		courses.add(
				new CSCourse.CSBuilder("MATH","01131", "Calculus II")
				.credits(4)
				.required(true)
				.build()
				);
		
		courses.add(
				new CSCourse.CSBuilder("MATH","03160", "Discrete Structures")
				.credits(3)
				.required(true)
				.build()
				);
		
		courses.add(
				new CSCourse.CSBuilder("CS","01205", "Computer Laboratory Techquies")
				.credits(3)
				.required(true)
				.build()
				);
		
		courses.add(
				new CSCourse.CSBuilder("BIOL","01104", "INTR EVOL/SCIENTIFIC INQUIR-RS")
				.credits(3)
				.required(true)
				.build()
				);
		
		display(courses);
		
		

	}
	public static void display(ArrayList<CSCourse> courses)
	{
		for(CSCourse CS : courses)
			System.out.println(CS);

	}


		

}
