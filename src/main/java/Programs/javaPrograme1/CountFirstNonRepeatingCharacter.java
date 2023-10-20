package Programs.javaPrograme1;

import java.util.HashMap;
import java.util.Map;


//String inputString = "geeksforgeeks";
// output = f
public class CountFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String inputString = "geeksforgeeks";  //
        char result = countFirstNonRepeatingChar(inputString);
        System.out.println("First non-repeating character: " + result);
        // Output: c
    }

    public static char countFirstNonRepeatingChar(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the charCount map
        for (char c : input.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Iterate through the string to find the first non-repeating character
        for (char c : input.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        // If no non-repeating character found, return 0 or any special value to
        // indicate no result
        // In this case, let's return a space character ' ' to indicate no result.
        return 0;
    }
}
