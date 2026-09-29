package JAVA.Programs.DataStructurePrgm;

// Program to find the maximum product of any two elements in an array.
//
// Approach:
//
// The maximum product can come from two possibilities:
//
// 1. Two largest positive numbers
//       highest * secondHighest
//
// 2. Two smallest negative numbers
//       lowest * secondLowest
//
// Example:
// {-10, -20, 2, 5}
//
// Two largest numbers:
// 5 and 2
// Product = 5 * 2 = 10
//
// Two smallest numbers:
// -20 and -10
// Product = -20 * -10 = 200
//
// Therefore, maximum product = 200.
//
// We find the highest, second highest, lowest and second lowest
// values in a SINGLE traversal of the array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxProductInArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 7, 3, 2, 89};

        // Initialize highest and secondHighest
        // with the smallest possible integer value.
        //
        // This allows the program to work even if
        // the array contains negative numbers.
        int highest = arr[0];
        int secondHighest = arr[0];

        // Initialize lowest and secondLowest
        // with the largest possible integer value.
        int lowest = arr[0];
        int secondLowest = arr[0];

        // Traverse the array only once.
        for (int num : arr) {

            // -----------------------------------------
            // Find highest and second highest
            // -----------------------------------------

            // If current number is greater than highest,
            // current number becomes the new highest.
            if (num > highest) {

                // Old highest becomes second highest.
                secondHighest = highest;

                // Current number becomes highest.
                highest = num;

            } else if (num > secondHighest) {

                // If current number is not the highest
                // but is greater than secondHighest,
                // update secondHighest.
                secondHighest = num;
            }

            // -----------------------------------------
            // Find lowest and second lowest
            // -----------------------------------------

            // If current number is smaller than lowest,
            // current number becomes the new lowest.
            if (num < lowest) {

                // Old lowest becomes second lowest.
                secondLowest = lowest;

                // Current number becomes lowest.
                lowest = num;

            } else if (num < secondLowest) {

                // If current number is not the lowest
                // but is smaller than secondLowest,
                // update secondLowest.
                secondLowest = num;
            }
        }

        // Print the two largest and two smallest values.
        System.out.println("Highest: " + highest);
        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Second Lowest: " + secondLowest);

        // Product of two largest numbers.
        int product1 = highest * secondHighest;

        // Product of two smallest numbers.
        //
        // Important:
        // Negative × Negative = Positive.
        int product2 = lowest * secondLowest;

        // The maximum product can be either:
        // highest * secondHighest
        // OR
        // lowest * secondLowest
        int maxProduct = Math.max(product1, product2);

        System.out.println("Maximum product is: " + maxProduct);
    }
}