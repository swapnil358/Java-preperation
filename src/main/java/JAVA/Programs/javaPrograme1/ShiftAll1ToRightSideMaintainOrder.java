package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class ShiftAll1ToRightSideMaintainOrder {

    //Easy
    public static void main(String[] args) {
       // method1();
        System.out.println(Arrays.toString(moveOnes()));
    }

    private static void method1() {
        int[] array = {1, 1, 1, 4, 18, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};

        int arrSize = array.length;
        int[] result = new int[arrSize];
        int nonOneIndex = 0;
        // Move non-1 elements to the left side of the result array
        for (int i = 0; i < arrSize; i++) {
            if (array[i] != 1) {
                result[nonOneIndex] = array[i];
                nonOneIndex++;
            }
        }
        // Fill the right side of the result array with 1's
        for (int i = nonOneIndex; i < arrSize; i++) {
            result[i] = 1;
        }
        // Print the modified array
        System.out.println(Arrays.toString(result));
    }


    public static int[] moveOnes() {
        int[] arr = {1, 1, 1, 4, 18, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};
        int[] res = new int[arr.length];
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                res[nonZero] = arr[i];
                nonZero++;
            }
        }
        return res;
    }
}
