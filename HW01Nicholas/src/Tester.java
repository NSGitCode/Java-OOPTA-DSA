/**
* OOPDA HW 01-2 Compile code Eclipse 
*
* Student: Nicholas Sin
* Attribution: This is my original work. No help received.
*
* Purpose: This class contains four variables, num1, num2, sum, and average. This calculates
* the sum of the two numbers. This also calculates the average, which takes the sum and divide
* it by 2. The variables num1, num2, and sum are integers while average is double.
*
* @author (Nicholas Sin)
* @version (01/19/2023)
*/
public class Tester {

	public static void main(String[] args) {
		int num1, num2, sum;
		double average;
		
		num1 = 14;
		num2 = 21;
		sum = num1 + num2;
		average = sum / 2.0;
		
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The average is " + average);

	}

}
