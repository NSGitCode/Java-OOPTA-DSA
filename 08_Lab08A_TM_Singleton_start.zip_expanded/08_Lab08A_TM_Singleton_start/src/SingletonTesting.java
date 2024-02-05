

/**
 *   OOPDA Lab08-A 
 *   Demo method for Singleton tests
 *   Will need to revise 
 *      as you make TicketMachine a Singleton
 *      
 * HW04_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help
 *  with some of the code while the rest were all of my own.
 * 
 * Purpose: Turning TicketMachine into a Singleton.
 * 
 * @author (Nicholas Sin)
 * @version (03/6/2023)
 *
 */
public class SingletonTesting
{

	public static void main(String[] args)
	{
		  TicketMachine tm1 = TicketMachine.getInstance();
		  TicketMachine tm2 = TicketMachine.getInstance(); 
		  
		  System.out.println("Tm1 Price = " + tm1.getPrice());
		  System.out.println("Tm2 Price = " + tm2.getPrice());
		 
	}

}
