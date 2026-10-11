package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class RightRotateAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};  //after first iteration latest array-  //[5, 1, 2, 3, 4]
        int n = 2;

        for (int j = 0; j < n; j++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];  //[1, 1, 2, 3, 4]
            }

            arr[0] = last;   //[5, 1, 2, 3, 4]
        }

        System.out.println(Arrays.toString(arr));
    }
}