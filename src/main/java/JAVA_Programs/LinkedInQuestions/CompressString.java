package JAVA_Programs.LinkedInQuestions;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String input = "aaabbcccd";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        Map<Character, Integer> charCount = new HashMap<>();

        char[] chars = s.toCharArray();

        for (char c : chars) {
         //   charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            //charCount.getOrDefault(c, 0)
            // retrieves the current count of character c or returns 0
            // if it's not already in the HashMap. We then increment this count by 1
            // and update the value in the HashMap.
            if (charCount.containsKey(c)) {
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            compressed.append(entry.getKey());
            compressed.append(entry.getValue());
        }

        return compressed.toString();
    }

}