
public class Student {
	private double midtermX;
	private double finalX;
	
	protected Student(double midtermX, double finalX)
	{
		super();
		this.midtermX = midtermX;
		this.finalX = finalX;
	}

	
	public double calculateGPA()
	{
		double gpa = (midtermX + finalX) /2;
		return gpa;
	}

	
	
}
