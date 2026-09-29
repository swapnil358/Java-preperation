package JAVA.Programs.DataStructurePrgm;

// Program to merge two sorted arrays into one sorted array.
//
// Approach:
// 1. Both input arrays must already be sorted.
// 2. Use two pointers:
//       i -> points to arr1
//       j -> points to arr2
// 3. Compare arr1[i] and arr2[j].
// 4. Add the smaller element to mergedArray.
// 5. Move the pointer of the array from which
//    the element was selected.
// 6. Continue until one array is completely traversed.
// 7. Copy the remaining elements from the other array.
//
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
//
// where:
// n = length of arr1
// m = length of arr2

public class MergeSortedArrays {

    public static void main(String[] args) {

        // Both arrays are already sorted.
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        // Call mergeArrays() to merge both arrays.
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged sorted array.
        printArray(mergedArray);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
    /*
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
    */
        // Store the lengths of both arrays.
        int len1 = arr1.length;
        int len2 = arr2.length;

        // Create a new array large enough to store
        // all elements from both arrays.
        int[] mergedArray = new int[len1 + len2];

        // i -> pointer for arr1
        // j -> pointer for arr2
        // k -> pointer for mergedArray
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        // while both arrays still have elements.
        while (i < len1 && j < len2) {

            // If current element of arr1 is smaller,
            // add it to mergedArray.
            if (arr1[i] < arr2[j]) {

                mergedArray[k] = arr1[i];

                // Move arr1 pointer forward.
                i++;

            } else {

                // Otherwise, add the current element
                // from arr2.
                mergedArray[k] = arr2[j];

                // Move arr2 pointer forward.
                j++;
            }

            // Move mergedArray pointer forward
            // after inserting an element.
            k++;
        }

        // If arr1 still has elements remaining,
        // copy all of them to mergedArray.
        //
        // Why can we directly copy them?
        // Because arr1 is already sorted, and all elements
        // already inserted are smaller than these remaining elements.
        while (i < len1) {

            mergedArray[k] = arr1[i];

            i++;
            k++;
        }

        // If arr2 still has elements remaining,
        // copy all of them to mergedArray.
        while (j < len2) {

            mergedArray[k] = arr2[j];

            j++;
            k++;
        }

        // Return the final merged sorted array.
        return mergedArray;
    }

    // Method to print the array.
    public static void printArray(int[] arr) {

        for (int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }
}