package JAVA_Programs.javaPrograme1;

import java.util.Arrays;

public class CheckSortedArray {

	/*
	 * To check whether the Array is sorted or not
	 * 
	 * method 1--- using for loop method 2--- using arrays.sort()
	 */

	public static boolean Sorted() {

		int arr[] = { 1, 2, 3, 4, 5 };

		// Using For loop

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println("Sorted() :"+Sorted());

		// Using inbuilt function

		int arr1[] = { 5, 8, 9, 4 };

		Arrays.sort(arr1); // Here array got sorted as 4,5,8,9

		for (int i = 0; i <= arr1.length - 1; i++) {
			// Using For loop to diplay array

			System.out.println("for loop Array  " + arr1[i]);
			
		}
		
		

	}
}
