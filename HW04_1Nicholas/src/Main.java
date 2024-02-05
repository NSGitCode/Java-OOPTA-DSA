/**
 * HW04_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help
 *  with some of the code while the rest were all of my own.
 * 
 * Purpose: Using lambdas and comparators to display a list of students in order from name ascending to studentID descending.
 * 
 * @author (Nicholas Sin)
 * @version (02/11/2023)
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Sin", "Nicholas",383478, 20030409));
		roster.add(new Student("Jon", "James", 8568961, 20010114));
		roster.add(new Student("Ray", "Lawnson", 4863035, 19990903));
		roster.add(new Student("Chase", "Garrett", 7484372, 20061206));
		displayList(roster);
		
		System.out.println();

		Comparator<Student> name_ascending = (Student s1, Student s2)->
		s1.getFirstName().compareTo(s2.getFirstName());

		Comparator<Student> birthdate_descending =  (Student s1, Student s2)->
		s2.getBirthDate() - (s1.getBirthDate());         

		Comparator<Student> studentID_ascending = (Student s1, Student s2)->
		s1.getStudentID() - (s2.getStudentID());    

		Comparator<Student> studentID_descending = (Student s1, Student s2)->
		s2.getStudentID() - (s1.getStudentID());          

		System.out.println("\nBy Name-Ascending Order:-");         
		roster.sort(name_ascending); 
		displayList(roster); 
		
		System.out.println("\nBy BirthDate-Descending Order:-");         
		roster.sort(birthdate_descending);         
		displayList(roster);   

		System.out.println("\nBy StudentID-Ascending Order:-");         
		roster.sort(studentID_ascending);         
		displayList(roster);     

		System.out.println("\nBy StudentID-Descending Order:-");   
		roster.sort(studentID_descending);         
		displayList(roster); 

	}     

	public static void displayList(ArrayList<Student> roster) 
	{ 	
		System.out.println("ID FirstName LastName BirthDate");         
		for (int i=0; i<roster.size(); i++) {              
			System.out.println(roster.get(i));}     
	} 


	private static void displayList(List<Student> roster) {
		for(Student s : roster)
			System.out.println(s);

	}

}
