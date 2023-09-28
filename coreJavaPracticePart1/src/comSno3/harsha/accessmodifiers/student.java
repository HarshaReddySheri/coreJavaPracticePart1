package comSno3.harsha.accessmodifiers;

public class student { //class
	protected int rollNo = 101; //variable
	
	protected student() { //constructor      //class name = constructor name
		rollNo = 102;
	}
	
	protected void printRollNumber() { //method
		System.out.println(rollNo);
	}
	
	public static void main(String [] args) {
		student s = new student();
	}
	
	public void abc() { //with in class
		printRollNumber();
		
		
	}

}
