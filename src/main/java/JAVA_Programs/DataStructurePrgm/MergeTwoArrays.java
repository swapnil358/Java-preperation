package JAVA_Programs.DataStructurePrgm;

import java.util.Arrays;

public class MergeTwoArrays {

    //https://youtu.be/JeQtPl3nxu4

    //Merge two array and arrange them
    public static void main(String[] args) {

        int[] a = {10, 20, 100};
        int[] b = {70, 80, 90};

        int[] c = new int[a.length + b.length];


        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        Arrays.sort(c);
        for (int j : c) {
            System.out.print(j + " ");
        }
    }
}
