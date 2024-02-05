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
 */

import java.io.*;
public class SerialDemo
{
     public static void main(String args[]) throws Exception
     {
         Book b[] = new Book[3];
         
         b[0] = new Book("War and Peace",345);
         
         b[1] = new Book("BlueJ for Profit",245);
         File f1 = new File("bookdata.dat");
         ObjectOutputStream os 
             =new ObjectOutputStream( new FileOutputStream (f1));
         
         for(int i=0; i < 2; i++)
            os.writeObject(b[i]);
            
         os.close();
         
         //you will add the "read" routine here...
         
         
        }
}
