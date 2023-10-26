package JAVA.Programs.javaPrograme1;

public class JavaChaining {

	/*
	 * Java Constructor chaining is the process of calling one constructor from
	 * another constructor with respect to current object.
	 */

	/*
	 * Interview Question: Can we create static constructor? 
	 * No, we cannot define a
	 * static constructor in Java, If we are trying to define a constructor with the
	 * static keyword a compile-time error will occur
	 */

	// No argument constructor
	public JavaChaining() {
		System.out.println("Default Constructor");
	}

	// one argument constructor
	public JavaChaining(int x) {
		this();
		System.out.println(x + " This is constructor 1");
	}

	// two argument constructor
	public JavaChaining(int x, int y) {
		this(50);
		System.out.println(x + y + " This is constructor 2");
	}

	public static void main(String[] args) {

		JavaChaining J = new JavaChaining(10, 20);

	}

}
