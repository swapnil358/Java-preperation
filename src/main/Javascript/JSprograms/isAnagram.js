/**
 * ============================================================
 * PROGRAM: Check Whether Two Strings Are Anagrams
 * ============================================================
 *
 * Anagram:
 * Two strings are anagrams if they contain the same characters
 * with the same frequency, but possibly in a different order.
 *
 * Examples:
 *
 * "listen"  -> "silent"       => true
 * "hello"   -> "world"        => false
 * "Dormitory" -> "Dirty Room" => true
 *
 * Approaches:
 *
 * 1. Traditional Frequency Map
 * 2. JavaScript Built-in: split() + sort() + join()
 * 3. Interview-optimized Frequency Map with normalization
 */


/* ============================================================
   APPROACH 1: TRADITIONAL FREQUENCY MAP
   ============================================================ */

/**
 * Checks whether two strings are anagrams.
 *
 * This approach uses an object as a frequency map.
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 */
function isAnagramFrequency(str1, str2) {

    // If lengths are different, strings cannot be anagrams.
    //
    // Example:
    // "hello" -> 5 characters
    // "worlds" -> 6 characters
    //
    // Therefore, immediately return false.
    if (str1.length !== str2.length) {
        return false;
    }


    // Object used to store the frequency of each character.
    //
    // Example:
    // "listen"
    //
    // count = {
    //     l: 1,
    //     i: 1,
    //     s: 1,
    //     t: 1,
    //     e: 1,
    //     n: 1
    // }
    let count = {};


    // Loop through the first string.
    for (let ch of str1) {

        // If character already exists, increment its count.
        //
        // Otherwise, (count[ch] || 0) gives 0
        // and then we add 1.
        //
        // Example:
        // First "l" -> 0 + 1 = 1
        // Second "l" -> 1 + 1 = 2
        count[ch] = (count[ch] || 0) + 1;
    }


    // Now process the second string.
    for (let ch of str2) {

        // If the character does not exist in our frequency map,
        // then str2 contains a character that str1 does not have.
        //
        // Therefore, they are not anagrams.
        if (!count[ch]) {
            return false;
        }


        // Decrease the frequency because this character
        // has now been matched.
        count[ch]--;
    }


    // All characters were successfully matched.
    return true;
}


// Test
console.log("===== Frequency Map Approach =====");

console.log(
    isAnagramFrequency("listen", "silent")
); // true

console.log(
    isAnagramFrequency("hello", "world")
); // false


/* ============================================================
   APPROACH 2: JAVASCRIPT BUILT-IN APPROACH
   ============================================================ */

/**
 * Uses:
 *
 * split() -> converts string into an array
 * sort()  -> sorts the characters
 * join()  -> converts array back into a string
 *
 * Example:
 *
 * "listen"
 *
 * split("")
 *      ↓
 * ["l", "i", "s", "t", "e", "n"]
 *
 * sort()
 *      ↓
 * ["e", "i", "l", "n", "s", "t"]
 *
 * join("")
 *      ↓
 * "eilnst"
 *
 * Both anagrams produce the same sorted string.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
function isAnagramBuiltIn(str1, str2) {

    // Convert first string into characters,
    // sort them and convert back into a string.
    const sortedStr1 = str1
        .split("")
        .sort()
        .join("");


    // Do the same for the second string.
    const sortedStr2 = str2
        .split("")
        .sort()
        .join("");


    // If sorted strings are equal,
    // the original strings are anagrams.
    return sortedStr1 === sortedStr2;
}


// Test
console.log("===== JavaScript Built-in Approach =====");

console.log(
    isAnagramBuiltIn("listen", "silent")
); // true

console.log(
    isAnagramBuiltIn("hello", "world")
); // false


/* ============================================================
   APPROACH 3: BETTER VERSION FOR REAL INTERVIEWS
   ============================================================ */

/**
 * This version handles:
 *
 * - Uppercase/lowercase differences
 * - Spaces
 *
 * Example:
 *
 * "Dormitory"
 * "Dirty Room"
 *
 * After normalization:
 *
 * "dormitory"
 * "dirtyroom"
 *
 * Both contain the same characters.
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 */
function isAnagram(str1, str2) {

    /**
     * Normalize both strings.
     *
     * toLowerCase()
     * ----------------
     * Converts uppercase characters to lowercase.
     *
     * replace(/\s/g, "")
     * ------------------
     * Removes all whitespace characters.
     *
     * Example:
     *
     * "Dirty Room"
     *
     * toLowerCase()
     *      ↓
     * "dirty room"
     *
     * replace(/\s/g, "")
     *      ↓
     * "dirtyroom"
     */
    const normalize = str =>
        str
            .toLowerCase()
            .replace(/\s/g, "");


    // Normalize the first string.
    str1 = normalize(str1);


    // Normalize the second string.
    str2 = normalize(str2);


    // After normalization, different lengths mean
    // they cannot be anagrams.
    if (str1.length !== str2.length) {
        return false;
    }


    // Create a frequency map.
    const count = {};


    // Count every character in the first string.
    for (const ch of str1) {

        // Increment character frequency.
        count[ch] = (count[ch] || 0) + 1;
    }


    // Compare characters from the second string.
    for (const ch of str2) {

        // If character doesn't exist OR its frequency
        // has already reached zero, strings are not anagrams.
        if (!count[ch]) {
            return false;
        }


        // Consume one occurrence of this character.
        count[ch]--;
    }


    // All characters matched successfully.
    return true;
}


/* ============================================================
   TEST CASES
   ============================================================ */

console.log("===== Interview-Optimized Approach =====");

console.log(
    isAnagram("listen", "silent")
); // true

console.log(
    isAnagram("Dormitory", "Dirty Room")
); // true

console.log(
    isAnagram("hello", "world")
); // false

console.log(
    isAnagram("listen", "silentx")
); // false

console.log(
    isAnagram("apple", "papel")
); // true

console.log(
    isAnagram("rat", "car")
); // false

console.log(
    isAnagram("aabbcc", "abcabc")
); // true

console.log(
    isAnagram("aabbcc", "aabbcd")
); // false


/* ============================================================
   INTERVIEW CHEAT SHEET
   ============================================================ */

/*

1. FREQUENCY MAP
   -------------------------------
   Time  : O(n)
   Space : O(n)

   Best choice for a senior SDET interview.

   Why?

   - Linear time
   - No sorting required
   - Demonstrates data-structure knowledge
   - Easy to extend for real-world requirements


2. SORTING APPROACH
   -------------------------------
   split() + sort() + join()

   Time  : O(n log n)
   Space : O(n)

   Simple and readable, but less efficient than
   the frequency-map approach.


3. NORMALIZATION
   -------------------------------

   toLowerCase()
   replace(/\s/g, "")

   Makes the comparison case-insensitive
   and ignores spaces.


4. IMPORTANT INTERVIEW QUESTION
   -------------------------------

   Q: Which approach would you choose?

   Answer:

   "I would prefer the frequency-map approach because
   it provides O(n) time complexity compared with
   O(n log n) for the sorting approach. I would also
   normalize the input based on the business requirement,
   such as ignoring case and whitespace."


5. SDET REAL-WORLD USE CASES
   -------------------------------

   Anagram logic can demonstrate skills useful for:

   - API response validation
   - Comparing unordered data
   - Validating collections
   - Test-data comparison
   - JSON array comparison
   - Ignoring ordering when order is not significant

*/