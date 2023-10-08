package comSno6.harsha.Polymorphism;

public class MethodOverLoading {
	/*
	 * OverLoading can be allowed by 3 Ways 
	 * 
	 * 1.Number of parameter 
	 * 2.data type of  parameter
	 * 3.Order of parameter
	 * 
	 */
	
	//1.Number of parameter 
	public class NoOfParameter{
		//if i pass 2 parameter
		public void add(int a, int b){

		}

		//if i pass 3 parameter
		public void add(int a, int b, int c) {

		}
	}

	//2.data type of  parameter
	public class TypeOfParameter{
		//if i pass 2 parameter
		public void add(int a, int b){


		}

		//if i pass 3 parameter
		public void add(double a, double b) {


		}
	}
	//3.Order of parameter
	public class OrderOfParameter{
		//if i pass 2 parameter
		public void add(int a, String b){


		}

		//if i pass 3 parameter
		public void add(String a, int b) {


		}
	}

}


//Example for overLoading method
//where we see more this overloading method
/*
 * sys.out.p(boolean b);
 * sys.out.p(char c);
 * sys.out.p(double d);
 * sys.out.p(float f);
 * """"""""""""""""""
 * """"""""""""""""""
 * """"""""""""""""""
 * """"""""""""""""""
 * 
 * OR
 * sys.out.pln();
 * sys.out.pf();
 */
