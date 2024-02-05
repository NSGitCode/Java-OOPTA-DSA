/**
 *    Example excerpted from TutorialsPoint.com
 *    https://www.tutorialspoint.com/Callable-and-Future-in-Java
 *    
 *    (Minor changes by Prof W) 
 *    This will be starting point for demo/lab to investigate
 */

/*     
 * Lab13_BNicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with the help form some tutors.
 * while the rest were all of my own.
 * 
 * Purpose: Showing how callable works
 * 
 * @author (Nicholas Sin)
 * @version (04/20/2023) 
 */
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestThread {
	
	private static CountDownLatch cL = new CountDownLatch(4);
	

   public static void main(final String[] arguments) throws InterruptedException, ExecutionException {

     //ExecutorService executor = Executors.newSingleThreadExecutor();
     //ExecutorService executor = Executors.newFixedThreadPool(1);  //sbw
       ExecutorService executor = Executors.newCachedThreadPool();
       

      System.out.println("Factorial Service called for 20!");
      Future<Long> result20 = executor.submit(new FactorialService(20));
      
      System.out.println("Factorial Service called for 19!");
      Future<Long> result19 = executor.submit(new FactorialService(19));
      
      System.out.println("Factorial Service called for 18!");
      Future<Long> result18 = executor.submit(new FactorialService(18));
      
      System.out.println("Factorial Service called for 10!");
      Future<Long> result10 = executor.submit(new FactorialService(10));
      
     try {
    	 
      cL.await();
      
      Long factorial20 = result20.get();
      System.out.println("20! = " + factorial20);
      
      Long factorial19 = result19.get();
      System.out.println("19! = " + factorial19);
      
      Long factorial18 = result18.get();
      System.out.println("18! = " + factorial18);
      
      Long factorial10 = result10.get();
      System.out.println("10! = " + factorial10);
      
      executor.shutdown();
     }
     catch(Exception e)
     {
    	 System.out.println();
     }
      
      
      
   }  

   static class FactorialService implements Callable<Long> {
      private int number;
      private long startTime = System.currentTimeMillis();
      private long endTime;
      
      public FactorialService(int number) {
         this.number = number;
      }

      @Override
      public Long call() throws Exception {
         return factorial();
         
      }

      private Long factorial() throws InterruptedException {
    	  
         long result = 1;
         int fcNum = number;
         
         while (number != 0) {              
            result = number * result;
            number--;
            Thread.sleep(200);           
         }
         endTime = System.currentTimeMillis();
         System.out.println(fcNum + "! time = " + (endTime - startTime));
         cL.countDown();
         return result;      
      }
   }
}