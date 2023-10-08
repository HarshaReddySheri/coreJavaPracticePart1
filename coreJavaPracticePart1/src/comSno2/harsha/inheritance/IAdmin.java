package comSno2.harsha.inheritance;
/*
 * IGuest created Interface -> only read
 * IDeveloper created Interface -> Imagine only write
 * IAdmin created Interface -> read -> wrote -> manage
 * 
 * IAdmin
 * ******
 * To get read & write from the Guest, Developer.
 * Use Multiple Inheritance
 * 
 * 
 *  
 */
public interface IAdmin extends IGuest, IDeveloper {
	public void manage();
}
