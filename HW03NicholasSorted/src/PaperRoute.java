import java.util.ArrayList;
import java.util.Collections;

public class PaperRoute{
	
	private ArrayList<Customer> customersList;
	
	public PaperRoute()
	{
		customersList = new ArrayList<Customer>();
	}
	
	public void addCustomer(String name, String streetAddress, String city, boolean hasDaily, boolean hasSunday, double amountDue)
	{
		customersList.add(new Customer(name, streetAddress, city, hasDaily, hasSunday, amountDue));
	}
	
	
	public double totDue()
	{
		double total = 0;
		for(Customer customer:customersList) {
			total = total + customer.getAmountDue();
		}
		return total;
	}
	
	public void displayAll()
	{
		for(Customer customer:customersList) {
			System.out.println(customer.toString());
		}
	}
	
	public void listAccounts()
	{
		Collections.sort(customersList);
		for(Customer customer:customersList) {
			System.out.println(customer.toString());
		}
	}
	
//	public int countBySubscriptionType(String kind)
//	{
//		int count = 0;
//		for(Customer customer:customersList)
//		{
//			if(customer.contains(kind))
//			{
//				count++;
//			}
//		}
//		return count;
//	}
	
}
