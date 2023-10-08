package comSno3.harsha.accessmodifiers;
/*
 * Protected is similar to default privilege
 * 
 * It's have a extra privilege
 * -->Inside SubClass any package you can access
 * 
 * Class never be a protected.
 * 
 * protected member  within the same package we can access 
 * 
 * Outside class within the same package 
 * 
 *  similar to default(scope)
 *  -->package private within package Inside different classes we can access 
 *  -->Outside package
 *  		-->it's not a SubClass
 *  			we can't access
 *  		-->It's a SubClass
 *  			we can access
 *  			Here inheritance concept is applied
 *  
 *  
 */
public class ProtectedWithInClassStudent {

	protected int rollNo = 101; //variable

	protected ProtectedWithInClassStudent() { //constructor      //class name = constructor name
		rollNo = 102;
	}

	protected void printRollNumber() { //method
		System.out.println(rollNo);
	}



	protected void abc() { //with in class
		
		//Method & variable with in the class  we are accessing 
		printRollNumber();
		System.out.println(rollNo);

	}
	/*Main Difference B/W default & protected
	 * 
	 *Default (package private)
	 **************************
	 *Same package inheritance concept that subclass only applicable
	 *
	 *Protected (package private with extra future)
	 **********************************************
	 *Different or any package inheritance concept that SubClass is applicable
	 * 
	 *
	 *
	 *
	 *
	 * 
	 */
}
