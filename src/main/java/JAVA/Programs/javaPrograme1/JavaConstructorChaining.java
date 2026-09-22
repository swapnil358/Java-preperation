package JAVA.Programs.javaPrograme1;

public class JavaConstructorChaining {

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
	public JavaConstructorChaining() {
		System.out.println("Default Constructor");
	}

	// one argument constructor
	public JavaConstructorChaining(int x) {
		this();
		System.out.println(x + " This is constructor 1");
	}

	// two argument constructor
	public JavaConstructorChaining(int x, int y) {
		this(50);
		System.out.println(x + y + " This is constructor 2");
	}

	public static void main(String[] args) {

		JavaConstructorChaining J = new JavaConstructorChaining(10, 20);

	}

}
