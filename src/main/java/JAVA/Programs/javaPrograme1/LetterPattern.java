package JAVA.Programs.javaPrograme1;

/**
 * 1. Iterate till the length
 * 2. Check if the character is a digit
 * 3. Get the digit as the count of next letter
 * 4. Get the letter next to digit
 * 5. Iterate till the count
 * 6. Print the character
 */
public class LetterPattern {
    public static void main(String[] args) {
        String input = "2a3b4c5t";

        for (int i = 0; i < input.length(); i++) {
            // Check if the character is a digit
            if (Character.isDigit(input.charAt(i))) {
                // Get the digit as the count of the next letter
                int count = Character.getNumericValue(input.charAt(i));

                // Move to the next character, which should be the letter
                char letter = input.charAt(i + 1);

                // Print the letter 'count' times
                for (int j = 0; j < count; j++) {
                    System.out.print(letter);
                }
            }
        }
    }
}
