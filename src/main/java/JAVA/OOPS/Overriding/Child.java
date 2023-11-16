package JAVA.OOPS.Overriding;

public class Child extends Parent {
	
	@Override
	public void p() {

		System.out.println("child method");
	}
	
	
	@Override
	public void p1() {

		System.out.println("child method 2");
	}

	public void p3() {

		System.out.println("child me non ovverride method");
	}

}
