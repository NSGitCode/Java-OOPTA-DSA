import java.util.ArrayList;
import java.util.Collections;

/**
 * HW03NicholasSorted 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, while the rest were
 * all of my own.
 * 
 * Purpose: To display an array list consisting of the customer, street address, city,
 * which editions, and amount due. (Now it is sorted)
 * 
 * @author (Nicholas Sin)
 * @version (02/2/2023)
 */
public class Tester {
	
	private static PaperRoute myCusts = new PaperRoute();
	
	public static void main(String[] args) {
		
		ArrayList<Customer> Customer = new ArrayList<>();	
		myCusts.addCustomer("Nathan", "1579 Bedford Ave", "New York", true, false, 15.0);
		myCusts.addCustomer("Alex", "2056 Thorn Street", "Cheyenne", true, false, 15.0);
		myCusts.addCustomer("Kenny","2777 Bobcat Drive", "Washington", true, true, 32.45);
		myCusts.addCustomer("James","1437 Oak Way", "Lincoln", false, true, 80.3);
		myCusts.displayAll();
		Collections.sort(Customer);
		System.out.println("\nby Customer Ascending:");
		myCusts.listAccounts();
		
		
		
		
		System.out.println(myCusts.totDue());
		//System.out.println(myCusts.countBySubscriptionType());
		

	}


}
