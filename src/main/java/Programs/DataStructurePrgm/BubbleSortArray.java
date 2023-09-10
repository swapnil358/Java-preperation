package Programs.DataStructurePrgm;

public class BubbleSortArray {
	
	

	public static void main(String[] args) {

		int[] a = { 36, 12, 5, 8, 9 };

		int temp;
		for (int i = 0; i < a.length; i++) { // this for loop for iteration

			for (int j = 0; j < a.length - 1; j++) { // this for loop for swap the number

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.println("sorted list " + a[i]);
		}

	}
}
