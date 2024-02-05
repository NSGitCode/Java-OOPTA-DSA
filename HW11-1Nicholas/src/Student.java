
public class Student {
	 private String name;
	 private String major;
	 private int numericIndicator;
	
	
	 public Student(String name, String major) {
	       super();
	       this.name = name;
	       this.major = major;
	   }
	 
	 public String getName() {
	       return name;
	   }

	   public void setName(String name) {
	       this.name = name;
	   }

	   public String getMajor() {
	       return major;
	   }
	  
	   public void setMajor(String major) {
	       this.major = major;
	   }

	   public int getNumericIndicator() {
	       return numericIndicator;
	   }

	   public void setNumericIndicator(int numericIndicator) {
	       this.numericIndicator = numericIndicator;
	   }
	  

	   @Override
	   public String toString() {
	       return "Student [major=" + major + ", field=" + name + ", numericIndicator=" + numericIndicator + "]";
	   }
	
	
	
	
	
}
