package JAVA.Programs.javaPrograme2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringArrayToList {

	// 5) How to convert Array to ArrayList and ArrayList to Array?

	
	// Array to ArrayList: Arrays.asList()
	
	public static void main(String[] args) {

		String[] strArr = { "abc", "xyz", "java" };

		List<String> str = Arrays.asList(strArr);
		System.out.println("Array to ArrayList :"+str);

	
		
		ArrayToArrayList();
	}
	
	

	// ArrayList to Array: toArray()
	
	public static void ArrayToArrayList() {

		ArrayList<String> ls = new ArrayList<>();

		ls.add("java");
		ls.add("python");
		ls.add("c#");

		Object[] s = ls.toArray();
		for(Object obj : s) {
			System.out.println(obj);
		}
		//System.out.println("ArrayList to Array :"+s.toString());
		
	}

}
