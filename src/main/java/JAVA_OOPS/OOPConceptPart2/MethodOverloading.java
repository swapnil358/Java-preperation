package JAVA_OOPS.OOPConceptPart2;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		
	
	}

	/*
	 * A person at the same time can have different characteristic. Like a man at
	 * the same time is a father, a husband, an employee. So the same person posses
	 * different behaviour in different situations.
	 * 
	 */
	// We can overload main method s but different arguments and parameter

	public static void main(int p) {

	}

	public static void main(int r, int s) {

	}

	// Method Overloading ---> When the method name is a same with different
	// parameter or input argument with different argument within the same class.
	// We can not create method inside the method.
	// duplicate method---> i.e same method name with same number of input
	// parameter or argument are not allowed

	public void sum() { // 0 parameter
		System.out.println("Print sum method");
	}

	public void sum(double d) { // 1 parameter with different data type.
		System.out.println("Print sum method");
	}

	public void sum(int i) { // 1 Parameter
		System.out.println("Print sum method with one parameter");
		System.out.println(i);
	}

	public void sum(int k, int l) { // 2 Parameter
		System.out.println("Print sum method with two parameter");
		System.out.println(k + l);
	}

}
