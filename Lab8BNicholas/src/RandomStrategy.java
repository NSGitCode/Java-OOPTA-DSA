import java.util.Random;

public class RandomStrategy implements Strategy{
	public RPS shoot(RPS last) {
		
		Random rgen = new Random();
		int choice = rgen.nextInt(3);
		
		if(choice == 0)
		{
			return RPS.ROCK;
		}
		
		else if(choice == 1)
		{
			return RPS.PAPER;
		}
		
		else if (choice == 2)
		{
			return RPS.SCISSORS;
		}
		
		else
		{
			return RPS.SCISSORS;
		}
		
		
	}
}
