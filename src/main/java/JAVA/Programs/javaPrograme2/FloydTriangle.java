package JAVA.Programs.javaPrograme2;

import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");

        int rows = sc.nextInt();

        printFloydTriangle(rows);

        treePattern();
    }

    /*
     * ============================================================
     * Method 1: Floyd's Triangle
     * ============================================================
     *
     * Example for 5 rows:
     *
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     *
     * 'number' is declared outside the loops because we want
     * the number to continue from the previous row.
     *
     * ============================================================
     */

    public static void printFloydTriangle(int n) {

        int number = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");

                number++;
            }

            System.out.println();
        }
    }

    /*
     * ============================================================
     * Method 2: Number Triangle
     * ============================================================
     *
     * Output for 5 rows:
     *
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     *
     * Here 'num = 1' is inside the outer loop.
     *
     * Therefore, num starts from 1 for every new row.
     *
     * ============================================================
     */

    public static void treePattern() {

        int n = 10;

        for (int i = 0; i < n; i++) {

            int num = 1;

            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");

                num++;
            }

            System.out.println();
        }
    }
}