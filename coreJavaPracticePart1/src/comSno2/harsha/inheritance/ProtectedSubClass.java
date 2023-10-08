package comSno2.harsha.inheritance;

import comSno3.harsha.accessmodifiers.ProtectedWithInClassStudent;

public class ProtectedSubClass extends ProtectedWithInClassStudent{

	public static void main(String[] args) {
		new ProtectedSubClass().test();
	}
	
	protected void test() {
		System.out.println(rollNo);
		printRollNumber();
	}
	
	/*Difference B/W default & protected
	 * 
	 * -->default only package private
	 * 			-->Within the package you can access any where & SubClass
	 * -->protected only within package in every class
	 * 			-->Outside the package only Subclass can access
	 *  
	 *  
	 */
}
