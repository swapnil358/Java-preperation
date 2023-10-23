package Programs.MorganStanleyJavaInterview;


public class WordCount {

        public static void main(String[] args) {
            String input = "How many eggs are in a half-dozen, 13?";
            int wordCount = countWords(input);
            System.out.println("The number of words in the string is: " + wordCount);
        }



        public static int countWords(String sentence) {
            // Regular expression to split the sentence into words
            String[] words = sentence.split("\\s+");
            int count = 0;
            for (String word : words) {
                // Check if the word contains only valid characters
                if (word.matches("^[a-zA-Z-]+[.,?\\d]*$")) {
                    count++;
                }
            }

            return count;
        }
}

/**
 * Problem Statement:
 *
 * You are given a sentence, and you need to determine the number of words in that sentence, following specific rules:
 *
 * A sentence is composed of words.
 * Each word is a sequence of letters ('a'-'z', 'A'-'Z') that may contain one or more hyphens ('-').
 * Words may end with a punctuation mark: period ('.'), comma (','), question mark ('?'), or exclamation point ('!').
 * Words are separated by one or more whitespace characters (e.g., spaces).
 * Here's an example to illustrate these rules:
 *
 * Example:
 *
 * Consider the sentence: "How many eggs are in a half dozen, 13?"
 *
 * In this example, the list of words in the string is as follows:
 *
 * "How"
 * "many"
 * "eggs"
 * "are"
 * "in"
 * "a"
 * "half-dozen"
 * The word "half-dozen" contains a hyphen but is considered a single word.
 *
 * The word "13" is not considered a word because it contains numeric characters ('1' and '3'), which are not within the allowed character set of words.
 *
 * The total number of words in the sentence is 7, based on the rules provided.
 *
 * Now, the problem is to write a Java program that takes a sentence as input and counts the number of words in that sentence, following these rules.
 *
 * The Java program I provided in my previous response accomplishes this by splitting the sentence into words using regular expressions and then checking each word for validity. If the word contains only valid characters and ends with an optional punctuation mark, it is counted as a word. The program returns the total count of valid words in the sentence.
 */