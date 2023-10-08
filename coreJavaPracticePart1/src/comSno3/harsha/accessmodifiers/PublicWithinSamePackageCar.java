package comSno3.harsha.accessmodifiers;

public class PublicWithinSamePackageCar {
	
	public static void main(String[] args) {
		PublicWithinSameClassStudent s = new PublicWithinSameClassStudent();
		//Method & variable outSide the class within the same package we are accessing 
		System.out.println(s.rollNo); //outside the class    
		s.printRollNumber();
		
	}
}
