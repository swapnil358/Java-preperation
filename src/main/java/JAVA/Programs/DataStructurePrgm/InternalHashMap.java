package JAVA.Programs.DataStructurePrgm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class InternalHashMap {
	public static void main(String[] args) {
		HashMapConcepts();
		HashTableConcepts();
	}

	private static void HashMapConcepts() {
		Map<String, Integer> map = new HashMap<>();
		map.put("aman",1);
		map.put("naman", 2);
		map.put("aman",3);
		map.put(null,null);
		map.put("",null);
		System.out.println(map);
	}

	private static void HashTableConcepts() {
		Map<String, Integer> map = new Hashtable<>();
		map.put("aman",1);
		map.put("naman", 2);
		map.put("aman",3);
		map.put(null,4); //we can not pass null key or value in HashTable
		//nullPointerException
		map.put("null",null);
		map.put("chaman",5);
		System.out.println(map);
	}
}
