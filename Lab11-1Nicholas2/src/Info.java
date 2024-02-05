
public class Info {
	private String name;
	private int age;
	
	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}
}
