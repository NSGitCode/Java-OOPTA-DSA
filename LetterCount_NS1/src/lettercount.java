/**
 * Letter Count
 *
 * @author (Nicholas Sin)
 * @version (v1.0 1-19-2023)
 */
import java.util.*;
import java.io.*;

public class lettercount {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter name of input file: ");
		//System.out.println("Type 1 to open text file or type 2 to input in terminal:");
		//String fileName = sc.nextLine();
		String s = sc.nextLine();
		s = s.trim();
		int i = 0;
		int j = 0;
		int cnt = 0;
		int length = s.length();
		char ch;
		for (i = 0; i < length; i++) {
			ch = s.charAt(i);
			if (s.indexOf(ch) < i)
				continue;
			for (j = 0; j < length; j++) { // For a specific letter searches the whole string.
				if (s.charAt(j) == ch)
					cnt++;
			}
			System.out.println(ch + ": " + cnt);
	        cnt = 0;
		}
	}
}