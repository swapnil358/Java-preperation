package JAVA.Programs.javaPrograme1;

import java.util.*;

/*
 * How to print occurence of String array
 */

public class OccurentInStringArray {

	public static void main(String[] args) {
	//	method1();
		method2();
	}

	/*
	 * I have created method 2- its so easy and simple
	 */

	private static void method2() {
		String[] array = { "name1", "name1", "name2", "name2", "name2" };

		HashMap<String, Integer> counter = new HashMap<>();

		for (String arr : array) {
			if (counter.containsKey(arr)) {
				counter.put(arr, counter.get(arr) + 1);
			} else {
				counter.put(arr, 1);
			}
		}

		//System.out.println(counter);

		Set<String> setKey = counter.keySet();
		for (String s : setKey) {
			if (counter.get(s) > 1) {
				System.out.println(s + ":" + counter.get(s));
			}
		}

	}

	private static void method1() {
		String[] array = { "name1", "name1", "name2", "name2", "name2" };

		List<String> asList = Arrays.asList(array);
		System.out.println(asList);

		Set<String> mySet = new HashSet<String>(asList);
		System.out.println("Using Hashset: " + mySet);

		for (String s : mySet) {
			System.out.println(s + " " + Collections.frequency(asList, s));

		}
	}

}
