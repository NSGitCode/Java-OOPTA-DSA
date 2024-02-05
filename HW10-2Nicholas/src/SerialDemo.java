/** 
 *   OOPDA Lab 11B - Serializable 
 *        sbw --  rev 1/13/2020 after FA20 
 *      This is the "start" for the lab
 *      Instructions in handout.  Summary:
 *      1) [modify class Book]
 *      2) Test to be sure code so far works...
 *      [Note UGLY "throws Exception" header for main)
 *         You will fix later!!
 *      ]
 *      3) Add routine to READ after the write code.
 *          3a) should LOOP to  read a Book from the stream into a Book bk object, then display
 *          3b) Note that you'll need to cast: e.g., bk = (Book) is.readLine()
 *          
 *      4) verify that code works
 *      5) Now, surround all the write code with a try block:  use try with resources
 *         5a)hint: Eclipse might help a little by auto-generating some missing catch statements
 *         
 *      6)  repeat for the read code, using try with resources
 *      
 *      7) test
 *      
 *      8)  Finally, modify to read using an endless loop with a catch for EOFException
 *          8a) we should have discussed two possible approaches to this task!
 *          
 *      9)  Maybe add another Book to the test data :=)
 *      
 *      10) Test for completeness, take screen sho, etc... 
 *      
 * HW10-2Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: The professor had some help with the code, and even fixed it. The project file was
 * also provided by the professor.
 * 
 * I had some with with some of my peers, but other than that the rest of the code was my own.
 * 
 * Purpose: Putting a try and catch to throw exception in Serializable with file read.
 * 
 * @author (Nicholas Sin)
 * @version Submitted (03/30/2023) 
 */

import java.io.*;
import java.util.Scanner;
public class SerialDemo
{
     public static void main(String args[])
     {
         Book b[] = new Book[4];
         
         b[0] = new Book("War and Peace", 345);
         
         b[1] = new Book("BlueJ for Profit", 245);
         
         b[2] = new Book("The Richest Man in Babylon", 155); // changed pages to the actual number of pages in the book
         //File f1 = new File("bookdata.dat");
         
         try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream (new File("bookdata.dat"))))
         {
        	 for(int i=0; i < 3; i++)
                 os.writeObject(b[i]);
        	 		//os.close();
         }
         catch(IOException e)
         {
        	 System.out.println("IOException");
         }
         catch(Exception e)
         {
        	 System.out.println("Exception");
         }
         
         //you will add the "read" routine here...
         
         Book bk = null;
         
         try(ObjectInputStream is = new ObjectInputStream(new FileInputStream (new File("bookdata.dat"))))
         {
        	 while(true) {

        		 bk = (Book) is.readObject();
        		 System.out.println(bk);
        	 }
         }
         catch(IOException e)
         {
        	 System.out.println("IOException");
         }
         catch(ClassNotFoundException e)
         {
        	 System.out.println("ClassNotFoundException");
         }
         catch(Exception e)
         {
        	 System.out.println("Exception");
         }
         
         try(BufferedReader numReader = new BufferedReader(new FileReader("bookdata.dat"))) // try-catch block to add the sum of the numbers
         {
        	 String line;
        	 int sum = 0;
        	 while((line = numReader.readLine()) != null)
        		{
        		 try
        		 {
        			 String[] s = line.split("...");
        			 int num = Integer.parseInt(s[1]);
        			 sum += num;
        		 }
        		 catch(NumberFormatException exception)
        		 {
        			 return;
        		 }
        		} 
        	 System.out.println("Sum of the numbers: " + sum); 
         }
         
         catch(EOFException e)
         {
        	 System.out.println("EOFException");
         }
         catch(IOException e)
         {
        	 System.out.println("IOException");
         }
         catch(Exception e)
         {
        	 System.out.println("Exception");
         }
         
     }
 
}
