package comSno2.harsha.inheritance;

import comSno3.harsha.accessmodifiers.student;

public class SubClass extends student{
	public static void main (String[] args) {
		new SubClass().test();
	}
	public void test() {
		System.out.println(rollNo);
		printRollNumber();
		
		
	}
}
