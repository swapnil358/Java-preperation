package JAVA.Programs.javaPrograme2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {

	// Find how many duplicate values in Array List?

	public static void main(String[] args) {

		int[] arr = { 10, 50, 66, 50, 79, 10, 10 };

		Set<Integer> dup = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (dup.add(arr[i]) == false) {

				System.out.println("Found duplicate element in array" + arr[i]);
			}

			
		}
		method2();
		method3();

	}

	public static void method2() {
		int[] arr = { 10, 50, 66, 50, 79, 10, 10 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

				}

			}

		}

	}
	
	public static void method3() {
		int[] arr1 = { 10, 50, 66, 50, 79, 10, 10 };
		
		for(int i=0; i<arr1.length-1; i++) {
			if(arr1[i]==arr1[i+1]) {
				System.out.println("my method:"+arr1[i+1]);
			}
		}
	
	}

}
