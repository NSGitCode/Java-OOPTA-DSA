/*
 * Example of User Builder Design Pattern
 */
public class User {
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	//omitted getters for lastName, age, phone, address
	public static class UserBuilder { //inner class
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		//inner class constructor takes the required fields
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
