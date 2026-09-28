package JAVA.Programs.DataStructurePrgm;

// Write a Java program to insert an element at a specific position into an array.

// Insertion means:
// 1. Find the required position.
// 2. Shift existing elements one position to the right.
// 3. Insert the new element at that position.

public class AInsertElementInArray {

    public static void main(String[] args) {

        // Original array
        int[] a = {10, 20, 30, 40, 50, 70, 80, 90};

        // Position where we want to insert the element
        // Position starts from 1, not 0.
        int position = 5;

        // Element that we want to insert
        int element = 100;

        // Shift elements one position to the right.
        // We start from the last index and move towards the
        // position where the new element needs to be inserted.
        for (int i = a.length - 1; i >= position; i--) {

            a[i] = a[i - 1];
        }

        // Insert the new element.
        // position = 5 means array index = 4.
        a[position - 1] = element;

        // Print the final array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}