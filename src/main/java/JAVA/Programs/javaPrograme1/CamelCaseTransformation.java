package JAVA.Programs.javaPrograme1;

public class CamelCaseTransformation {

    public static String camelCase(String str) {
        // Remove all non-alphabetic characters except delimiters
        str = str.replaceAll("[^a-zA-Z\\s\\-_]", "");

        // Split the string using common delimiters (space, hyphen, underscore)
        String[] words = str.split("[\\s\\-_]");

        // Initialize the result with the first word in lowercase
        StringBuilder camelCase = new StringBuilder(words[0].toLowerCase());

        // Process the rest of the words
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                // Capitalize the first letter and append the rest
                camelCase.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase());
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("my name Is swapnil"));
    }
}
