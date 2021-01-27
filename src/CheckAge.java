
public class CheckAge {

	public static void main(String[] args) {
		checkAge1(20);
	}



	  // Create a checkAge() method with an integer parameter called age
	 public static void checkAge1(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!"); 
	      
	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!"); 
	    }
	    
	  }
}	  

	  
