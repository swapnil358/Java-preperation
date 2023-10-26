package JAVA.Programs.javaPrograme1;

import java.util.HashMap;
import java.util.Set;

public class CharOccurenceAndCountDuplicate {

	public static void CharDupCount(String inputString) {

		HashMap<Character, Integer> Counter = new HashMap<Character, Integer>();

		char[] str = inputString.toCharArray();

		for (char c : str) {
			if (Counter.containsKey(c)) {
				Counter.put(c, Counter.get(c)+1);
			} else {
				Counter.put(c, 1);
			}
		}
		System.out.println(Counter);

		
		  Set<Character> SetString = Counter.keySet();
		  
		  System.out.println("Dup char: "+" " + inputString);
		  
		  for (Character s : SetString) {
		  
		  if (Counter.get(s) > 1) {
		  
		  System.out.println(s + " : " + Counter.get(s));
		  
		  }
		  
		  }
		 
	}

	public static void main(String[] args) {

		CharDupCount("maharajam");
	}

}
