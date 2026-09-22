package JAVA.Programs.javaPrograme1;

//To print smallest and largest array from given array

import java.util.Arrays;

public class LargestAndSmallestOfArray {

	public static void main(String[] args) {
		usingLoop();
		usingStream();
		usingForEach();
	}

	private static void usingLoop() {
		System.out.println("***** Using for loop  *****");

		int[] a = new int[]{1, 20, 15, 98, 50, 90};

		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Smallest Array is : " + min);
		System.out.println("Largest Array is : " + max);
	}

	//Using Java 8 Streams

	/*
	* Simple explanation
	*
	* 					Arrays.stream(a)
       							↓
   						[1,20,15,98,50,90]
       							↓
      						   min()
      						    ↓
      						    1



      				    Arrays.stream(a)
       						    ↓
   						[1,20,15,98,50,90]
       							↓
      						  max()
       						    ↓
       						    98
Interview follow-up

Q: Why getAsInt()?

min() and max() on an IntStream return OptionalInt, because the stream could be empty.

	* */
	private static void usingStream() {

		System.out.println("***** Using Java 8 Streams *****");

		int[] a = {1, 20, 15, 98, 50, 90};

		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();

		System.out.println("Smallest Array is : " + min);
		System.out.println("Largest Array is  : " + max);
	}

	private static void usingForEach() {
		System.out.println("**** Using a simple for-each loop *****");
		int[] a = {1, 20, 15, 98, 50, 90};

		int min = a[0];
		int max = a[0];

		for (int value : a) {

			if (value < min) {
				min = value;
			}

			if (value > max) {
				max = value;
			}
		}

		System.out.println("Smallest Array is : " + min);
		System.out.println("Largest Array is  : " + max);
	}
}
