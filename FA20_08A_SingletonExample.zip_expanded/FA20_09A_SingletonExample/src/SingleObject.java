
/**
 *  Singleton testing for OOPDA
 *  Started with code from TutorialsPoint
 *  
 * @author profW
 *
 */
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance()  //sbw -- needs to be a static method!  Why?
   {
     	  return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}