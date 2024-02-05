public class Student {
	String lastName;
	String firstName;
    int studentID; 
    int birthDate;
    
    public Student(String lastName, String firstName, int studentID, int birthDate)
    {
    	super();
    	this.lastName = lastName;
    	this.firstName = firstName;
    	this.studentID = studentID;
    	this.birthDate = birthDate;
    }

    
	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", studentID=" + studentID
				+ ", birthDate=" + birthDate + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	
    
}
