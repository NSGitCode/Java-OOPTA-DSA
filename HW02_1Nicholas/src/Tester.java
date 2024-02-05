/**
 * HW02_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, while the rest were
 * all of my own.
 * 
 * Purpose: To display an array list consisting of the customer, street address, city,
 * which editions, and amount due.
 * 
 * @author (Nicholas Sin)
 * @version (01/26/2023)
 */
public class Tester {
	
	private static PaperRoute myCusts = new PaperRoute();
	
	public static void main(String[] args) {
		

		myCusts.addCustomer("Nathan", "1579 Bedford Ave", "New York", true, false, 15.0);
		myCusts.addCustomer("Alex", "2056 Thorn Street", "Cheyenne", true, false, 15.0);
		myCusts.addCustomer("Kenny","2777 Bobcat Drive", "Washington", true, true, 32.45);
		myCusts.addCustomer("James","1437 Oak Way", "Lincoln", false, true, 80.3);
		
		myCusts.displayAll();
		
		System.out.println(myCusts.totDue());
		//System.out.println(myCusts.countBySubscriptionType());
		

	}

}
