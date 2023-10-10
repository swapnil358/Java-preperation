package Programs.javaPrograme2;

import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        printFloydTriangle(rows);
        treePattern();

    }

    public static void printFloydTriangle(int n) {
        int number = 1;
        for (int i = 0; i < n; i++) {
            //number=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void treePattern() {

        int n = 10;
        int num;
        for (int i = 0; i < n; i++) // outer loop for rows
        {
            num = 1;
            for (int j = 0; j <= i; j++) // inner loop for rows
            {
                // printing num with a space
                System.out.print(num + " ");   //to print the values on the same lines
                // incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }
    }
}
