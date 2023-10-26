package JAVA_Programs.javaPrograme1;

public class FibonacciSeries {

    // https://youtu.be/QqX1ExNAev0?list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa

    // Fibonacci number ---> it is the addition of two previous numbers

    // 0 1 1 2 3 5 8 13


    static int a = 0;
    static int b = 1;
    static int c;



    public static void main(String[] args) {

//        usingIteration();
//        UsingRecursion1(10);


        System.out.println("fibUsingRecursion: " + a + " " + b);
        fibUsingRecursion(20);
    }

    private static void usingIteration() {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; i++) {

            sum = n1 + n2; // 2+3

            System.out.print(" " + sum); // 1 2 3 5

            n1 = n2; // n1-->2
            n2 = sum; // n2-->3
        }
    }

    public static void fibUsingRecursion(int n) {

        if (n >= 1) {
            c = a + b;
            System.out.println(" "+c);
            a = b;
            b = c;
            fibUsingRecursion(n - 1);
        }
    }
    // fibonacci(10);

//Using recursion

    public static int UsingRecursion1(int n) {
        if (n <= 1) {
            return n;
        }
        return UsingRecursion1(n - 1) + UsingRecursion1(n - 2);
    }


}
