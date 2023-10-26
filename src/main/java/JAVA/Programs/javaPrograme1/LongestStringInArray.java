package JAVA.Programs.javaPrograme1;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig"};
        String lonString = longestString(arr);
        System.out.println(lonString);
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
}
