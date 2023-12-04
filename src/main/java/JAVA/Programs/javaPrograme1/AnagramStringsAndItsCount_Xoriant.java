package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

class AnagramStringsAndItsCount_Xoriant {

//find number of anagram string from the string array and print anagram string and its count

    public static void main(String[] args) {
        String[] arr = {"cat", "atc", "rat", "sat", "cat"};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char[] chars1 = arr[i].toCharArray();
                Arrays.sort(chars1);

                char[] chars2 = arr[j].toCharArray();
                Arrays.sort(chars2);
                System.out.println("chars2" + chars2);
                if (Arrays.equals(chars1, chars2)) {
                    count++;
                    System.out.println("Anagram found: " + arr[i] + " and " + arr[j]);
                }
            }
        }
        System.out.println("Total number of anagrams: " + count);
    }
}

