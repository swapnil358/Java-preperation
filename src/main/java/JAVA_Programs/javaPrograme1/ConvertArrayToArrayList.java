package JAVA_Programs.javaPrograme1;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String[] arr = { "swapnil", "triveni", "pallavi", "minal" }; // arr---> is an array

		List<String> list = Arrays.asList(arr);

		System.out.println(list);

	}
}
