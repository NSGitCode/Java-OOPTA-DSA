
public class Customer {
	String name;
	String streetAddress;
	String city;
	
	boolean hasDaily; 
	boolean hasSunday; 
	double amountDue;
	
	public Customer(String name, String streetAddress, String city, boolean hasDaily, boolean hasSunday, double amountDue)
	{
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		
		this.hasDaily = hasDaily; 
		this.hasSunday = hasSunday; 
		this.amountDue = amountDue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isHasDaily() {
		return hasDaily;
	}

	public void setHasDaily(boolean hasDaily) {
		this.hasDaily = hasDaily;
	}

	public boolean isHasSunday() {
		return hasSunday;
	}

	public void setHasSunday(boolean hasSunday) {
		this.hasSunday = hasSunday;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", streetAddress=" + streetAddress + ", city=" + city + ", hasDaily="
				+ hasDaily + ", hasSunday=" + hasSunday + ", amountDue=" + amountDue + "]";
	}
	
	
	
}
