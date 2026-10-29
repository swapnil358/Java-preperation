package JAVA.Programs.javaPrograme1;

/*
* length → property/field used mainly with arrays
length() → method used with String
*
* */
public class PalindromeString {

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;


        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();

        System.out.println("reverse : " + strBuilder.reverse());

        return strBuilder.toString().equals(str);


    }

    //Very important method for string palindrome
    public static void IsPalindrom_Method2() {

        String inputString = "aaabaaa";
        String rev = "";


        for (int i = inputString.length() - 1; i >= 0; i--) {
            rev = rev + inputString.charAt(i);
        }
        System.out.println(rev);

        if (inputString.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

//Using two pointer
    public static void usingTwoPointer() {
        String str = "naman";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        boolean status = false;
        while (left <= right) {
            if (chars[left] != chars[right]) {
                System.out.println("String is not palindrome");
                return;
            } else {
                left++;
                right--;
                status= true;
            }
        }
        if (status) {
            System.out.println("String is palindrome");
        }


    }

    public static void method2(){
        String name = "naman";
        char[] arr = name.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Reverse using two pointers
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reverse = new String(arr);

        System.out.println("Original string: naman");
        System.out.println("Reversed string: " + reverse);

        if (name.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {

//		System.out.println(isPalindrome("abcd"));
//		IsPalindrom_Method2();

        usingTwoPointer();
        method2();
    }

}
