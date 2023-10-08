package comSno3.harsha.accessmodifiers;

public class PublicWithinSameClassStudent { //class
	public int rollNo = 101; //variable
	
	public PublicWithinSameClassStudent() { //constructor      //class name = constructor name
		rollNo = 102;
	}
	
	public void printRollNumber() { //method
		System.out.println(rollNo);
	}
	
	
	
	public void abc() { //with in class
		/*	//Here the difference
		 * Static can access nonStatic directly
		 * But non static can't access static
		 * 
		 * 	//Here no difference
		 * public in private
		 * private in public
		 * --->Only b/w class
		 * 			"	package's
		 * 			"	application's	 
		 */
		//Method & variable with in the class  we are accessing 
		printRollNumber();
		System.out.println(rollNo);
		
	}

}
