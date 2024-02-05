/**
 *   Test a TicketMachine
 *   Lab09A -- add Exception handling to printTicket()
 *   @author Barnes, Kolling adapted by Prof W for OOPDA
 */
public class Tester {

	public Tester()  {   }

	public static void main(String[] args)
	{
		TicketMachine tm = new TicketMachine(500);
		tm.insertMoney(200); //needs 500 to purchase
		tm.printTicket();   //sooo naive!!

	}


}
