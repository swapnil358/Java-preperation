package Programs.DataStructurePrgm;

//How to Delete An Element From An Array In Java 

//https://youtu.be/pMe5cEc105w?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

public class DeleteElementFromArray {

	public static void main(String[] args) {

		int[] a = { 10, 40, 30, 80, 60, 20 };

		int del_ele = 30;

		int count = 0; // if element no found

		for (int i = 0; i < a.length; i++) {
			if (del_ele == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}

				count = count + 1;
				break;
			}

		}
		if (count == 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element deleted successfully");
			for (int k = 0; k < a.length - 1; k++) {
				System.out.println(a[k]);
			}
		}

	}

}
