package comSno3.harsha.accessmodifiers;

class DefaultWithInClassStudent {
 int rollNO =101;
	
 	DefaultWithInClassStudent() {
		rollNO = 102;
	}
	
	void printRollNumber() {
		System.out.println(rollNO);
	}
	
	public static void main(String[] args) {
		DefaultWithInClassStudent s = new DefaultWithInClassStudent() ;
		
	}
	
	void abc() {
		printRollNumber();
	}
	
	/*
	 * default
	 * *******
	 * 
	 * No need to use default keyword by default it's default
	 * 
	 * not assigning any Accessible modifier by default it's a default.
	 * class be a     default
	 * variable be a     "
	 * constructor be a  "
	 * method be a		 "
	 * 
	 * providing no modifier (Default)
	 * 1.Within as class we can access
	 * 2.Within the package same package different class will access
	 * 3.Outside the package we can't able to access
	 * 4.Subclass within the same package you can access
	 * 5.Subclass with different package you can't access
	 * 6.Outside the project we can't able to access
	 * 
	 */
}
