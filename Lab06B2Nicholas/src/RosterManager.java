import java.util.HashMap;

public class RosterManager {

	private HashMap<Integer, Student> roster;

	public RosterManager() {
		roster = new HashMap<>();
		
	}
	
	public void addEntry(int id, String name, int birthDate) //adapt if you have other fields
	{
		roster.put(id, new Student(name, id, birthDate));
	}
	
	public Student retrieve(int id)
	{
		return roster.get(id);
		
	}
	
	public String searchByName(String n) //outputs id’s of all matches
	{
		for(Integer id : roster.keySet())
		{
			Student student = roster.get(id); // roster.get(id) gets a Student object.
      	  
      	  String name = student.getName();
      	  
          System.out.println(roster.get(id));
          if(name.equals(n)) //Compare name to the name we are searching for.
          {
        	  return name;
          }
         
		}
		return "Name not Found"; // If name is not in the hashmap, return "Name not Found".

	}
	
}
