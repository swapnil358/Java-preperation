package JAVA.Programs.javaPrograme1;

import java.util.HashMap;
import java.util.Map;

public class FindSecondMostFrequentlyRepeatingChar {




        public static void main(String[] args) {

            String str = "programming";

            Map<Character, Integer> counter = new HashMap<>();

            // Step 1: Count each character
            for (char ch : str.toCharArray()) {
                counter.put(ch, counter.getOrDefault(ch, 0) + 1);
            }

            System.out.println(counter);

            // Step 2: Find the highest and second-highest frequencies
            char first = '\0';
            char second = '\0';
            int max1 = 0;
            int max2 = 0;

            for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
                char ch = entry.getKey();
                int count = entry.getValue();

                if (count > max1) {
                    max2 = max1;
                    second = first;

                    max1 = count;
                    first = ch;
                } else if (count > max2 && count < max1) {
                    max2 = count;
                    second = ch;
                }
            }

            if (max2 == 0) {
                System.out.println("No second most frequent character found.");
            } else {
                System.out.println("Second most frequent character: " + second);
                System.out.println("Frequency: " + max2);
            }
        }
    }


