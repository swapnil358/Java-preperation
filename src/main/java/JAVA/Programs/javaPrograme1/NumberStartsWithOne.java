package JAVA.Programs.javaPrograme1;

//https://youtu.be/rs3lYZbOLbA

import java.util.ArrayList;
import java.util.List;

public class NumberStartsWithOne {

    public static int getFirstDigit(int num) {

        while (num >= 10) { // 123 / 10 = 12
            num = num / 10;
        }

        return num;
    }

    public static List<Integer> getNumberList(int arr[]) {

        List<Integer> numbers = new ArrayList<Integer>();

        for (int num : arr) {

            int n = getFirstDigit(num);

            if (n == 1) {
                numbers.add(num);
            }
        }

        return numbers;
    }

    public static void main(String[] args) {

        // Find out number starting with 1
        int arr[] = {
                1, 23, 123, 45, 67, 167, 10, 11,
                12, 901, 91, 19, 1111, 111, 111111
        };

        System.out.println(getNumberList(arr));
    }
}
