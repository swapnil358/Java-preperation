
package JAVA.Programs.javaPrograme1;

//https://youtu.be/opJ0Vhok01U

/*
			⭐ Easy rule for interviews
			Situation	Condition
			Access entire array	i < arr.length ✅
			Count 1 to 10	i <= 10 ✅
			Range 5 to 10	i <= 10 ✅
			Access array using last index	i <= arr.length - 1 ✅
			Access array	i <= arr.length ❌

			Remember:

			length → number of elements
			index  → starts at 0
			last index → length - 1

			So:

			a.length       // 9
			a[a.length]    // a[9] ❌
			a[a.length - 1] // a[8] ✅

			This distinction between value/range and array index is the important concept.

 */

public class MissingNumber {

	public static void main(String[] args) {

		method1();
		method2(); //important

	}

	private static void method1() {
		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		// System.out.println(a.length);

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i]; // 49

		}

		System.out.println("sum1 : " + sum1);

		int sum2 = 0;
		for (int j = 1; j <= 10; j++) {
			sum2 = sum2 + j;		//55
		}

		System.out.println("sum2 : " + sum2);

		System.out.println("missing number is" + " " + (sum2 - sum1));
	}

	public static void method2(){
		int[] arr = {1, 2, 3, 5, 6}; // Input array

		int n = arr.length + 1; // Total numbers should be 6

		// Calculate expected sum of numbers from 1 to n
		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0; // Variable to store sum of array elements

		// Calculate actual sum of elements in the array
		for (int num : arr) {
			actualSum = actualSum + num;
		}

		// Difference between expected and actual sum is the missing number
		int missingNumber = expectedSum - actualSum;

		System.out.println("Missing number: " + missingNumber); // Print result
	}

}
