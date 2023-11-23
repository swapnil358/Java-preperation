package JAVA.Programs.DataStructurePrgm;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int[] mergedArray = mergeArrays(arr1, arr2);
		printArray(mergedArray);
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] mergedArray = new int[len1 + len2];
			int i = 0,
				j = 0,
				k = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
// Add any remaining elements from arr1 (if any)
		while (i < len1) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
// Add any remaining elements from arr2 (if any)
		while (j < len2) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}

		return mergedArray;
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}