package LinkedInQuestions;

import java.util.HashMap;
import java.util.HashSet;

//Simplest explanation ===> //https://youtu.be/sqxer2ynS6U

public class LongestNonRepeatingCharacter {

    public static String longestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        String longestTillNow = "";
        String longestOverall = "";

        if (s == null || s.isEmpty()) {
            return "";
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                longestTillNow = "";
                set.clear();
            }
            set.add(c);
            longestTillNow = longestTillNow + c;

            if (longestTillNow.length() > longestOverall.length()) {
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }


    public static void main(String[] args) {
        String input = "abcdab";
        String longestSubstring = longestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}
