package Programs.DataStructurePrgm;

public class SecondLargestArray {
	public static void main(String[] args) {
		

		// https://youtu.be/R57n33zxgIw?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

		int[] a = { 9, 3, 5, 2, 8, 1 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("After swapping: " + a[i]);
		}
		System.out.println("SecondLargestArray: "+a[1]);
	}

	
	}




