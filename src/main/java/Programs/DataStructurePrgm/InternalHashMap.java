package Programs.DataStructurePrgm;

import java.util.HashMap;
import java.util.Map;

public class InternalHashMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("aman",1);
		map.put("naman", 2);
		map.put("aman",3);
		map.put(null,null);
		map.put("",null);
		System.out.println(map);
		

	}
}
