package JAVA.OOPS.SingleTonClass;


public class SingletonClassExample {

	/*
	 * How does Singleton pattern help in Selenium WebDriver?
	 *
	 * 1. Managing a shared WebDriver instance.
	 * 2. Managing database connectivity.
	 * 3. Loading external files like properties and Excel once.
	 * 4. Managing a logger.
	 *
	 * Use Singleton when a class should have only one shared instance.
	 */

	/*
	 * Steps to create Singleton using Lazy Initialization:
	 *
	 * Step 1: Declare a private static variable.
	 * Step 2: Make the constructor private.
	 * Step 3: Create a public static getInstance() method.
	 * Step 3.a: If instance is null, create an object.
	 * Step 3.b: Otherwise, return the existing object.
	 */

	// Step 1: Instance is initially null
	private static SingletonClassExample instanceOfSingletonClassExample = null;

	// Step 2: Private constructor restricts external object creation
	private SingletonClassExample() {
		System.out.println("Object created.");
	}

	// Step 3: Return the single instance
	public static SingletonClassExample getInstanceOfSingletonClassExample() {

		if (instanceOfSingletonClassExample == null) {
			instanceOfSingletonClassExample = new SingletonClassExample();
		} else {
			return instanceOfSingletonClassExample;
		}

		return instanceOfSingletonClassExample;
	}

	public static void main(String[] args) {

		SingletonClassExample obj1 =
				SingletonClassExample.getInstanceOfSingletonClassExample();

		SingletonClassExample obj2 =
				SingletonClassExample.getInstanceOfSingletonClassExample();

		System.out.println(obj1 == obj2);
	}
}
