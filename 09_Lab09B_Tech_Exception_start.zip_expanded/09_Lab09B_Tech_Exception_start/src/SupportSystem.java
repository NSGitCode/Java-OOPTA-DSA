import java.util.HashSet;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    1.0 (2016.02.29)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    
    public void start() throws InvalidComplaintException
    {
        boolean finished = false;

        printWelcome();

        while(!finished) { //Added try and catch exception if input contains crash
            HashSet<String> input = reader.getInput();
          try {  
        	  
            if(input.contains("bye")) {
                finished = true;
            }
            
            else if (input.contains("crash"))
    		{
            	throw new InvalidComplaintException();
    		}
             
            else if (input.contains("crashes"))
     		{
     			throw new InvalidComplaintException();
     		}
            else 
            {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
          catch (Exception e)
          {
          	System.out.println("Exception: " + e.getMessage());
          }
        }
        
        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
