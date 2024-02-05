/**
 * Lab04_2Nicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help
 *  with some of the code while the rest were all of my own.
 * 
 * Purpose: Using lambdas to show birds and if they need food.
 * 
 * @author (Nicholas Sin)
 * @version (02/8/2023)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Tester {

	public static void main(String[] args) {
		List<Bird> flock = new ArrayList<Bird>();
		flock.add(new Bird("Blue Jay", 5, true));
		flock.add(new Bird("Robin", 2,  false));
		flock.add(new Bird("Dove", 1, true));
		flock.add(new Bird("Peacock", 3,  false));
		
		
		BiPredicate<Bird, Integer> isHungry = (b,hr) -> b.getHoursSinceLastMeal() > hr;
		int hr = 3;
		
		Consumer<Bird> breakForFood = b -> {
			if(isHungry.test(b, hr))
			b.setInflight(false);	
			b.setHoursSinceLastMeal(0);
			System.out.println(b + " is feeding");
			};
		
		
			for(Bird b:flock) {
				breakForFood.accept(b);
			}
		
		
	}

}
