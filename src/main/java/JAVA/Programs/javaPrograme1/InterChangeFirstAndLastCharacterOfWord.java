package JAVA.Programs.javaPrograme1;

/**
 * The reverseInitialAndEndCharacters method splits the input string into words using the
 * regular expression \\s+ to handle multiple spaces.
 *
 * For each word, it checks if the word has more than one character. If it does,
 * it reverses the initial and end characters and appends the modified word to the result.
 *
 * If the word has only one character, it appends the word as is.
 *
 * The final result is then printed.
 */

public class InterChangeFirstAndLastCharacterOfWord {
        public static void main(String[] args) {
            String input = "name king";
            String result = reverseInitialAndEndCharacters(input);
            System.out.println(result);
        }

        private static String reverseInitialAndEndCharacters(String input) {
            StringBuilder result = new StringBuilder();
            String[] words = input.split("\\s+"); // Split the string into words

            for (String word : words) {
                if (word.length() > 1) {
                    // Reverse the initial and end characters of each word
                    char initialChar = word.charAt(0);
                    char endChar = word.charAt(word.length() - 1);
                    String middleChars = word.substring(1, word.length() - 1);

                    // Append the reversed word to the result
                    result.append(endChar).append(middleChars).append(initialChar).append(" ");
                } else {
                    // If the word has only one character, append it as is
                    result.append(word).append(" ");
                }
            }

            return result.toString().trim(); // Trim to remove the trailing space
        }

}
