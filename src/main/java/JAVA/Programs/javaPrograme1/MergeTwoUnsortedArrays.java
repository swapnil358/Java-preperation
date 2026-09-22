package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrays {

    public static void main(String[] args) {

        System.out.println("===== Method 1: Sort Arrays First + While Loop =====");
        usingWhileLoop();

        System.out.println("\n===== Method 2: Merge First + Bubble Sort =====");
        usingBubbleSortFirst();

        System.out.println("\n===== Method 3: Java 8 Stream =====");
        usingStream();
    }


    /*
     * Approach 1:
     *
     * 1. Sort both arrays.
     * 2. Create a third array.
     * 3. Use two pointers to merge both sorted arrays.
     *
     * Input:
     *
     * a = [30, 10, 20]
     * b = [90, 70, 80]
     *
     * After sorting:
     *
     * a = [10, 20, 30]
     * b = [70, 80, 90]
     *
     * Final:
     *
     * c = [10, 20, 30, 70, 80, 90]
     */
    private static void usingWhileLoop() {

        int[] a = {30, 10, 20};
        int[] b = {90, 70, 80};

        // Step 1: Sort both arrays.
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 2: Create array large enough for both arrays.
        int[] c = new int[a.length + b.length];

        int i = 0;  // Pointer for array a
        int j = 0;  // Pointer for array b
        int k = 0;  // Pointer for array c

        // Step 3: Compare elements from both arrays.
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {

                c[k] = a[i];

                i++;
                k++;

            } else {

                c[k] = b[j];

                j++;
                k++;
            }
        }

        // Copy remaining elements from array a.
        while (i < a.length) {

            c[k] = a[i];

            i++;
            k++;
        }

        // Copy remaining elements from array b.
        while (j < b.length) {

            c[k] = b[j];

            j++;
            k++;
        }

        System.out.println(Arrays.toString(c));
    }


    /*
     * Approach 2:
     *
     * 1. Merge both unsorted arrays.
     * 2. Sort the merged array using Bubble Sort.
     *
     * Input:
     *
     * a = [30, 10, 20]
     * b = [90, 70, 80]
     *
     * After merge:
     *
     * [30, 10, 20, 90, 70, 80]
     *
     * After Bubble Sort:
     *
     * [10, 20, 30, 70, 80, 90]
     */
    private static void usingBubbleSortFirst() {

        int[] a = {30, 10, 20};
        int[] b = {90, 70, 80};

        // Create array with enough space for both arrays.
        int[] c = new int[a.length + b.length];

        // Copy array a into c.
        for (int i = 0; i < a.length; i++) {

            c[i] = a[i];
        }

        // Copy array b into c.
        for (int i = 0; i < b.length; i++) {

            c[a.length + i] = b[i];
        }

        /*
         * Bubble Sort
         *
         * Compare neighbouring elements.
         * If left element is greater than right element,
         * swap them.
         */
        for (int i = 0; i < c.length - 1; i++) {

            for (int j = 0; j < c.length - 1 - i; j++) {

                if (c[j] > c[j + 1]) {

                    int temp = c[j];

                    c[j] = c[j + 1];

                    c[j + 1] = temp;
                }
            }
        }

        // Print complete array on one line.
        System.out.println(Arrays.toString(c));
    }


    /*
     * Approach 3:
     *
     * Java 8 Stream
     *
     * Arrays.stream(a)
     *        +
     * Arrays.stream(b)
     *        ↓
     * IntStream.concat()
     *        ↓
     * sorted()
     *        ↓
     * toArray()
     *
     * Final:
     *
     * [10, 20, 30, 70, 80, 90]
     */
    private static void usingStream() {

        int[] a = {30, 10, 20};
        int[] b = {90, 70, 80};

        int[] result = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();

        System.out.println(Arrays.toString(result));
    }
}