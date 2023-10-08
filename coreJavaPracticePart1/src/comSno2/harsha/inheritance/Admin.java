package comSno2.harsha.inheritance;

public class Admin extends Developer{

	//Adding or deleting the products/application
	
	public void manage() {
	/*
	 * Super KeyWord
	 * *************
	 *   Parent properties access we use super key 
	 *   
	 *   Why?
	 *   By extends we accessing & Creating object By default we get all the method
	 *   But Not like that...
	 *   First what to access read & write
	 *   then I want manage
	 *   
	 *   No need to call the read & write
	 *   When you place methods 
	 *   read();
	 *   wrote():
	 *   inside manage Admin class...
	 *   
	 *   same Scenario
	 *   
	 *   Only for Admin I need to provide separate read access
	 *   p v read(){
	 *   s.o.pln("Admin read code")
	 *   }
	 *   
	 *   If i call read method in side  manage();
	 *   
	 *   before creating the Admin read code
	 *   I redirected to guest read()
	 *   
	 *   After creating the Admin read code
	 *   If I call read method in side manage
	 *   It redirected to "Admin read code"
	 *   ******************************************************************************************
	 *   EX: local variable
	 *    
	 *   Variable is created inside method & within same variable name created in side a class level
	 *   
	 *   Whenever we use the variable first 
	 *   It use local 
	 *   Scope will in same method if not their, then it go for checking to class level
	 *   
	 *   *********
	 *   SIMILARLY
	 *   *********
	 *   
	 *   EX: local method
	 *   
	 *   If you want to access the method or property
	 *   --> It checked first is it present in same class
	 *   	 then it will access from it.
	 *   --> If not found in present in same class
	 *   --> It will get it from parent class
	 *   
	 *   --> If you don't want read method from parent class
	 *   
	 *   If you want read method from the parent class then use Super
	 *   
	 *   Super.read();
	 *   --> I am request to give the read method from the parent class
	 *   *******************************************************************************************
	 *   
	 */
		//3rd method
		
		// After creating the Admin read code
		// If I call read method in side manage
		// It redirected to "Admin read code"
		super.read();
		//2nd method-->2times
		Write();
		//4th method
		System.out.println("3 Manage code");
		
	}
	//1st method 
	//before creating the Admin read code
	//I redirected to guest read()
	public void read() {   
		System.out.println("Admin read code");
	}
	


}
