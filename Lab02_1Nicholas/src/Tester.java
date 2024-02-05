
/**
 * LAB02_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: I had help with some of my
 * classmates Jason Gaunt and Michael Yin. Some of the code were provided by the professor. The rest were
 * all of my own.
 * 
 * Purpose: To display the total value of all the bills and the series in which they are in.
 * 
 * @author (Nicholas Sin)
 * @version Resubmitted (01/26/2023) 
 */

public class Tester {

	private static Wallet myMoney = new Wallet();
	

	public static void main(String[] args) {

		myMoney.addBill(10,"2004");
		myMoney.addBill(100,"2010");
		myMoney.addBill(20,"2004");
		myMoney.addBill(1,"1999");
		
		myMoney.displayAll();
		
		System.out.println("Total value of the bills: " + myMoney.totValue());
		
		System.out.println("Number of bills in series 2004: " + myMoney.countBySeries("2004"));

		
	}

}
