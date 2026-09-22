package JAVA.StringZeroToHero;

import java.util.*;

public class StringImmutabilityExamples {

    public static void main(String[] args) {

        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();

        example11();
        example12();
        example13();
        example14();
        example15();
        example16();
        example17();
        example18();
        example19();
        example20();

        example21();
        example22();
        example23();
        example24();
        example25();
        example26();
        example27();
        example28();
        example29();
        example30();

        example31();
        example32();
        example33();
        example34();
        example35();

        example36();
        example37();
        example38();
        example39();
        example40();
        example41();
        example42();
        example43();
        example44();
        example45();

        example46();
        example47();
        example48();
        example49();
        example50();
    }

    /*
     * Q1. What happens when we reassign a String?
     *
     * String is immutable.
     *
     * Before:
     * s -----> "apple"
     *
     * After:
     * s -----> "mango"
     *
     * "apple" was NOT modified.
     *
     * Output:
     * mango
     */
    private static void example1() {
        System.out.println("\n*** Q1. String reassignment");

        String s = "apple";
        s = "mango";

        System.out.println(s);
    }

    /*
     * Q2. Prove String is immutable.
     *
     * Initially:
     *
     * s   ----\
     *          -----> "Java"
     * old ----/
     *
     * concat() creates a NEW String.
     *
     * After:
     *
     * old -----> "Java"
     * s   -----> "Java Test"
     *
     * Output:
     * Java
     * Java Test
     */
    private static void example2() {
        System.out.println("\n*** Q2. Prove String is immutable");

        String s = "Java";
        String old = s;

        s = s.concat(" Test");

        System.out.println(old);
        System.out.println(s);
    }

    /*
     * Q3. Can a String object be modified?
     *
     * toUpperCase() returns a NEW String.
     * We ignore the returned value.
     *
     * Output:
     * hello
     */
    private static void example3() {
        System.out.println("\n*** Q3. Can a String object be modified?");

        String s = "hello";
        s.toUpperCase();

        System.out.println(s);
    }

    /*
     * Q4. What happens when we store the result of toUpperCase()?
     *
     * s -----> "hello"
     *
     * s = s.toUpperCase()
     *
     * s -----> "HELLO"
     */
    private static void example4() {
        System.out.println("\n*** Q4. Store result of toUpperCase()");

        String s = "hello";
        s = s.toUpperCase();

        System.out.println(s);
    }

    /*
     * Q5. What happens with two identical String literals?
     *
     * String literals use the String Pool.
     *
     * s1 ----\
     *          -----> "Java"
     * s2 ----/
     *
     * Therefore == is true.
     */
    private static void example5() {
        System.out.println("\n*** Q5. String Pool");

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
    }

    /*
     * Q6. new String() vs new String()
     *
     * s1 -----> Object 1 "Java"
     * s2 -----> Object 2 "Java"
     *
     * Same content, different objects.
     *
     * ==       -> false
     * equals() -> true
     */
    private static void example6() {
        System.out.println("\n*** Q6. new String() comparison");

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    /*
     * Q7. Difference between == and equals().
     *
     * == checks reference.
     * equals() checks content.
     */
    private static void example7() {
        System.out.println("\n*** Q7. == vs equals()");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("Using ==      : " + (s1 == s2));
        System.out.println("Using equals(): " + s1.equals(s2));
    }

    /*
     * Q8. What happens if concat() result is ignored?
     *
     * concat() returns a NEW String.
     * The returned value is ignored.
     *
     * Therefore s remains "Java".
     */
    private static void example8() {
        System.out.println("\n*** Q8. concat() result ignored");

        String s = "Java";
        s.concat(" Selenium");

        System.out.println(s);
    }

    /*
     * Q9. What happens if concat() result is assigned back?
     *
     * s -----> "Java"
     *
     * concat() returns "Java Selenium"
     *
     * s -----> "Java Selenium"
     */
    private static void example9() {
        System.out.println("\n*** Q9. concat() result assigned");

        String s = "Java";
        s = s.concat(" Selenium");

        System.out.println(s);
    }

    /*
     * Q10. StringBuilder is mutable.
     *
     * StringBuilder:
     * same object -> append() -> content changes.
     */
    private static void example10() {
        System.out.println("\n*** Q10. StringBuilder is mutable");

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Test");

        System.out.println(sb);
    }

    /*
     * Q11. String literal vs new String()
     *
     * s1 -----> String Pool "Java"
     * s2 -----> separate String object "Java"
     *
     * == -> false
     */
    private static void example11() {
        System.out.println("\n*** Q11. Literal vs new String()");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);
    }

    /*
     * Q12. Why does equals() return true here?
     *
     * equals() compares the characters/content.
     */
    private static void example12() {
        System.out.println("\n*** Q12. equals() checks content");

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));
    }

    /*
     * Q13. Multiple literals in String Pool.
     *
     * s1 ----\
     *          -----> "QA"
     * s2 ----/
     *
     * s3 -----------> "API"
     */
    private static void example13() {
        System.out.println("\n*** Q13. Multiple literals in String Pool");

        String s1 = "QA";
        String s2 = "QA";
        String s3 = "API";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

    /*
     * Q14. What does intern() do?
     *
     * a -----> separate object "Java"
     * b -----> pooled "Java"
     */
    private static void example14() {
        System.out.println("\n*** Q14. intern()");

        String a = new String("Java");
        String b = a.intern();
        String c = "Java";

        System.out.println(b == c);
    }

    /*
     * Q15. Compare String safely when value can be null.
     */
    private static void example15() {
        System.out.println("\n*** Q15. Safe String comparison");

        String s = null;

        System.out.println("Java".equals(s));
    }

    /*
     * Q16. What happens when equals() is called on null?
     *
     * Calling a method on null causes NullPointerException.
     */
    private static void example16() {
        System.out.println("\n*** Q16. equals() with null");

        String s = null;

        try {
            System.out.println(s.equals("Java"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

    /*
     * Q17. compareTo()
     *
     * 0  -> same content
     * <0 -> first String comes before second
     * >0 -> first String comes after second
     */
    private static void example17() {
        System.out.println("\n*** Q17. compareTo()");

        String s1 = "Apple";
        String s2 = "Banana";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1));
    }

    /*
     * Q18. equalsIgnoreCase()
     */
    private static void example18() {
        System.out.println("\n*** Q18. equalsIgnoreCase()");

        String s1 = "java";
        String s2 = "JAVA";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    /*
     * Q19. String concatenation using +.
     *
     * Original String is immutable.
     * A new result is assigned to s.
     */
    private static void example19() {
        System.out.println("\n*** Q19. String concatenation");

        String s = "Java";
        s = s + " Test";

        System.out.println(s);
    }

    /*
     * Q20. Compile-time constant concatenation.
     *
     * "Ja" + "va" can be resolved as a constant.
     */
    private static void example20() {
        System.out.println("\n*** Q20. Compile-time concatenation");

        String a = "Ja" + "va";
        String b = "Java";

        System.out.println(a == b);
    }

    /*
     * Q21. substring()
     *
     * Start index is inclusive.
     * End index is exclusive.
     *
     * Step 2: Start index is included
             0   1   2   3
                 ↓
    String:  J   a   v   a
                 ↑
               START


     *  So we take: a


     *  Step 3: End index is NOT included


               0   1   2   3
                   ↓   ↓
      String:  J   a   v   a
                   [-------)
                    include
                    1, 2

              exclude 3

     * Therefore Java takes indexes: 1 and 2
     *
     *
     */
    private static void example21() {
        System.out.println("\n*** Q21. substring()");

        String s = "Java";

        System.out.println(s.substring(1, 3));
    }

    /*
     * Q22. charAt()
     *
     * Index starts from 0.
     */
    private static void example22() {
        System.out.println("\n*** Q22. charAt()");

        String s = "Java";

        System.out.println(s.charAt(1));
    }

    /*
     * Q23. indexOf()
     *
     * Returns the first matching position.
     */
    private static void example23() {
        System.out.println("\n*** Q23. indexOf()");

        String s = "selenium";

        System.out.println(s.indexOf("e"));
    }

    /*
     * Q24. lastIndexOf()
     *
     * Returns the last matching position.
     */
    private static void example24() {
        System.out.println("\n*** Q24. lastIndexOf()");

        String s = "selenium";

        System.out.println(s.lastIndexOf("e"));
    }

    /*
     * Q25. replace()
     *
     * String is immutable.
     * replace() returns a new String.
     */
    private static void example25() {
        System.out.println("\n*** Q25. replace()");

        String s = "Java";
        String result = s.replace("J", "j");

        System.out.println("Original: " + s);
        System.out.println("Result  : " + result);
    }

    /*
     * Q26. replaceAll()
     *
     * replaceAll() uses regular expressions.
     * \\d means digit.
     */
    private static void example26() {
        System.out.println("\n*** Q26. replaceAll()");

        String s = "a1b2c3";
        String result = s.replaceAll("\\d", "X");

        System.out.println(result);
    }

    /*
     * Q27. trim()
     */
    private static void example27() {
        System.out.println("\n*** Q27. trim()");

        String s = "   Java   ";

        System.out.println("[" + s.trim() + "]");
    }

    /*
     * Q28. isEmpty() vs isBlank()
     *
     * empty -> length is 0
     * blank -> empty or whitespace only
     */
    private static void example28() {
        System.out.println("\n*** Q28. isEmpty() vs isBlank()");

        String empty = "";
        String spaces = "   ";

        System.out.println(empty.isEmpty());
        System.out.println(spaces.isEmpty());
        System.out.println(spaces.isBlank());
    }

    /*
     * Q29. startsWith() and endsWith()
     */
    private static void example29() {
        System.out.println("\n*** Q29. startsWith() and endsWith()");

        String s = "automation";

        System.out.println(s.startsWith("auto"));
        System.out.println(s.endsWith("tion"));
    }

    /*
     * Q30. split()
     */
    private static void example30() {
        System.out.println("\n*** Q30. split()");

        String s = "Java,Selenium,API";
        String[] values = s.split(",");

        System.out.println(Arrays.toString(values));
    }

    /*
     * Q31. StringBuilder append()
     *
     * sb -----> [Java]
     * append(" Test")
     * sb -----> [Java Test]
     */
    private static void example31() {
        System.out.println("\n*** Q31. StringBuilder append()");

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Test");

        System.out.println(sb);
    }

    /*
     * Q32. StringBuilder insert()
     */
    private static void example32() {
        System.out.println("\n*** Q32. StringBuilder insert()");

        StringBuilder sb = new StringBuilder("Java");
        sb.insert(4, " Selenium");


        System.out.println(sb);
    }

    /*
     * Q33. StringBuilder delete()
     */
    private static void example33() {
        System.out.println("\n*** Q33. StringBuilder delete()");

        StringBuilder sb = new StringBuilder("Java Selenium");
        sb.delete(4, 13);

        System.out.println(sb);
    }

    /*
     * Q34. StringBuilder reverse()
     */
    private static void example34() {
        System.out.println("\n*** Q34. StringBuilder reverse()");

        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();

        System.out.println(sb);
    }

    /*
     * Q35. StringBuilder length() vs capacity()
     *
     * length = current characters
     * capacity = current buffer capacity
     */
    private static void example35() {
        System.out.println("\n*** Q35. StringBuilder length vs capacity");

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Length  : " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

    /*
     * Q36. Reverse a String.
     *
     * Java -> avaJ
     */
    private static void example36() {
        System.out.println("\n*** Q36. Reverse String");

        String s = "Java";
        String result = new StringBuilder(s).reverse().toString();

        System.out.println(result);
    }

    /*
     * Q37. Check palindrome.
     *
     * madam -> true
     * java  -> false
     */
    private static void example37() {
        System.out.println("\n*** Q37. Palindrome");

        String s = "madam";

        int left = 0;
        int right = s.length() - 1;
        boolean palindrome = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);
    }

    /*
     * Q38. Count character frequency.
     *
     * Java
     *
     * J -> 1
     * a -> 2
     * v -> 1
     */
    private static void example38() {
        System.out.println("\n*** Q38. Character frequency");

        String s = "Java";

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        System.out.println(count);
    }

    /*
     * Q39. Find first non-repeating character.
     *
     * swiss -> w
     */
    private static void example39() {
        System.out.println("\n*** Q39. First non-repeating character");

        String s = "swiss";

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {

            if (count.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }

    /*
     * Q40. Find first repeating character.
     *
     * swiss -> s
     */
    private static void example40() {
        System.out.println("\n*** Q40. First repeating character");

        String s = "swiss";

        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {

            if (!seen.add(c)) {
                System.out.println(c);
                break;
            }
        }
    }

    /*
     * Q41. Remove duplicate characters.
     *
     * programming -> progamin
     *
     * LinkedHashSet preserves insertion order.
     */
    private static void example41() {
        System.out.println("\n*** Q41. Remove duplicate characters");

        String s = "programming";

        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char c : set) {
            result.append(c);
        }

        System.out.println(result);
    }

    /*
     * Q42. Check whether two Strings are anagrams.
     *
     * listen
     * silent
     *
     * Both contain the same characters.
     */
    private static void example42() {
        System.out.println("\n*** Q42. Anagram");

        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }

    /*
     * Q43. Check String rotation.
     *
     * abcd
     * cdab
     *
     * a + a = abcdabcd
     *
     * cdab exists inside it.
     */
    private static void example43() {
        System.out.println("\n*** Q43. String rotation");

        String a = "abcd";
        String b = "cdab";

        boolean result =
                a.length() == b.length()
                        && (a + a).contains(b);

        System.out.println(result);
    }

    /*
     * Q44. Count vowels and consonants.
     */
    private static void example44() {
        System.out.println("\n*** Q44. Vowels and consonants");

        String s = "Automation";

        int vowels = 0;
        int consonants = 0;

        for (char c : s.toLowerCase().toCharArray()) {

            if (c >= 'a' && c <= 'z') {

                if ("aeiou".indexOf(c) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels    : " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    /*
     * Q45. Find longest word in a String.
     */
    private static void example45() {
        System.out.println("\n*** Q45. Longest word");

        String sentence = "I love Java automation";

        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }

    /*
     * Q46. Longest substring without repeating characters.
     *
     * abcabcbb
     *
     * Longest unique substring = abc
     * Length = 3
     *
     * Uses sliding window.
     */
    private static void example46() {
        System.out.println("\n*** Q46. Longest substring without repeating characters");

        String s = "abcabcbb";

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }

    /*
     * Q47. Why is String a good HashMap key?
     *
     * String is immutable.
     *
     * Once "PASS" is used as a key, its content/hash
     * cannot be changed.
     */
    private static void example47() {
        System.out.println("\n*** Q47. String as HashMap key");

        Map<String, Integer> map = new HashMap<>();

        map.put("PASS", 1);

        System.out.println(map.get("PASS"));
    }

    /*
     * Q48. StringBuilder in a loop.
     *
     * StringBuilder is useful for repeated text construction.
     */
    private static void example48() {
        System.out.println("\n*** Q48. StringBuilder in a loop");

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            result.append(i);
        }

        System.out.println(result);
    }

    /*
     * Q49. StringBuilder references.
     *
     * sb and sameReference point to the SAME mutable object.
     *
     * sb              ----\
     *                     -----> [Test Data]
     * sameReference  ----/
     *
     * Therefore both print the modified value.
     */
    private static void example49() {
        System.out.println("\n*** Q49. StringBuilder same reference");

        StringBuilder sb = new StringBuilder("Test");

        StringBuilder sameReference = sb;

        sameReference.append(" Data");

        System.out.println(sb);
        System.out.println(sameReference);
        System.out.println(sb == sameReference);
    }

    /*
     * Q50. Senior interview question:
     *
     * Explain String immutability in 30 seconds.
     *
     * Example:
     *
     * String s = "apple";
     * s = "mango";
     *
     * Answer:
     *
     * String is immutable. The existing "apple" String
     * cannot be changed. The reference s is reassigned
     * to another String value "mango".
     *
     * Important automation connection:
     *
     * concat(), replace(), trim(), toUpperCase(), etc.
     * return String values instead of modifying the original.
     */
    private static void example50() {
        System.out.println("\n*** Q50. Senior String explanation");

        String s = "apple";

        System.out.println("Before: " + s);

        s = "mango";

        System.out.println("After : " + s);
    }

}