package Programs.DataStructurePrgm;

import java.util.ArrayList;

public class CommonArrays {

	// How to Find Common Elements in Three Sorted Arrays in Java

	// https://youtu.be/rUPdTNmKa6A?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

	public static void main(String[] args) {

		int[] a1 = { 2, 4, 8 };
		int[] a2 = { 2, 3, 4, 8, 10, 16 };
		int[] a3 = { 2, 8, 14, 40 };

		int x = 0;
		int y = 0;
		int z = 0;

		ArrayList<Integer> arr = new ArrayList<>();

		while (x < a1.length && y < a2.length && z < a3.length) {

			if (a1[x] == a2[y] && a2[y] == a3[z]) {

				arr.add(a1[x]);
				x++;
				y++;
				z++;

			} else if (a1[x] < a2[y]) {
				x++;

			} else if (a2[y] < a3[z]) {
				y++;
			} else {
				z++;
			}

		}
		System.out.println("common elements are: "+arr);

	}

}
