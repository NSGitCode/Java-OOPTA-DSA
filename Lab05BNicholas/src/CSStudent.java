
public class CSStudent extends Student{

	int labGrade;

	public CSStudent(double midtermX, double finalX, int labGrade) {
		super(midtermX,finalX);
		this.labGrade = labGrade;
	}

	@Override
	public double calculateGPA()
	{
		double gpa = 0.75 * (super.calculateGPA()) + 0.25 * labGrade;
		return gpa;
		
	}

	
}
