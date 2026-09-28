package JAVA.Programs.DataStructurePrgm;

// How to Delete An Element From An Array In Java

public class ADeleteElementFromArray {

	public static void main(String[] args) {

		int[] a = {10, 40, 30, 80, 60, 20};

		int del_ele = 30;

		boolean found = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == del_ele) {

				// Shift elements to the left
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}

				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element deleted successfully");

			// Print array excluding the last duplicate element
			for (int i = 0; i < a.length - 1; i++) {
				System.out.println(a[i]);
			}
		}
	}
}