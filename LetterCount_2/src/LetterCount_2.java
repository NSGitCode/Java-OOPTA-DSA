
/**
 * @author Nicholas
 * LetterCount_2.java - Count occurrence of letters from input
 * 1-19-2022
 */
import java.io.*;
import java.util.Scanner;

public class LetterCount_2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//File file = new File("src/gettysburg.txt");
		Scanner input = new Scanner(new File("src/gettysburg.txt"));
		
	
		int[] count = new int[26]; // There are 26 letters in the alphabet.

		while (input.hasNextLine()) {
			String answer = input.nextLine();
			answer = answer.toLowerCase();
			char[] characters = answer.toCharArray();

			for (int i = 0; i < characters.length; i++) {
		        
				if ((characters[i] >= 'a') && (characters[i] <= 'z')) {
					count[characters[i] - 'a']++;

				}
			}

		}
		// prints out the output, 
		//if the occurrence of the letter is zero, it would not be shown in the output
		for (int i = 0; i < 26; i++) { 
			if (count[i] != 0) { 
				System.out.print((char) (i + 'a'));
				System.out.println(": " + count[i]);
            }
			
		}

		/*
		 * System.out.println("Do you want to continue y or n"); String c =
		 * input.nextLine();
		 * 
		 * if (c.equalsIgnoreCase("n")) { break; } // else continue to loop on any
		 * string
		 */
	}

}
