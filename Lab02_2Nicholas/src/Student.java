
public class Student implements RoleDisplayable {
	private String name;
	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	@Override
	public void displayNameAndRole()
	{
		System.out.println(getName() + ", Student");
	}
	
	@Override
	public String getName()
	{
		return name;
	}


	
}
