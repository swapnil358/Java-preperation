package LinkedInQuestions;

import java.util.HashSet;

public class LongestNonRepeatingSubstringHandledAllCases {
    public static String lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        HashSet<Character> set = new HashSet<>();
        String longestTillNow = "";
        String longestSoFar = "";
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                // Remove characters from the start of the current substring
                // until the repeating character is removed from the set.
                while (s.charAt(start) != c) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++; // Move the start pointer to the next character.
            } else {
                set.add(c);
            }

            // Update longestTillNow
            longestTillNow = s.substring(start, i + 1);

            // Update longestSoFar if needed
            if (longestTillNow.length() > longestSoFar.length()) {
                longestSoFar = longestTillNow;
            }
        }
        return longestSoFar;
    }

    public static void main(String[] args) {
        String aab = lengthOfLongestSubstring("aab");
        System.out.println(aab);
    }
}
