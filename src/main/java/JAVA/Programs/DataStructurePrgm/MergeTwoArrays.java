package JAVA.Programs.DataStructurePrgm;

import java.util.Arrays;

// Problem Statement:
// Write a Java program to merge two arrays into a single array
// and arrange all the elements in ascending order.
//
// Example:
//
// Array 1 = {10, 20, 100}
// Array 2 = {70, 80, 90}
//
// After merging:
// {10, 20, 100, 70, 80, 90}
//
// After sorting:
// {10, 20, 70, 80, 90, 100}
//
// Approach:
// 1. Create a new array whose size is the sum of both arrays.
// 2. Copy all elements of the first array into the new array.
// 3. Copy all elements of the second array after the elements
//    of the first array.
// 4. Use Arrays.sort() to sort the combined array.
// 5. Print the sorted array.
//
// Time Complexity:
// O((n + m) log(n + m))
//
// Space Complexity:
// O(n + m)

public class MergeTwoArrays {

    // https://youtu.be/JeQtPl3nxu4

    public static void main(String[] args) {

        // First array
        int[] a = {10, 20, 100};

        // Second array
        int[] b = {70, 80, 90};

        // Create a new array to store elements
        // from both arrays.
        //
        // a.length = 3
        // b.length = 3
        //
        // Therefore:
        // c.length = 3 + 3 = 6
        int[] c = new int[a.length + b.length];


        for (int i = 0; i < a.length; i++) {

            c[i] = a[i];
        }

        // Copy elements of array 'b' into array 'c'.
        //
        // We start from a.length because the first
        // three positions are already occupied by array 'a'.
        //
        // b[0] -> c[3]
        // b[1] -> c[4]
        // b[2] -> c[5]
        for (int i = 0; i < b.length; i++) {

            c[a.length + i] = b[i];
        }

        // At this point, c contains:
        //
        // {10, 20, 100, 70, 80, 90}
        //
        // The elements are merged but not completely sorted.
        // Arrays.sort() sorts the complete array in ascending order.
        Arrays.sort(c);

        // Print the final sorted array.
        for (int j : c) {

            System.out.print(j + " ");
        }
    }
}