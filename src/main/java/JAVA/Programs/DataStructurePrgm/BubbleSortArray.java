package JAVA.Programs.DataStructurePrgm;

// Write a Java program for Bubble Sort.
//
// Bubble Sort works by comparing adjacent elements.
// If the left element is greater than the right element,
// we swap them.
//
// Approach:
// 1. Compare adjacent elements.
// 2. If a[j] > a[j + 1], swap them.
// 3. Continue comparing until the end of the array.
// 4. After the first pass, the largest element reaches the end.
// 5. Repeat the same process for the remaining elements.
//
// Example:
// 36 12 5 8 9
//
// First pass:
// 36 > 12  -> swap
// 12 36 5 8 9
//
// 36 > 5   -> swap
// 12 5 36 8 9
//
// 36 > 8   -> swap
// 12 5 8 36 9
//
// 36 > 9   -> swap
// 12 5 8 9 36
//
// Now 36 is in its correct position at the end.
//
// Time Complexity:
// Best Case    -> O(n) with optimization using a swap flag
// Average Case -> O(n²)
// Worst Case   -> O(n²)
//
// Space Complexity:
// O(1) because we only use a temporary variable for swapping.

public class BubbleSortArray {

    public static void main(String[] args) {

        // Unsorted array
        int[] a = {36, 12, 5, 8, 9};

        int temp;

        // Outer loop represents the number of passes.
        // After every pass, the largest unsorted element
        // moves to the end of the array.
        for (int i = 0; i < a.length - 1; i++) {

            // Inner loop compares adjacent elements.
            // We use a.length - 1 because we compare:
            // a[j] with a[j + 1]
            for (int j = 0; j < a.length - 1; j++) {

                // If the left element is greater than
                // the right element, they are in the wrong order.
                if (a[j] > a[j + 1]) {

                    // Store the first element temporarily
                    temp = a[j];

                    // Move the smaller element to the left
                    a[j] = a[j + 1];

                    // Move the larger element to the right
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {

            System.out.println("Sorted list: " + a[i]);
        }
    }
}