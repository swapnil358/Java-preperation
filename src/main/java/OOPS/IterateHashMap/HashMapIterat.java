package OOPS.IterateHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterat {

	public static void main(String[] args) {

		//Hash map can have only one null key and multiple null values
		//Hash map does not accept duplicate, it means we can add duplicate, if we print hashMap it will not show duplicate, only lastest added key will be shown
		
		//How many ways to iterate map
		 /* 1. EntrySet 
		  * 2. Java 8 using foreach method 
		  * 3. Iterator
		 */	
		
		
		Map map1 = new java.util.HashMap<>();
		map1.put("apple", 1);
		map1.put("banana", 2);
		map1.put("organge", 3);
		map1.put("apple", 1);
		//map1.put("test", null);

		map1.put(null, null);
		map1.put(null, null);
		
		Method1(map1);
		
		//Method2(map1);

	//	Method3(map1);
		
	}

	//using lambda java8
	private static void Method3(Map<String, Integer> map) {
		map.forEach((k, v) -> System.out.println(("using lambda java8 : "+k + ":" + v)));
		
	}

	
	
	
	
	// EntrySet and for Loop
	private static void Method2(Map<String, Integer> map) {
	
		System.out.println("------EntrySet and for Loop----------");
		
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	

	// Iterator and EntrySet
	private static void Method1(Map<String,Integer> map) {
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> next = it.next();
			String key = next.getKey();
			Integer value = next.getValue();
			
			System.out.println(key + ":" + value);

 		}

	}

}
