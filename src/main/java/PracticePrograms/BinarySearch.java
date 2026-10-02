package PracticePrograms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 4, 8, 9, 12, 22, 34, 54, 78, 89};
        int search = 22;

        int li = 0;
        int hi = a.length-1;
        int mi = li+hi/2;

        while(li<=hi) {

            if (a[mi] == search) {
                System.out.println("Element found at " + mi + "position");
                break;
            } else if (a[mi] < search) {
                li = mi + 1;

            }
            hi = mi - 1;

            mi = li + hi / 2;
        }


        System.out.println(Arrays.toString(a));
    }
}
