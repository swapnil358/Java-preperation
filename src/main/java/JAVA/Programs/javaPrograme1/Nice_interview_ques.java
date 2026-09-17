package JAVA.Programs.javaPrograme1;

//	This is an array multiplication / product of every pair program.

public class Nice_interview_ques {

//2. Write a program as follows:	
	// Input - a[1,2,3]
	//Output - b[1*2, 2*3, 1*3]

	public static void main(String[] args) {

		method1();
		method2();  //using two pointers
	}

	private static void method1() {
		int[] a = { 1, 2, 3 };

		int b[] = new int[a.length];


		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				b[i] = a[i] * a[0];
			} else {
				b[i] = a[i] * a[i + 1];
			}

		}
		for (int j : b) {
			System.out.println(j);
		}


//		//print b array
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
	}

	public static void method2(){
		int[] a = {1, 2, 3}; // Input array

		// Number of pairs = n * (n - 1) / 2
		//int size = a.length * (a.length - 1) / 2;

		int[] b = new int[a.length]; // Output array

		int k = 0; // Index for output array

		// Pick the first element
		for (int i = 0; i < a.length; i++) {

			// Pick the second element after i
			for (int j = i + 1; j < a.length; j++) {

				// Multiply the pair and store in output array
				b[k] = a[i] * a[j];

				k++; // Move to next output position
			}
		}

		// Print output array
		for (int value : b) {
			System.out.print(value + " ");
		}
	}
}
