package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestArray {

	/*
	 * Using Arrays Sort
	 */
	public static int getSecondLargestArray(int[] a1, int total) {

	
		
		Arrays.sort(a1);
		return a1[total - 2];
		
	}

	/*
	 * using collections
	 */

	public static int getSecondLargestArrayUsingCollections(Integer[] b1, int total) {

		List<Integer> list = Arrays.asList(b1);

		  Collections.sort(list);
		

		int element = list.get(total - 2);
		return element;
	}

	
	
	public static int findSecondLargest(int[] arr) {
	    int largest = arr[0]; // Initialize with smallest possible value
	    int secondLargest = arr[0]; // Initialize with smallest possible value

	    //int[] arr = { 5, 10, 3, 8, 15 };
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            secondLargest = largest;
	            largest = arr[i];
	            System.out.println("secondLargest "+secondLargest);
	            System.out.println("largest "+ largest);
	            
	        } else if (arr[i] > secondLargest && arr[i] < largest) {
	            secondLargest = arr[i];
	        }
	    }

	    return secondLargest;
	}

	
	
	public static void main(String[] args) {

		int a1[] = { 1, 2, 5, 6, 3, 2 };
		 
		getSecondLargestArray(a1, 6);
		System.out.println("Second Largest:using Arrays sort: " + getSecondLargestArray(a1, 6));

		Integer b1[] = { 44, 66, 99, 33, 22, 55 };
		getSecondLargestArrayUsingCollections(b1, 6);
		System.out.println("Second Largest:using collection: " + getSecondLargestArrayUsingCollections(b1, 6));
		
		
		
		int[] arr = { 5, 10, 3, 8, 15 };
	    int secondLargest = findSecondLargest(arr);
	    System.out.println("The second largest element is: " + secondLargest);


	}

}
