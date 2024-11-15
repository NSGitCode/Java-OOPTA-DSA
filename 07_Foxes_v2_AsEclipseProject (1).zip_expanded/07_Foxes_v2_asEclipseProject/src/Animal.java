import java.util.List;
import java.util.Random;

/**
 * A class representing shared characteristics of animals.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2016.02.29 (2)
 */
public abstract class Animal
{
    // Whether the animal is alive or not.
    private boolean alive;
    // The animal's field.
    private Field field;
    // The animal's position in the field.
    private Location location;
    private int age;
    private Random rand = Randomizer.getRandom();
    
    /**
     * Create a new animal at location in field.
     * 
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Animal(Field field, Location location)
    {
        alive = true;
        this.field = field;
        setLocation(location);
    }
    
    /**
     * Make this animal act - that is: make it do
     * whatever it wants/needs to do.
     * @param newAnimals A list to receive newly born animals.
     */
    abstract public void act(List<Animal> newAnimals);

    protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	/**
     * Check whether the animal is alive or not.
     * @return true if the animal is still alive.
     */
    protected boolean isAlive()
    {
        return alive;
    }

    /**
     * Indicate that the animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }

    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    protected Location getLocation()
    {
        return location;
    }
    
    /**
     * Place the animal at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    /**
     * Return the animal's field.
     * @return The animal's field.
     */
    protected Field getField()
    {
        return field;
    }
    
    /**
    * An animal can breed if it has reached the breeding age.
    * @return true if the animal can breed
    */
    protected boolean canBreed() { 
    	return age >= getBreedingAge(); 
    }
    /**
    * Return the breeding age of this animal .
    * @return The breeding age of this animal.
    */
    abstract protected int getBreedingAge();
    
    protected void incrementAge()
    {
    	//super.setAge(super.getAge()+1);
        age++;
        if(age > getMaxAge()) {
            setDead();
        }
    }
    
    abstract protected int getMaxAge();
    
    //abstract int breed();
    
    abstract protected double getBreed();
   
    abstract protected int getMaxLitterSize();
    
    protected int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= getBreed()) {
            births = rand.nextInt(getMaxLitterSize()) + 1;
        }
        return births;
    }
}
