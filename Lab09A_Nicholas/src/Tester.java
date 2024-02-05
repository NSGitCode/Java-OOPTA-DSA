/**
 *   Test a TicketMachine
 *   Lab09A -- add Exception handling to printTicket()
 *   @author Barnes, Kolling adapted by Prof W for OOPDA
 *   
 *   Lab09A_Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with my peers helping 
 * me with some of the code while the rest were all of my own.
 * 
 * Purpose:
 * 
 * @author (Nicholas Sin)
 * @version (03/20/2023)
 *   
 */
public class Tester {

	public Tester()  {   }

	public static void main(String[] args)
	{
		TicketMachine tm = new TicketMachine(500);
		tm.insertMoney(200); //needs 500 to purchase
		try {
			tm.printTicket();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}   //sooo naive!!

	}


}
