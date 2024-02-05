import javax.swing.JOptionPane;

public class VINException extends Exception {

	public VINException(String msg)
	{
		super(msg);
		JOptionPane.showMessageDialog(null, msg);
		
	}
	public VINException()
	{
		JOptionPane.showMessageDialog(null, "Invalid VIN";
		//System.out.println("Invalid VIN");
	}
}
