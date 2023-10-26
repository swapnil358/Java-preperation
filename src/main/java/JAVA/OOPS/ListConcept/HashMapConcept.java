package JAVA.OOPS.ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		

		
		//HashMap is class which implements Map interface
		//extends AstractMap
		//It contains unique elements
		//It stores the value in the form of Key,Value pair
		//it may have one null key and mutiple null value
		//It doesn't maintain order -- no order
		
		
		/*
		 * Hashmap vs Hashtable 
		 *       1. HashMap is non synchronized. It is not-thread safe
		 * and can�t be shared between many threads without proper synchronization code
		 * whereas Hashtable is synchronized. It is thread-safe and can be shared with
		 * many threads. 
		 *       2. HashMap allows one null key and multiple null values whereas
		 * Hashtable doesn�t allow any null key or value. 
		 * 		 3. HashMap is generally preferred over HashTable if thread synchronization is not needed
		 * 
		 * 		Why HashTable doesn�t allow null and HashMap does? 
		 * To successfully store and
		 * retrieve objects from a HashTable, the objects used as keys must implement
		 * the hashCode method and the equals method. Since null is not an object, it
		 * can�t implement these methods. HashMap is an advanced version and improvement
		 * on the Hashtable. HashMap was created later.
		 */
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "selenium");
		h.put(2, "SQL");
		h.put(3, "QTP");
		h.put(null, null);
		h.put(null, null);
		
		
		System.out.println(h.get(2));
		System.out.println(h.get(4));
		
		for(Entry m : h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue() );
		}
		System.out.println("Before remove"+""+h);
		
		h.remove(3);
		System.out.println("After remove"+""+h);
		
		
	}

}
