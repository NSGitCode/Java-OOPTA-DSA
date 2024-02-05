//Lab04A [FA22] - for each activity
//sbw 2022 08 13 - FA22 Lab 04A was Lab 03B in SP22
// sbw 2022 02 03, 02 04: minor edits to clarify q3 comment
// sbw renamed from 04A/B
//sbw revised some comments FA20
//sbw revised SP20 to clarify q3

/**
 * Lab04A_Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, I had help with
 * some of the code while the rest were all of my own. This is actually the hardest one i've
 * done for now.
 * 
 * Purpose: Using Comparable to sort out students by name, id and birthdate.
 * 
 * @author (Nicholas Sin)
 * @version (02/06/2023)
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *  OOPDA  FA22
 *  Lab 04A For-each Activity  (no streams) 
 *  
 *  In this lab, we will focus on using 
 *  Lambdas individually, and with forEach() iteration, 
 *  by exploring the StandardFfunctional interface(s)
 *        Consumer, Predicate, Function and their standard methods.
 *        
 *  Near the end of this file, there are three numbered 
 *  problems that ask you to write lambdas using Standard Functional Interfaces,
 *  then add code to use the named lambdas...
 *
 */
public class ForEachDemo {
	private final static double RAISE = 1.05;
	private final static double BONUS_RAISE = 1.01;
	public static void main(String[] args) throws ParseException
	{
		//=====================================================================
		// Make an ArrayList with some test data
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Sue", "IT", 70000));
		emps.add(new Employee("Jon", "HR", 50000));
		emps.add(new Employee("Ken", "IT", 60000));
		//=====================================================================
		// Let's make some lambda functions, which can be used as parameters
		// Consumers take one argument (emp) and return no results
		//    Consumer<T>    -- Standard Functional Method = accept()
		Consumer<Employee> giveRaise = emp -> emp.setSalary(emp.getSalary() * RAISE);
		Consumer<Employee> giveBonus = emp -> emp.setSalary(
				emp.getDept().equals("IT") ?  emp.getSalary() * BONUS_RAISE : emp.getSalary());
		//if true //: otherwise
		//====================================================================================
		// Use the Consumer functional interface to give a raise to an instance
	    //   Consumer<T>    -- Standard Functional Method = accept()
		System.out.println("\nTesting Consumer functional interface");
		Employee john = new Employee("John", "Sales", 80000);
		System.out.println("\t" + john + " before running lambda");
		giveRaise.accept(john);
		System.out.println("\t" + john + " after running lambda");
		//====================================================================

		// we are invoking the forEach method of ArrayList [an Iterable implementor]
		System.out.println("\nUsing Consumer lambda functions in forEach"); 
		System.out.println("\nStarting salaries");
		emps.forEach(emp -> System.out.println(emp));
		System.out.println("\nThe standard raise");
		emps.forEach(giveRaise); // <-- Calls the function
		//An alternative syntax using an explicit declaration:
		emps.forEach((Employee emp) -> System.out.println(emp));
		//        note: class name
		System.out.println("\nThe IT bonus raise");
		emps.forEach(giveBonus); // <-- Call the function: only applies to IT emps
		emps.forEach(emp -> System.out.println(emp));	

//----------------------------------------------
		/* Activity:  
		 * 1)   Complete code to declare a new Predicate inRange 
		 *      that will test for employees earning 
		 *      more than $50,000    
		 *      and less than $70,000
		 */

		//add your code HERE:
	
		 Predicate<Employee> inRange = emp 
				 -> emp.getSalary() >= 50000 && emp.getSalary() <= 70000;
		 
		
//-----------------------------------------------
		
		System.out.println("\nEmployees in range:");
		
//-----------------------------------------------
		/*  2) For each employee in emps, check for any inRange
		 *     and display data.  Hint: Use .forEach(...)
		 * 
		 */	
		//add your code HERE:
		
		emps.forEach(emp -> {
			if(inRange.test(emp))
			System.out.println(emp);
			});
		
		
		
//-----------------------------------------------
	
		System.out.println("\nEmployees eligible for 2nd raise:");	
			
//-----------------------------------------------		
		/* 3) Make a BiPredicate called "eligible" to determine if we can give  
		 * a special, additional raise to impoverished workers who would 
		 * make less than a given limit after a second raise.
		 *
		 * Then, use your "eligible" BiPredicate and show emps eligible for another raise  
		 * using $65,000 as the limit, displaying the list of eligible employees.  
		 * [Note that we will not actually apply the second raise.]
		 *
		 * [Note: using a limit of 65000.0 makes it a double, whereas 65000 is int]
		 * 
		 * [Note: assume variable RAISE is within scope for the purpose of calculating]
		 * 
		 *       Hint as pseudo-code:   
		 *              list.forEach( e->  {
		 *                  if(predicte_method)
		 *                      desired action statement  
		 *             }
		 *          );
		 * 
		 */
		//add your code HERE:
	
		BiPredicate<Employee, Double> eligible = (emp, limit) -> 
		emp.getSalary() * RAISE < limit;
        
		double limit = 65000.0;
		
        emps.forEach(emp -> {

        	if(eligible.test(emp, limit)) {
        		giveRaise.accept(emp);
    			System.out.println(emp);
        
           }
        });
		
	
	//-----------------------------------------------
   }//end main()
} //end class