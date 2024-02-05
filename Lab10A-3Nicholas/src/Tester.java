import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Tester {

	public static void main(String[] args) {
		
		try (PrintWriter pw = new PrintWriter("TestData.txt"))
		{
			pw.println("Hello Nicholas");
			
			for(int n = 30; n < 40; n++)
			{
				pw.println(n);
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			
		}
		try (BufferedReader rd = new BufferedReader(new FileReader("TestData.txt")))
		{
			System.out.println(rd.readLine());
			int num;
			while( (num = rd.read() ) != -1)
				{
					System.out.print( (char)num);
				}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
