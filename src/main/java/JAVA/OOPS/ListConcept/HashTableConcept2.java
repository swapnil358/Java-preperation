package JAVA.OOPS.ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept2 {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();

		h1.put(10, "test");
		h1.put(20, "Hello");
		h1.put(30, "world");

		// Create clone copy/Shallow copy of h1

		Hashtable h2 = new Hashtable();

		h2 =  (Hashtable) h1.clone();

		System.out.println("Value from h1" + h1);
		System.out.println("Value from h2" + h2);

		h2.clear();

		System.out.println("Value from h1" + h1);
		System.out.println("Value from h2" + h2);
		
		
		/*
		 * using contains
		 * 
		 */
		
		Hashtable ht = new Hashtable();
		
		ht.put("A", "Naveen");
		ht.put("B", "Selenium");
		ht.put("C", "Test");
		
		if(ht.contains("Selenium")) 
			System.out.println("it is Present");
		
	
		//How to print all values from hashtable using  -- Enumneration	-- elements()
		
		Enumeration e = ht.elements();
		System.out.println("-----Print values using 'Enumeration' from ht---");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		//Get all the values from hashtable using ---entrySet()----set of hashtable values:
		
		System.out.println("-----Print values using 'entrySet()' from ht---");
		
		Set s = ht.entrySet();
		System.out.println("Get all the values from hashtable using ---entrySet()"+s);
		
		

		Hashtable ht1 = new Hashtable();
		
		ht.put("A", "Naveen");
		ht.put("B", "Selenium");
		ht.put("C", "Test");
		
		//check both the hahstables are equal or not
		
		if(ht.equals(ht1))
			System.out.println("Both are equal");
		
		//to get the value from Key
		
		System.out.println(ht.get("A"));
		
		//to get the hascode of hashtable object
		
		System.out.println("hash code value of ht1 is:  " + ht.hashCode());

	}

}
