import java.util.*;

public class Wallet {
	private ArrayList<Bill> billsList;
	
	public Wallet()
	{
		billsList = new ArrayList<Bill>();
	}
	
	public void addBill(int value, String series) {
		billsList.add(new Bill(value, series));
	}
	
	int totValue()
	{
		int total = 0;
		for(Bill bill:billsList) {
			total = total + bill.getValue();
		}
		return total;
	}
	
	public void displayAll() {
		for(Bill bill:billsList) {
			System.out.println(bill);
		}
	}
	
	public int countBySeries(String sn)
	{
		int count = 0;
		for(Bill bill:billsList)
		{
			if(bill.getSeries().contains(sn))
			{
				count++;
			}
		}
		return count;
	}
}
