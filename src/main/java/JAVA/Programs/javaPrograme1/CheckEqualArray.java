package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class CheckEqualArray {


    public static void main(String[] args) {

        method1();
        usingArraysEqualMethod();
    }

    private static void method1() {
        int[] a1 = {10, 20, 30, 40};
        int[] a2 = {10, 20, 40, 40, 100};

        boolean areEqual = true; // Assume equality until proven otherwise

        // Check if the arrays have the same length
        if (a1.length != a2.length) {
            areEqual = false;
        } else {
            // Compare each element of the arrays
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    areEqual = false; // Found a mismatch
                    break; // Exit the loop since further comparison is unnecessary
                }
            }
        }
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }


    private static void usingArraysEqualMethod() {
        int[] a1 = {10, 20, 30, 40};
        int[] a2 = {10, 20, 40, 40};

        boolean arrEqual = Arrays.equals(a1, a2);

        if (arrEqual) {
            System.out.println("Arrays are equal");
        }
        System.out.println("Arrays are not equal");
    }
}

