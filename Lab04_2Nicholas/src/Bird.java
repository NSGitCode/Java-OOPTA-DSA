
public class Bird {
	String birdID; //some identifier
	int hoursSinceLastMeal;
	boolean inflight; //true if bird is flying
	
	Bird(String id, int hrs, boolean isFlying)
	{
		super();
		this.hoursSinceLastMeal = hrs;
		this.birdID = id; 
		this.inflight = isFlying;
	}
	

	@Override
	public String toString() {
		return "Bird " + birdID;
	}


	public String getBirdID() {
		return birdID;
	}

	public void setBirdID(String birdID) {
		this.birdID = birdID;
	}

	public int getHoursSinceLastMeal() {
		return hoursSinceLastMeal;
	}

	public void setHoursSinceLastMeal(int hoursSinceLastMeal) {
		this.hoursSinceLastMeal = hoursSinceLastMeal;
	}

	public boolean isInflight() {
		return inflight;
	}

	public void setInflight(boolean inflight) {
		this.inflight = inflight;
	}
	
}
