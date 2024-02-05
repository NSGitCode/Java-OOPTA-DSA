

public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private int pages;

    /**
     * Constructor for objects of class Book
     */
    public Book(String t, int p)
    {
        title=t;
        pages=p;
    }

    
    public String  toString()
    {
         
        return title + "..."+ pages;
    }
}
