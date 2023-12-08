package JAVA.Programs.javaPrograme1;

public class ReverseIDouble {
    public static void main(String[] args) {
        double num = 123456.35; // Declare num with a type (double in this case)
        int r;
        int sum = 0;

        long integerPart = (long) num; // Extract the integer part

        while (integerPart != 0) {
            r = (int) (integerPart % 10);
            sum = (sum * 10) + r;
            integerPart = integerPart / 10;
        }

        System.out.println(sum);
    }

}
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        double num = 123456.35; // Declare num with a type (double in this case)
//        int r;
//        int sum = 0;
//
//        long integerPart = (long) num; // Extract the integer part


//public class ReverseNumber {: This line declares a class named ReverseNumber.
//
//    public static void main(String[] args) {: This line declares the main method, which is the entry point of the program. It takes an array of strings (args) as parameters.
//
//        double num = 123456.35;: Declares a variable named num of type double and assigns it the value 123456.35.
//
//        int r;: Declares an integer variable named r to store the remainder.
//
//        int sum = 0;: Declares an integer variable named sum and initializes it to 0. This variable will store the reversed number.
//
//        long integerPart = (long) num;: Declares a long variable named integerPart and assigns it the integer part of num. The cast to long is used to truncate the decimal part.
//
//        java
//        Copy code
//        while (integerPart != 0) {
//            r = (int) (integerPart % 10);
//            sum = (sum * 10) + r;
//            integerPart = integerPart / 10;
//        }
//        while (integerPart != 0) {: This line starts a while loop that continues as long as integerPart is not equal to 0.
//
//            r = (int) (integerPart % 10);: Calculates the remainder (r) when integerPart is divided by 10. This gives the last digit of the integer part.
//
//                    sum = (sum * 10) + r;: Updates the sum by multiplying it by 10 and adding the current digit (r). This effectively builds the reversed number.
//
//                    integerPart = integerPart / 10;: Removes the last digit from integerPart by dividing it by 10.
//
//            The while loop continues until integerPart becomes 0, at which point the reversed integer has been calculated.
//
//            java
//            Copy code
//            System.out.println(sum);
//        }
//    }
//System.out.println(sum);: Prints the reversed integer stored in the sum variable to the console.
//    In summary, the code uses a while loop to reverse the digits of the integer part of the given double number (num) without using strings. The reversed integer is stored in the sum variable and then printed to the console.
//
