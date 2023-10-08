package comSno4.harsha.encapsulation;

public class DataAccessdirectlythroughObjectTeacher {
	public static void main(String[] args) {
		StudentWithOutMethods s = new StudentWithOutMethods(101);
		s.isAttended = true; //i have performed an operation
		System.out.println("Teacher assigned attendence to student"); // I have performed extra operation 
		
	}
}
