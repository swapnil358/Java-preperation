package JAVA.Programs.DataStructurePrgm;

import java.util.Arrays;

public class ShiftAll1ToRightSideMaintainOrder {

    /**
     * Easy
     * Stapes:
     * 1. Firstly move non 1's element in result array
     * 2. Fill the right side of the result array with 1's [remember - iteration start from the end of result array]
     * @param args
     */
    public static void main(String[] args) {
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
}
