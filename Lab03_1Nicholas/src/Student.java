
public class Student implements Comparable<Student>{
	
	private String name;
	private int id;
	private int birthdate;
	
	public Student(String name, int id, int birthdate)
	{
		super();
		this.name = name;
		this.id = id; 
		this.birthdate = birthdate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", birthdate=" + birthdate + "]";
	}
	
	@Override
	public int compareTo(Student s)
	{
		int compare = this.id-s.getId();
		
		  return compare;
		 
	}
	
	
}
