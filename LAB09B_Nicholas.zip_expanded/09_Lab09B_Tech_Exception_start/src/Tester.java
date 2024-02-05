/**
 * Tester  -- Simple driver for Tech Support application
 *            Adapted from a BlueJ project in Kolling textbook for IOOP
 *            
 *            For OOPDA Lab09B, you will add exception handling for a chosen keyword, 
 *            and your exception will not end execution of the app.
 *            
 * @author Prof W
 *
 *Lab09A_Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with my peers helping 
 * me with some of the code while the rest were all of my own.
 * 
 * Purpose: Showing the Invalid Complaint Exception in a Tech Support application.
 * 
 * @author (Nicholas Sin)
 * @version (03/23/2023)
 *
 */
public class Tester {

	public static void main(String[] args) throws InvalidComplaintException{ //added throws InvalidComplaintException
		SupportSystem s = new SupportSystem();
			s.start();
		 
		
	}

}
