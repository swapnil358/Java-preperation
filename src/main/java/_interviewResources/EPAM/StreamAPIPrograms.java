package _interviewResources.EPAM;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/*Questions covered
        Filter strings whose length is greater than 4
        Convert all strings to uppercase
        Filter and convert strings to uppercase
        Find even numbers
        Find numbers greater than 50
        Find square of every number
        Count numbers greater than 50
        Find maximum number
        Find minimum number
        Sort numbers
        Sort strings alphabetically
        Remove duplicate numbers
        Find first matching element
        Check if any number is greater than 100
        Check if all numbers are positive
        Find sum of numbers
        Find average of numbers
        Convert List to Map
        Join strings
        Find second-highest distinct number
        package JAVA.Programs.javaPrograme1;
*/


public class StreamAPIPrograms {

    public static void main(String[] args) {

        System.out.println("========== JAVA STREAM API PROGRAMS ==========");

        // 1. Filter strings whose length is greater than 4
        filterStringsByLength();

        // 2. Convert all strings to uppercase
        convertStringsToUppercase();

        // 3. Filter and convert strings to uppercase
        filterAndConvertStrings();

        // 4. Find even numbers
        findEvenNumbers();

        // 5. Find numbers greater than 50
        findNumbersGreaterThan50();

        // 6. Find square of every number
        findSquareOfNumbers();

        // 7. Count numbers greater than 50
        countNumbersGreaterThan50();

        // 8. Find maximum number
        findMaximumNumber();

        // 9. Find minimum number
        findMinimumNumber();

        // 10. Sort numbers
        sortNumbers();

        // 11. Sort strings alphabetically
        sortStrings();

        // 12. Remove duplicate numbers
        removeDuplicates();

        // 13. Find first matching element
        findFirstMatchingElement();

        // 14. Check if any number is greater than 100
        checkAnyNumberGreaterThan100();

        // 15. Check if all numbers are positive
        checkAllNumbersPositive();

        // 16. Find sum of numbers
        findSumOfNumbers();

        // 17. Find average of numbers
        findAverageOfNumbers();

        // 18. Convert List to Map
        convertListToMap();

        // 19. Join strings
        joinStrings();

        // 20. Find second-highest distinct number
        findSecondHighestNumber();

        // Question 21
        findNamesStartingWithS();

        // Question 22
        findNamesEndingWithL();

        // Question 23
        convertFirstLetterToUppercase();

        // Question 24
        findNamesContainingA();

        // Question 25
        findLongestString();
    }


    /*
     * ============================================================
     * QUESTION 1:
     *
     * Given a list of product names, find only the products
     * whose length is greater than 4.
     *
     * Input:
     * ["Zara", "Nike", "Apple", "Samsung"]
     *
     * Expected Output:
     * [Apple, Samsung]
     * ============================================================
     */
    public static void filterStringsByLength() {

        List<String> titles =
                Arrays.asList("Zara", "Nike", "Apple", "Samsung");

        List<String> result = titles.stream()
                .filter(s -> s.length() > 4)
                .collect(Collectors.toList());

        System.out.println("1. Filter by length : " + result);
    }


    /*
     * ============================================================
     * QUESTION 2:
     *
     * Given a list of names, convert all names to uppercase.
     *
     * Input:
     * ["swapnil", "amit", "rahul"]
     *
     * Expected Output:
     * [SWAPNIL, AMIT, RAHUL]
     * ============================================================
     */
    public static void convertStringsToUppercase() {

        List<String> names =
                Arrays.asList("swapnil", "amit", "rahul");

        List<String> result = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("2. Uppercase : " + result);
    }


    /*
     * ============================================================
     * QUESTION 3:
     *
     * Given a list of product names:
     *
     * 1. Keep only names whose length is greater than 4.
     * 2. Convert them to uppercase.
     *
     * Input:
     * ["Zara", "Nike", "Apple", "Samsung"]
     *
     * Expected Output:
     * [APPLE, SAMSUNG]
     * ============================================================
     */
    public static void filterAndConvertStrings() {

        List<String> titles =
                Arrays.asList("Zara", "Nike", "Apple", "Samsung");

        List<String> result = titles.stream()
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("3. Filter + Map : " + result);
    }


    /*
     * ============================================================
     * QUESTION 4:
     *
     * Given a list of integers, find all even numbers.
     *
     * Input:
     * [10, 15, 20, 25, 30]
     *
     * Expected Output:
     * [10, 20, 30]
     * ============================================================
     */
    public static void findEvenNumbers() {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("4. Even numbers : " + result);
    }


    /*
     * ============================================================
     * QUESTION 5:
     *
     * Given a list of integers, find all numbers greater than 50.
     *
     * Input:
     * [10, 60, 45, 80, 25, 100]
     *
     * Expected Output:
     * [60, 80, 100]
     * ============================================================
     */
    public static void findNumbersGreaterThan50() {

        List<Integer> numbers =
                Arrays.asList(10, 60, 45, 80, 25, 100);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println("5. Greater than 50 : " + result);
    }


    /*
     * ============================================================
     * QUESTION 6:
     *
     * Given a list of numbers, find the square of every number.
     *
     * Input:
     * [2, 3, 4, 5]
     *
     * Expected Output:
     * [4, 9, 16, 25]
     * ============================================================
     */
    public static void findSquareOfNumbers() {

        List<Integer> numbers =
                Arrays.asList(2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("6. Square : " + result);
    }


    /*
     * ============================================================
     * QUESTION 7:
     *
     * Given a list of numbers, count how many numbers
     * are greater than 50.
     *
     * Input:
     * [10, 60, 45, 80, 25, 100]
     *
     * Expected Output:
     * 3
     * ============================================================
     */
    public static void countNumbersGreaterThan50() {

        List<Integer> numbers =
                Arrays.asList(10, 60, 45, 80, 25, 100);

        long count = numbers.stream()
                .filter(n -> n > 50)
                .count();

        System.out.println("7. Count > 50 : " + count);
    }


    /*
     * ============================================================
     * QUESTION 8:
     *
     * Given a list of integers, find the maximum number.
     *
     * Input:
     * [10, 60, 45, 80, 25]
     *
     * Expected Output:
     * 80
     * ============================================================
     */
    public static void findMaximumNumber() {

        List<Integer> numbers =
                Arrays.asList(10, 60, 45, 80, 25);

        int max = numbers.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

        System.out.println("8. Maximum : " + max);
    }


    /*
     * ============================================================
     * QUESTION 9:
     *
     * Given a list of integers, find the minimum number.
     *
     * Input:
     * [10, 60, 45, 80, 25]
     *
     * Expected Output:
     * 10
     * ============================================================
     */
    public static void findMinimumNumber() {

        List<Integer> numbers =
                Arrays.asList(10, 60, 45, 80, 25);

        int min = numbers.stream()
                .min((a, b) -> a.compareTo(b))
                .get();

        System.out.println("9. Minimum : " + min);
    }


    /*
     * ============================================================
     * QUESTION 10:
     *
     * Given a list of integers, sort the numbers
     * in ascending order.
     *
     * Input:
     * [50, 10, 40, 20, 30]
     *
     * Expected Output:
     * [10, 20, 30, 40, 50]
     * ============================================================
     */
    public static void sortNumbers() {

        List<Integer> numbers =
                Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> result = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("10. Sorted numbers : " + result);
    }


    /*
     * ============================================================
     * QUESTION 11:
     *
     * Given a list of names, sort them alphabetically.
     *
     * Input:
     * ["Rahul", "Amit", "Swapnil"]
     *
     * Expected Output:
     * [Amit, Rahul, Swapnil]
     * ============================================================
     */
    public static void sortStrings() {

        List<String> names =
                Arrays.asList("Rahul", "Amit", "Swapnil");

        List<String> result = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("11. Sorted strings : " + result);
    }


    /*
     * ============================================================
     * QUESTION 12:
     *
     * Given a list containing duplicate numbers,
     * remove all duplicate values.
     *
     * Input:
     * [10, 20, 10, 30, 20, 40]
     *
     * Expected Output:
     * [10, 20, 30, 40]
     * ============================================================
     */
    public static void removeDuplicates() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40);

        List<Integer> result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("12. Distinct : " + result);
    }


    /*
     * ============================================================
     * QUESTION 13:
     *
     * Given a list of names, find the first name
     * whose length is greater than 5.
     *
     * Input:
     * ["Amit", "Rahul", "Swapnil", "John"]
     *
     * Expected Output:
     * Swapnil
     * ============================================================
     */
    public static void findFirstMatchingElement() {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Swapnil", "John");

        String result = names.stream()
                .filter(s -> s.length() > 5)
                .findFirst()
                .orElse("Not Found");

        System.out.println("13. First matching : " + result);
    }


    /*
     * ============================================================
     * QUESTION 14:
     *
     * Given a list of numbers, check whether
     * any number is greater than 100.
     *
     * Input:
     * [10, 20, 150, 40]
     *
     * Expected Output:
     * true
     * ============================================================
     */
    public static void checkAnyNumberGreaterThan100() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 150, 40);

        boolean result = numbers.stream()
                .anyMatch(n -> n > 100);

        System.out.println("14. Any number > 100 : " + result);
    }


    /*
     * ============================================================
     * QUESTION 15:
     *
     * Given a list of numbers, check whether
     * all numbers are positive.
     *
     * Input:
     * [10, 20, 30, 40]
     *
     * Expected Output:
     * true
     * ============================================================
     */
    public static void checkAllNumbersPositive() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40);

        boolean result = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println("15. All positive : " + result);
    }


    /*
     * ============================================================
     * QUESTION 16:
     *
     * Given a list of numbers, calculate the sum
     * of all numbers.
     *
     * Input:
     * [10, 20, 30, 40]
     *
     * Expected Output:
     * 100
     * ============================================================
     */
    public static void findSumOfNumbers() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40);

        int sum = numbers.stream()
                .mapToInt(n -> n.intValue())
                .sum();

        System.out.println("16. Sum : " + sum);
    }


    /*
     * ============================================================
     * QUESTION 17:
     *
     * Given a list of numbers, calculate the average.
     *
     * Input:
     * [10, 20, 30, 40]
     *
     * Expected Output:
     * 25.0
     * ============================================================
     */
    public static void findAverageOfNumbers() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40);

        double average = numbers.stream()
                .mapToInt(n -> n.intValue())
                .average()
                .orElse(0);

        System.out.println("17. Average : " + average);
    }


    /*
     * ============================================================
     * QUESTION 18:
     *
     * Given a list of employee names, create a Map where:
     *
     * Key   = Employee name
     * Value = Length of employee name
     *
     * Input:
     * ["Amit", "Rahul", "Swapnil"]
     *
     * Expected Output:
     * {Amit=4, Rahul=5, Swapnil=7}
     * ============================================================
     */
    public static void convertListToMap() {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Swapnil");

        Map<String, Integer> result = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));

        System.out.println("18. List to Map : " + result);
    }


    /*
     * ============================================================
     * QUESTION 19:
     *
     * Given a list of names, join all names into
     * one comma-separated String.
     *
     * Input:
     * ["Amit", "Rahul", "Swapnil"]
     *
     * Expected Output:
     * Amit, Rahul, Swapnil
     * ============================================================
     */
    public static void joinStrings() {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Swapnil");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("19. Joined string : " + result);
    }


    /*
     * ============================================================
     * QUESTION 20:
     *
     * Given a list of numbers, find the second-highest
     * DISTINCT number.
     *
     * Input:
     * [10, 50, 30, 80, 60, 80]
     *
     * Expected Output:
     * 60
     *
     * Steps:
     * 1. Remove duplicates.
     * 2. Sort in descending order.
     * 3. Skip the highest number.
     * 4. Get the next number.
     * ============================================================
     */
    public static void findSecondHighestNumber() {

        List<Integer> numbers =
                Arrays.asList(10, 50, 30, 80, 60, 80);

        int secondHighest = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("20. Second highest : " + secondHighest);
    }

    /*
     * ============================================================
     * QUESTION 21:
     *
     * Given a list of names, find all names that start with "S".
     *
     * Input:
     * [Swapnil, Amit, Rahul, Suresh, Sachin]
     *
     * Expected Output:
     * [Swapnil, Suresh, Sachin]
     * ============================================================
     */
    public static void findNamesStartingWithS() {

        List<String> names =
                Arrays.asList("Swapnil", "Amit", "Rahul", "Suresh", "Sachin");

        List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .toList();

        System.out.println("21. Names starting with S : " + result);
    }


    /*
     * ============================================================
     * QUESTION 22:
     *
     * Given a list of names, find all names that end with "l".
     *
     * Input:
     * [Amit, Rahul, Raj, Rohit, Sunil]
     *
     * Expected Output:
     * [Rahul, Sunil]
     * ============================================================
     */
    public static void findNamesEndingWithL() {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Raj", "Rohit", "Sunil");

        List<String> result = names.stream()
                .filter(s -> s.endsWith("l"))
                .toList();

        System.out.println("22. Names ending with l : " + result);
    }


    /*
     * ============================================================
     * QUESTION 23:
     *
     * Given a list of names in lowercase, convert the first
     * character of every name to uppercase.
     *
     * Input:
     * [swapnil, amit, rahul]
     *
     * Expected Output:
     * [Swapnil, Amit, Rahul]
     * ============================================================
     */
    public static void convertFirstLetterToUppercase() {

        List<String> names =
                Arrays.asList("swapnil", "amit", "rahul");

        List<String> result = names.stream()
                .map(s -> s.substring(0, 1).toUpperCase()
                        + s.substring(1))
                .toList();

        System.out.println("23. First letter uppercase : " + result);
    }


    /*
     * ============================================================
     * QUESTION 24:
     *
     * Given a list of names, find all names containing
     * the character "a".
     *
     * Perform the search in a case-insensitive manner.
     *
     * Input:
     * [Swapnil, Amit, Rahul, Suresh, John]
     *
     * Expected Output:
     * [Swapnil, Amit, Rahul, Suresh]
     * ============================================================
     */
    public static void findNamesContainingA() {

        List<String> names =
                Arrays.asList("Swapnil", "Amit", "Rahul", "Suresh", "John");

        List<String> result = names.stream()
                .filter(s -> s.toLowerCase().contains("a"))
                .toList();

        System.out.println("24. Names containing 'a' : " + result);
    }


    /*
     * ============================================================
     * QUESTION 25:
     *
     * Given a list of names, find the longest name.
     *
     * Input:
     * [Amit, Rahul, Swapnil, Christopher]
     *
     * Expected Output:
     * Christopher
     * ============================================================
     */
    public static void findLongestString() {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Swapnil", "Christopher");

        String result = names.stream()
                .max((a, b) -> a.length() - b.length())
                .orElse("Not Found");

        System.out.println("25. Longest name : " + result);
    }
}

/*
Think of it as:

List
 ↓
stream()
 ↓
filter()     → remove unwanted data
 ↓
map()        → transform data
 ↓
sorted()     → optional sorting
 ↓
distinct()   → optional duplicate removal
 ↓
collect()    → convert result back to List/Set/Map

*/
