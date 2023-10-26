package JAVA.OOPS.AbstractionConcept;

//Hiding the Implementation logic --is called Abstraction.


//refer https://javaconceptoftheday.com/interface-vs-abstract-class-after-java-8/
//Abstract class vs Interface -->  https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/

/*@Main difference is methods of a Java interface are implicitly abstract and cannot have implementations. 
 * 
 * A Java abstract class can have instance methods that implements a default behavior.
 * Variables declared in a Java interface is by default final. 
 * An  abstract class may contain non-final variables.
 * Members of a Java interface are public by default. 
 * A Java abstract class can have the usual flavors of class members like private, protected, etc..
 * Java interface should be implemented using keyword 'implements'
 * A Java abstract class should be extended using keyword �extends�.
 * An interface can extend another Java interface only, 
 * an abstract class can extend another Java class and implement multiple Java interfaces.
 * A Java class can implement multiple interfaces but it can extend only one abstract class.
 * Interface is absolutely abstract and cannot be instantiated; 
 * A Java abstract class also cannot be instantiated, but can be invoked if a main() method exists.
In comparison with java abstract classes, java interfaces are slow as it requires extra indirection.
*/

public abstract class Bank extends BMW {         //Main Difference Abstract class can extend only one Abstract class or COncrete class

	private int a; // Abstract class can have private field

	protected int b; // Abstract class can have protected field

	public int c; // Abstract class can have public field

	static int d; // Abstract class can have static field
	
	int f; // Abstract class can have non-static and non-final field

	final int e = 10; // Abstract class can have final field

	

	// Partial abstraction. - Loan() is abstract in nature, but credit and debit is
	// common in all child classes
	// Hiding the Implementation logic --is called Abstraction.
	// abstract class can have abstract method as well as Non abstract mehod
	// Can not create the Object of Abstract class
	// Can not create the Object of Interface class

	/*
	 * Another real life example of Abstraction is ATM Machine; All are performing
	 * operations on the ATM machine like cash withdrawal, money transfer, retrieve
	 * mini-statement�etc. but we can't know internal details about ATM. Note: Data
	 * abstraction can be used to provide security for the data from the
	 * unauthorized methods.
	 * 
	 */
	public abstract void loan(); // Abstract method--no method body
	

	// Non abstract method
	public void credit() {
		System.out.println("Bank----credit");
	}

	public void debit() {
		System.out.println("Bank------debit");
	}
}
