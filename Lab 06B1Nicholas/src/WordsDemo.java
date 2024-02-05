import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Purpose:  Lab06B-1: start with a big file of "words",
 *     then populate an ArrayList to set up for a search.
 *     We retrieve a single entry direcly, counting iterations
 *
 *     We will "shuffle" the ArrayList for random ordering!
 *
 *     revised 2/21/2023 pm to correct for counter++
 *
 *
 * @author Prof W
 */
public class WordsDemo
{

	public static void main(String[] args)
	{

	    ArrayList<String> dict = new ArrayList<>();
		File inFile = new File("words.txt");
       try  (Scanner scan = new Scanner(inFile)) {
        while (scan.hasNextLine())
        {
            String word = scan.nextLine();
            dict.add(word);
        }
       }
       catch (Exception e)   //what could go wrong? :=)
       {   }
        Collections.shuffle(dict);

        //search for "object"
        //...count entries searched
        int counter = 0;
        for(String w : dict)
        {

        	if(w.equals("object"))
        	{
        		System.out.println("Eureeka!!");
        		System.out.println("Found at #" + counter);
        	}
        	counter++;

        }

	}
}
