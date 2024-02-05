
public class Instructor implements RoleDisplayable {
	private String name;

	public Instructor(String name)
	{
		super();
		this.name = name;
	}
	
	@Override
	public void displayNameAndRole()
	{
		System.out.println(getName() + ", Instructor");
	}
	
	@Override
	public String getName() {
		return name;
	}


}
