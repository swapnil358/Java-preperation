
package JAVA.OOPS.SingleTonClass;

public class SingletonClassExample {
	
	/*
	How does Singleton pattern help in Selenium Webdriver?
	Keep track of same driver instance throughout execution.
	DBMS connectivity.
	Loading external files like properties, excel etc once rather than loading again and again.
	Logger.
	
	So wherever you feel, you should have single instance of any class, 
	you should use singleton design pattern.  
	
	For example: If database connection is already established, you should not create new connection.
	
	
	 */

	
	/*	
	Basic steps to create Singleton class using Lazy Initialization

	Step 1: Just declare private static variable of the same class (beware don�t instantiate)
	Step 2: Provide private constructor to restrict instatiation from outside class
	Step 3: Provide public static getInstance() method  and check
	Step 3.a: If INSTANCE variable is null, then only instantiate
	Step 3.b: Otherwise, return already instantiated INSTANCE variable
	Note: These are steps for lazy initialization
	
	*/
	
	// declaring an instance of class SingletonClassExample which is null initially means not initialized.
	
	    // declaring an instance of class SingletonClassExample which is null initially means not initialized. 
	    private static SingletonClassExample instanceOfSingletonClassExample = null;
	 
	 
	    // Declaring constructor as private to restrict object creation outside of class
	    private SingletonClassExample()
	    {
	        System.out.println("Object created.");
	    }
	 
	    // static method to create instance of class SingletonClassExample
	    public static SingletonClassExample getInstanceOfSingletonClassExample()
	    {
	        if (instanceOfSingletonClassExample == null)
	        	instanceOfSingletonClassExample = new SingletonClassExample();
	 
	       return instanceOfSingletonClassExample;
	    }
	    
	    
	}


	
		
		




