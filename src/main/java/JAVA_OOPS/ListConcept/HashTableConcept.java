package JAVA_OOPS.ListConcept;

import java.util.Hashtable;

public class HashTableConcept {

	// It is similar to HashMap but it is synchronised --Thread safe ---
//  is a synchronized collection class. It is part of the Java Collections Framework and is designed to be thread-safe, 
	//meaning it can be safely used in multi-threaded environments without explicit synchronization.
	// Stores the value on the basis of Key-Value
	// Key---->Object----HashCode----->Value

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();

		h1.put(10, "test");
		h1.put(20, "Hello");
		h1.put(30, "world");
		
		

		h1.put("A", 100);
		h1.put("B", 200);
		h1.put("C", 300);

		h1.put(1, 1.0);
		h1.put(1, 2.5);

		System.out.println(h1.size());

		System.out.println(h1.get(20));
		System.out.println(h1.get("C"));
		
		
	

		System.out.println(h1.size());
		
		
		

		Hashtable<Integer, Integer> h3 = new Hashtable<Integer, Integer>();

		// h1.put("hello", "world"); ------> it will not accept integer
		h3.put(10, 20);

		Hashtable<String, Integer> h4 = new Hashtable<String, Integer>();

		h4.put("Hello", 2);
		// h2.put(2, 2); -------> it will not accept interger

	}

}
