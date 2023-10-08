package comSno1.harsha.Oops;

import comSno3.harsha.accessmodifiers.PublicWithinSameClassStudent;

public class PublicOutsideThePackage {
	public static void main(String[] args) {
		//method & variable accessing in different class & different package (Outside the package)
		PublicWithinSameClassStudent s = new PublicWithinSameClassStudent();
		System.out.println(s.rollNo);
		s.printRollNumber();
	}
}
