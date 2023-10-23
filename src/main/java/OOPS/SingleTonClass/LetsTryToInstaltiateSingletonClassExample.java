package OOPS.SingleTonClass;

public class LetsTryToInstaltiateSingletonClassExample {

	// public class SingleTonTest extends singleTonClass{ --SingleTOn class can not
	// extend

	public static void main(String args[]) {
		
		// instantiating Singleton class first time
		SingletonClassExample first = SingletonClassExample.getInstanceOfSingletonClassExample();

		// instantiating Singleton class second time
		SingletonClassExample second = SingletonClassExample.getInstanceOfSingletonClassExample();
		
		SingletonClassExample third = SingletonClassExample.getInstanceOfSingletonClassExample();
		
	
		
		
	}

}
