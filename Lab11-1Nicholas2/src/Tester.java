import java.util.*;
/**
 * Lab11_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, 
 * while the rest were all of my own.
 * 
 * Purpose: An outline of an instructor-led demo to introduce Pipelines
 * 
 * @author (Nicholas Sin)
 * @version (04/03/2023)
 */
public class Tester {

	public static void main(String[] args) {
		ArrayList<Info> people = new ArrayList<Info>();
		people.add(new Info ("James", 21));
		people.add(new Info ("Kevin", 19));
		people.add(new Info ("Mason", 37));
		people.add(new Info ("Nicholas", 20));
		people.add(new Info ("Henry", 21));
		
		people.forEach(p -> 
		System.out.println(p));
		
		people.stream()
		      .forEach(p -> System.out.println(p));
		
		people.stream()
		      .filter( p -> p.getAge() > 21)
		      .forEach(p -> System.out.println(p));
		
		people.stream()
		      .map( p -> p.getAge()) //new stream created – of just ints
		      .forEach(p-> System.out.println(p));
		
		int totAges =
				people.stream()
				      .map( p -> p.getAge())
				      .reduce(0, (total, age) -> total + age);
				      System.out.println("Tot ages: " + totAges);
		

	}

}
