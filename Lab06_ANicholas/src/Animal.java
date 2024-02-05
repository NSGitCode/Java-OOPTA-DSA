
public class Animal {

	private boolean alive;
    
    private Location location;
   
    private Field field;
    
    public Animal(Field field, Location location)
    {
    	//this.age = age;
    	//this.alive = alive;
    	this.field = field;
    	this.location = location;
    	
    }
    
    public boolean isAlive()
    {
        return alive;
    }
    
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    public Location getLocation()
    {
        return location;
    }
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    public Field getField()
    {
    	return field;
    }
}
