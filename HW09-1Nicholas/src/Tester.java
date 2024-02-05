import java.util.ArrayList;
/*
 * HW09_1Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with my peers helping 
 * me with some of the code while the rest were all of my own.
 * 
 * Purpose: Check if VIN number is valid
 * 
 * @author (Nicholas Sin)
 * @version (03/23/2023)
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		ArrayList<String> vinNum = new ArrayList<>();
		vinNum.add("2FIC2F53GH522130");
		vinNum.add("2FEC2F53GH522130");
		vinNum.add("2HGFC2F53GH522130");
		vinNum.add("4T1BF3EK3BU739907");
		vinNum.add("1B7HF13Y2WJ198530");
		vinNum.add("1T1BF3EK3BU739907");
		vinNum.add("2B3AD56U51RD3ZFSM");
		vinNum.add("1HGQI2F53GH522131");
		
		for(String s : vinNum)
		{
			try
			{
				System.out.println("Processing: " + s);
				isValid(s);
				System.out.println(s + " is Valid");
				Origin(s);
				//checkDigit(s);
				System.out.println();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println();
			}

		}
	}
	public static boolean isValid(String vin) throws VINException
	{
		if (vin.contains("I") || vin.contains("O") || vin.contains("Q")) // checks the VIN if it has the wrong number of characters or contains I, O, or Q
		{
			throw new VINException("Invalid VIN: letters I, O or Q not allowed in a VIN");
		}
	    else if(vin.length() == 17) 
		{
			return true;
		}
		else if (vin.length() != 17)
		{
			throw new VINException("Invalid VIN: wrong number of characters");
		}
		else 
		{    
			System.out.println(vin);
		}
		return false;
		}

	public static void Origin(String vin) // Checks the origin of the vehicle if it passes the valid check
	{
		 if (vin.charAt(0) == '1' || vin.charAt(0) == '4' || vin.charAt(0) == '5') {
			System.out.println("Origin: United States");
		} else if (vin.charAt(0) == '2') {
			System.out.println("Origin: Canada");
		} else if (vin.charAt(0) == '3'){
			System.out.println("Origin: Mexico");
		}
		else {
			System.out.println("Country Unknown");
		}
	}
	
	/*
	 * public static void checkDigit(String vin) throws VINException {
	 * 
	 * int sum = 0; sum = sum % 11; char check = vin.charAt(8); if (check != 'X' &&
	 * (check < '0' || check > '9')) { throw new
	 * VINException("Invalid VIN: Check digit is invalid"); }
	 * 
	 * if(sum == 10 && check == 'X') { System.out.println("Check Digit: " + check);
	 * } else if (sum == check -'0') { System.out.println("Check Digit: " + check);
	 * } else { throw new VINException("Invalid VIN: Check digit is invalid"); }
	 * 
	 * 
	 * }
	 */
	
}
