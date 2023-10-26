package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class TwoSum_LeetCode {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] i = twoSum(arr, target);
        System.out.println(Arrays.toString(i));
    }

    public static int[] twoSum(int[] arr, int target) {
//        int[] arr = {2, 7, 11, 15};
//        int target = 9;


        if (arr == null) {
            return new int[]{0, 0};
        }

        if (target == 0) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return arr;
    }

}
