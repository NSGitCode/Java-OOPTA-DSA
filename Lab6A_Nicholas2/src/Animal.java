
public class Animal {

	private boolean alive;
    
    private Location location;
   
    private Field field;
    
    public Animal(Field field, Location location)
    {
        // initialise instance variables
        //age = 0;
        alive = true;
        this.field = field;
        setLocation(location); //sbw in Rabbit, it uses setLocation()
    }
    
    public boolean isAlive()
    {
        return alive;
    }
    
    public boolean isActive()
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
