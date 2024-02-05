

public class CSCourse {
	private final String Department; //required
	private final String CourseNum; //required
	private final String CourseName; //required
	private final int credits; //optional
	private final boolean required; //optional
	
	private CSCourse(CSBuilder builder) {
		this.Department = builder.Department;
		this.CourseNum = builder.CourseNum;
		this.CourseName = builder.CourseName;
		this.credits = builder.credits;
		this.required = builder.required;
		
		}
	
	public String getDepartment() {
		return Department;
		}
	
	public String getCourseNum() {
		return CourseNum;
		}
	
	public String getCourseName() {
		return CourseName;
		}
	
	@Override
	public String toString() {
		return "CSBuilder [" + Department + ", " + CourseNum + ", " + CourseName + "]";
	}
	
	public static class CSBuilder
	{
		private final String Department;
		private final String CourseNum;
		private final String CourseName;
		private int credits;
		private boolean required;
		
		public CSBuilder(String Department, String CourseNum, String CourseName)
		{
			this.Department = Department;
			this.CourseNum = CourseNum;
			this.CourseName = CourseName;
		}
		
		public CSBuilder credits(int credits)
		{
			this.credits = credits;
			return this;
		}
		
		public CSBuilder required(boolean required)
		{
			this.required = required;
			return this;
		}
		
		public CSCourse build()
		{
			return new CSCourse(this);
		}
		
		
	}
	
}
