package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig"};
        String lonString = longestString(arr);
        System.out.println(lonString);

        usingStream();
    }
    public static String longestString(String[] arr) {
        String longestStr = "";

        for (String s : arr) {
            if (s.length() > longestStr.length()) {
                longestStr = s;
            }
        }
        return longestStr;
    }


    private static void usingStream(){

        String[] arr = {"apple", "banana", "cherry", "date", "fig"};

        String longest = Arrays.stream(arr)
                .max(Comparator.comparingInt(s -> s.length()))
                .orElse("");

        System.out.println("*** Using Stream *** ");
        System.out.println(longest);

    }
}
