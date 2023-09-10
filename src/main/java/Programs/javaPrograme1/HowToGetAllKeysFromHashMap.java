package Programs.javaPrograme1;

import java.util.HashMap;
import java.util.Set;

public class HowToGetAllKeysFromHashMap {

	// Iterview question - In HashMap, I want to generate only key  how to generate
	// those??? � Using entrySet, KeySet

	public void keySet() {
		// Creating an empty HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// add key-value pair to hashmap
		// Mapping int values to string keys
		
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");

		//System.out.println("Initial Mappings are: " + hm);

		//System.out.println("my: "+hm.keySet());  ----- Only Key will be generated
		
		Set<String> keys = hm.keySet();
		
		
		
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("Using keySet" + hm);

	}

	public void EntrySet() {
		// Creating an empty HashMap
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

		// Mapping int values to string keys
		hash_map.put("Geeks", 10);
		hash_map.put("4", 15);
		hash_map.put("Geeks", 20);
		hash_map.put("Welcomes", 25);
		hash_map.put("You", 30);

		// Displaying the HashMap
		//System.out.println("Initial Mappings are: " + hash_map);

		// Using entrySet() to get the set view
		System.out.println("Using EntrySet: " + hash_map.entrySet());

	}

	public static void main(String[] args) {

		HowToGetAllKeysFromHashMap h = new HowToGetAllKeysFromHashMap();
		h.keySet();
		h.EntrySet();

	}

}
