package Programs.javaPrograme1;

public class ReverseInteger {

    public static void main(String[] args) {

        int num = 123456789;

        int rev = 0;

        // Using algo
        while (num != 0) {

            rev = rev * 10 + num % 10; // 54321
            num = num / 10;
        }

        System.out.println("Using first method: " + rev);


        //Using String buffer

        long num1 = 145632;

        String num2 = String.valueOf(num1);

        StringBuffer sb = new StringBuffer(num2);
        System.out.println("Reverse of 145632 using String buffer: " + sb.reverse());


        //System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

        myLogin(12345);


    }

    public static void myLogin(int num1) {

        int r;
        int sum = 0;

        while (num1 != 0) {
            r = num1 % 10;
            sum = (sum * 10) + r;
            num1 = num1 / 10;

        }
        System.out.println("sum is: " + sum);

    }

}
