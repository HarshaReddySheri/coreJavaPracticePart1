package comSno2.harsha.inheritance;

import comSno3.harsha.accessmodifiers.PublicWithinSameClassStudent;

public class PublicSubClass extends PublicWithinSameClassStudent{
	public static void main (String[] args) {
		new PublicSubClass().test();
	}
	
	//Method & variable are accessing in Subclasses (using extends)
	public void test() {
		System.out.println(rollNo);
		printRollNumber();
		
		
	}
}
