package JAVA.Programs.javaPrograme2;
/*
String s = "ABC "
Output should be -ABC ACB BAC BCA CBA CAB
 */

public class StringPermutation {

        public static void main(String[] args) {
            String s = "ABC";
            generatePermutations("", s);
        }

        public static void generatePermutations(String prefix, String remaining) {
            int n = remaining.length();

            if (n == 0) {
                // If no characters remaining, print the permutation
                System.out.print(prefix + " ");
            } else {
                // Recursively generate permutations by fixing each character in turn
                for (int i = 0; i < n; i++) {
                    generatePermutations(prefix + remaining.charAt(i),
                            remaining.substring(0, i) + remaining.substring(i + 1));
                }
            }
        }


}
