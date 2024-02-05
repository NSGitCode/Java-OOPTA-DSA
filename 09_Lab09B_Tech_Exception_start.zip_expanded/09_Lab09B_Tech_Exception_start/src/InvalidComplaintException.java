
public class InvalidComplaintException extends Exception{
	
	public InvalidComplaintException()
	{
		System.out.println("Crash is an invalid complaint.");
	}
	public String getMessage()
	{
		return "Crash is an invalid complaint.";
		
	}
}
