package JAVA.Programs.LinkedInQuestions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem : Given an array of string words, return all strings in words that is a substring of another word.
 * You can return the answer in any order.
 * A substring is a contiguous sequence of characters within a string.
 */
public class MatchingString {
    public static void main(String[] args) {
        String[] words = {"leetcodedded","leetcode", "et", "code"};
        List<String> matchingStrings = findMatchingStrings(words);
        System.out.println("Strings that are a substring of another word : " + matchingStrings);

        List<String> matchingStrings2 = findMatchingStringsUsingMap(words);
        System.out.println("Using Hashmap: Strings that are a substring of another word : " + matchingStrings2);

    }

    public static List<String> findMatchingStrings(String[] words) {

        return Arrays.stream(words)
                .filter(firstWord -> Arrays.stream(words)
                        .anyMatch(secondWord -> !firstWord.equals(secondWord) && secondWord.indexOf(firstWord) != -1))
                .collect(Collectors.toList());
    }

    public static List<String> findMatchingStringsUsingMap(String[] words) {
        // List to store the result of matching strings
        List<String> result = new ArrayList<>();

        // HashSet to store unique substrings of each word
        Set<String> uniqueSubstrings = new HashSet<>();

        // Iterate through each word in the array
        for (String word : words) {
            // HashSet to store substrings for the current word
            Set<String> substrings = new HashSet<>();

            // Add all unique substrings of the current word to the set
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j <= word.length(); j++) {
                    substrings.add(word.substring(i, j));
                }
            }

            // Check if any substring of the current word is present in the set of unique substrings
            for (String substring : substrings) {
                if (!substring.equals(word) && uniqueSubstrings.contains(substring)) {
                    // If true, add the substring to the result list and break the loop
                    result.add(substring);
                    break;
                }
            }

            // Add all substrings of the current word to the set of unique substrings
            uniqueSubstrings.addAll(substrings);
        }

        // Return the list of matching strings
        return result;
    }
}

/**
 * The main method initializes an array of strings called words and then calls the findMatchingStrings method with this array. Finally, it prints the result.
 *
 * The findMatchingStrings method uses Java streams to process the array of words. It iterates over each word in the array (firstWord) and filters those that meet the specified conditions.
 *
 * The filter operation checks if there exists another word (secondWord) in the array such that:
 *
 * !firstWord.equals(secondWord): The current word is not the same as the other word.
 * secondWord.indexOf(firstWord) != -1: The current word is a substring of the other word. The indexOf method returns the starting index of the substring in the other word. If the substring is not found, it returns -1.
 * The result is collected into a list using the collect method.
 *
 * The final result is a list of strings that are substrings of other words in the array.
 *
 * Note: This implementation has a time complexity of O(n^2), where n is the number of words in the array. This is because, for each word, it checks against every other word to determine if it is a substring. Depending on the size of the input, this approach may not be optimal for large datasets.
 */