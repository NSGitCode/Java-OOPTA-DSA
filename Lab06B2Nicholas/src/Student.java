
public class Student {
	private String name;
	private int id;
	private int birthDate; //YYYYMMDD
	
	public Student(String name, int id, int birthDate) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", birthDate=" + birthDate + "]";
	}
	
	
	
}
