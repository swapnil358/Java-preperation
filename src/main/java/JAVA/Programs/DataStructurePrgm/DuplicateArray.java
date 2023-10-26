package JAVA.Programs.DataStructurePrgm;

import java.util.HashSet;

public class DuplicateArray {

	// Find the duplicate value

	// https://youtu.be/Y1xfMU4xyDE?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

	public static void main(String[] args) {
		
		//This is Brute Force Algorith
		

		int[] a = { 3, 7, 8, 9, 3, 5, 6, 5, 77, 34, 8 };

		System.out.println("Method one");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if ((a[i] == a[j]) && (i != j)) {

					System.out.print(a[j]+",");

				}

			}

		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Method two");

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			if (set.add(a[i]) == false) {
				System.out.print(a[i]+",");
			}
		}

	}

}
