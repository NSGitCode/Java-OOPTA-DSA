/**
 * Lab08_BNicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help form my peers.
 * 
 * Purpose: Running a program that puts two players in Rock, Paper, Scissors with different strategies.
 * 
 * @author (Nicholas Sin)
 * @version (03/09/2023)
 */

public class Tester {

	public static void main(String[] args) {
		Context player1 = new Context(new RandomStrategy());
		Context player2 = new Context(new OppositeStrategy());
		
		for(int i=0; i<10; i++)
		{
		RPS P1 = player1.executeStrategy(RPS.ROCK);
		RPS P2 = player2.executeStrategy(RPS.ROCK);
		System.out.println("Player1: " + P1);
		
		System.out.println("Player2: " + P2);
		
		
		if(P1 == RPS.SCISSORS)
		{
			if(P2 == RPS.PAPER)
			{
				System.out.println("Player1 Wins");
			}
			else if(P2 == RPS.ROCK)
			{
				System.out.println("Player2 Wins");
			}
			else
			{
				System.out.println("TIE");
			}
			System.out.println();
		}
		else if(P1 == RPS.PAPER)
		{
			if(P2 == RPS.SCISSORS)
			{
				System.out.println("Player2 Wins");
			}
			else if(P2 == RPS.ROCK)
			{
				System.out.println("Player1 Wins");
			}
			else
			{
				System.out.println("TIE");
			}
			System.out.println();
		}
		
		else if(P1 == RPS.ROCK)
		{
			if(P2 == RPS.SCISSORS)
			{
				System.out.println("Player1 Wins");
			}
			else if(P2 == RPS.ROCK)
			{
				System.out.println("TIE");
			}
			else
			{
				System.out.println("TIE");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Player1 Wins");
		}
		
		
		}
	
	}

}
