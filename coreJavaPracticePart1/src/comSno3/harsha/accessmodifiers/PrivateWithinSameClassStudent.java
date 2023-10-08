package comSno3.harsha.accessmodifiers;

public class PrivateWithinSameClassStudent {
	
	private int rollNO =101;
	
	private PrivateWithinSameClassStudent() {
		rollNO = 102;
	}
	
	private void printRollNumber() {
		System.out.println(rollNO);
	}
	
	public static void main(String[] args) {
		PrivateWithinSameClassStudent s = new PrivateWithinSameClassStudent();
		
	}
	
	public void abc() {
		printRollNumber();
	}
	
	/*
	 * Data or class member if it declared as a private within the class we can access perfectly withOut any problem
	 * 		-->Access perfectly Only within the class
	 * 			--> Weather it's constructor
	 * 			--> "		it's variable
	 * 			--> "		it's Method
	 * 
	 *  
	 * But Outside class    we can't access
	 * 		" 	   Package 	 " 	"	  "
	 * 		"	   project   "  "     "
	 * 	   Same    package   "	" 	  "
	 *  
	 */		
}
