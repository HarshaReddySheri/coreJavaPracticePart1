package comSno6.harsha.Polymorphism;

public class MethodOverride extends Lenovo{
	@Override
	public void Copy() {
		System.out.println("Lenovo updated copy code");
	}
	
	public static void main(String[] args) {
		Lenovo mo = new MethodOverride();
		mo.Copy();
	}
}
