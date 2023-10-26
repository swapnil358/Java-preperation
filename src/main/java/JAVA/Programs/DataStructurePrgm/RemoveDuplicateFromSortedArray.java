package JAVA.Programs.DataStructurePrgm;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

    // Remove Duplicate Elements from Sorted and Unsorted Array in Java

    // https://youtu.be/wW5VKfsIMNw?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

    public static void main(String[] args) {

        System.out.println("usingTempArray");
        usingTempArray();

        System.out.println("withoutUsingTempArray");
        withoutUsingTempArray();

        System.out.println("usingHashSet");
        usingHashSet();

    }

    public static void usingTempArray() {
        // method 1----> using temporary array

        int a[] = {1, 2, 2, 3, 4, 5, 5};

        int temp[] = new int[a.length];
        int j = 0;
        int lastElement = a[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = lastElement; // inserting last element

        for (int k = 0; k < a.length; k++) {
            if (temp[k] != 0) {
                System.out.println(temp[k]);
            }
        }
    }

    public static void withoutUsingTempArray() {
        // Method 2 -----> without using temp array

        int a[] = {1, 2, 2, 3, 4, 5, 5};
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;

            }
        }
        a[j] = a[a.length - 1]; // inserting last element

        for (int k = 0; k < j + 1; k++) {
            System.out.println(a[k]);
        }
    }

    public static void usingHashSet() {
        //This method is applicable for both sorted and unsorted array

        int a[] = {1, 2, 3, 2, 5, 4, 5};

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i < a.length - 1; i++) {
            hs.add(i);
        }
        for (int num : hs) {
            System.out.println(num);
        }


    }

}
