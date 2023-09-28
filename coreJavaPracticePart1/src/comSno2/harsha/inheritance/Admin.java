package comSno2.harsha.inheritance;

public class Admin extends Developer{

	//Adding or deleting the products/application
	public void manage() {
		//3rd
		super.read();
		//2nd-->2times
		Write();
		//4th
		System.out.println("3 Manage code");
		
	}
	//1st
	public void read() {
		System.out.println("Admin read code");
	}
	


}
