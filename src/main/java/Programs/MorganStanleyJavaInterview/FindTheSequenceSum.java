package Programs.MorganStanleyJavaInterview;

//Please read the problem statement below
/**
 * Problem Statement:
 *
 * You are given three integers, i, j, and k. The goal is to calculate the sequence sum as described
 * in the problem statement.
 *
 * The sequence sum is defined as follows:
 *
 * Start with the value i.
 * Increment the value by 1 and add it to the sum.
 * Continue incrementing the value by 1 and adding it to the sum until it reaches j.
 * Once it reaches j, decrement the value by 1 and add it to the sum.
 * Continue decrementing the value by 1 and adding it to the sum until it reaches k.
 * In other words, the sequence sum involves summing a sequence of numbers starting from i, incrementing by 1 until j, and then decrementing by 1 until k.
 */

public class FindTheSequenceSum {
    public static void main(String[] args) {
        int i = 5;
        int j = 9;
        int k = 6;
        long result = getSequenceSum(i, j, k);
        System.out.println("Sequence Sum: " + result);
    }

    public static long getSequenceSum(int i, int j, int k) {
        long sum = 0;

        // Sum values from i to j
            for (int x = i; x <= j; x++) {
            sum = sum + x;
        }

        // Sum values from j-1 to k (decrementing)
        for (int x = j - 1; x >= k; x--) {
            sum = sum + x;
        }

        return sum;
    }
}


/**
 * Problem Statement:
 *
 * You are given three integers, i, j, and k. The goal is to calculate the sequence sum as described in the problem statement.
 *
 * The sequence sum is defined as follows:
 *
 * Start with the value i.
 * Increment the value by 1 and add it to the sum.
 * Continue incrementing the value by 1 and adding it to the sum until it reaches j.
 * Once it reaches j, decrement the value by 1 and add it to the sum.
 * Continue decrementing the value by 1 and adding it to the sum until it reaches k.
 * In other words, the sequence sum involves summing a sequence of numbers starting from i, incrementing by 1 until j, and then decrementing by 1 until k.
 *
 * Example:
 *
 * Let's consider an example with the provided values:
 *
 * i = 5
 * j = 9
 * k = 6
 * The calculation for the sequence sum would be as follows:
 *
 * Start with i = 5.
 * Increment by 1 and add to the sum: 5 + 6.
 * Increment by 1 and add to the sum: 5 + 6 + 7.
 * Increment by 1 and add to the sum: 5 + 6 + 7 + 8.
 * Increment by 1 and add to the sum: 5 + 6 + 7 + 8 + 9.
 * Decrement by 1 and add to the sum: 5 + 6 + 7 + 8 + 9 + 8.
 * Decrement by 1 and add to the sum: 5 + 6 + 7 + 8 + 9 + 8 + 7.
 * Decrement by 1 and add to the sum: 5 + 6 + 7 + 8 + 9 + 8 + 7 + 6.
 * So, the sequence sum for i = 5, j = 9, and k = 6 is 5 + 6 + 7 + 8 + 9 + 8 + 7 + 6, which equals 56.
 *
 * The goal is to implement a function getSequenceSum that takes i, j, and k as inputs and returns the calculated sequence sum.
 */
