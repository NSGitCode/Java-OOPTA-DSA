/* 
 * HW11_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with the tutors helping 
 * me with some of the code while the rest were all of my own.
 * 
 * Purpose: Testing streams with lambdas review.
 * 
 * @author (Nicholas Sin)
 * @version (04/08/2023)
 */

import java.util.*;
import java.util.function.Predicate;
public class Tester {
	public static Operation add = (int a, int b) -> a + b;

	public static void main(String[] args) {
		
		question2();
	    question3();
	}
	
	 public static void question2() {
       Student student1 = new Student("John", "CS");
       student1.setNumericIndicator(add.operation(10, 20));
       //System.out.println("Student: " + student1.getName() + "\n" +
       //       "Major: " + student1.getMajor() + "\n" +
       //       student1.getNumericIndicator() + "\n");
   }

	  public static void question3() {
       Random rand = new Random();
      
       int min = 1;
	   int max = 10;
		
       int rand1 = rand.nextInt(max + min) + min;
       int rand2 = rand.nextInt(max + min) + min;
      
       ArrayList<Student> studentList = new ArrayList<>();
      
       studentList.add(new Student("Kyle", "CS"));
       studentList.add(new Student("Jennifer", "Math"));
       studentList.add(new Student("Tom", "Engr"));
       studentList.add(new Student("Eli", "AstroPhysics"));

       //Predicate (required)
       Predicate<Student> cs = student -> student.getMajor().equals("CS");
      
       //match output
       System.out.println("Setting Random values with CS filter\n" +
               "Updated Values:");
       //use a stream (required)
       studentList.stream().forEach(s->{
           if(cs.test(s)) {
               s.setNumericIndicator(add.operation(rand1, rand2));
           }
           System.out.println("-" + s.getName() +
                       ", major: " + s.getMajor() +
                       " = " + s.getNumericIndicator());
       });
   }
	 
}
