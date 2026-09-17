package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.HashMap;

//https://www.youtube.com/watch?v=o42jBlO09Vg
public class TwoSum {

    // Method 1: Using HashMap - https://www.youtube.com/watch?v=o42jBlO09Vg
    public static int[] method1(int nums[], int target) {

        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int extra = target - nums[i]; // 9 - 5 = 4

            // Check if the required number already exists in HashMap
            if (numMap.containsKey(extra)) {

                // Return indexes of the two numbers
                return new int[]{numMap.get(extra), i};
            }

            // Store number and its index for future lookup
            numMap.put(nums[i], i);
        }

        // No pair found
        return null;
    }


    // Method 2: Using Nested Loops
    public static int[] method2(int nums[], int target) {

        // Pick the first number
        for (int i = 0; i < nums.length; i++) {

            // Pick the second number
            for (int j = i + 1; j < nums.length; j++) {

                // Check if two numbers add up to target
                if (nums[i] + nums[j] == target) {

                    // Return indexes of the two numbers
                    return new int[]{i, j};
                }
            }
        }

        // No pair found
        return null;
    }


    // Main method
    public static void main(String[] args) {

        int nums[] = {5, 4, 11, 8, 1};
        int target = 9;

        // Calling Method 1 - HashMap
        int result1[] = method1(nums, target);

        System.out.println("Method 1 - HashMap: "
                + Arrays.toString(result1));


        // Calling Method 2 - Nested Loops
        int result2[] = method2(nums, target);

        System.out.println("Method 2 - Nested Loops: "
                + Arrays.toString(result2));
    }
}