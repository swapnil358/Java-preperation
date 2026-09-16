/**
 * ============================================================
 * PROGRAM: Add Numbers From a String
 * ============================================================
 *
 * Problem:
 * Given a string containing alphabets and numbers, extract all
 * complete numbers and calculate their sum.
 *
 * Example:
 * Input  : "abc12xyz34"
 * Numbers: 12, 34
 * Output : 46
 *
 * This program demonstrates:
 * 1. Traditional approach using for...of
 * 2. JavaScript built-in approach using match() + reduce()
 * ============================================================
 */


/* ============================================================
   APPROACH 1: TRADITIONAL APPROACH
   ============================================================ */

/**
 * Extract numbers manually and add them.
 *
 * Example:
 * "abc12xyz34"
 *
 * Step 1: Find '1' -> number = "1"
 * Step 2: Find '2' -> number = "12"
 * Step 3: Find 'x' -> number is complete -> add 12
 * Step 4: Find '3' -> number = "3"
 * Step 5: Find '4' -> number = "34"
 * Step 6: End of string -> add 34
 *
 * Final result = 12 + 34 = 46
 */
function addNumbers(str) {

    // Stores the final sum
    let sum = 0;

    // Temporary variable used to build a complete number
    let number = "";

    // Iterate through every character in the string
    for (let ch of str) {

        // Check whether the current character is a digit
        if (ch >= "0" && ch <= "9") {

            // Add the digit to the current number
            // Example: "1" + "2" = "12"
            number= number + ch;

        } else {

            // We reached a non-digit character.
            // Therefore, the current number is complete.
            if (number !== "") {

                // Convert the string number into an actual number
                // and add it to the total sum.
                sum = sum + Number(number);

                // Reset number so we can build the next number
                number = "";
            }
        }
    }

    // Important:
    // If the string ends with a number, there will be no
    // non-digit character to trigger the addition above.
    //
    // Example:
    // "abc12xyz34"
    // The loop ends after reading "34".
    //
    // Therefore, we need to add the last number manually.
    if (number !== "") {

        // Convert the last number to Number and add it
        sum = sum + Number(number);
    }

    // Return the final sum
    return sum;
}


// Test the traditional approach
console.log("Traditional Approach:");
console.log(addNumbers("abc12xyz34")); // 46


/* ============================================================
   APPROACH 2: JAVASCRIPT BUILT-IN APPROACH
   ============================================================ */

/**
 * JavaScript provides built-in functions that make this problem
 * much shorter.
 *
 * We use:
 *
 * 1. match()  -> Extract all numbers
 * 2. reduce() -> Add all extracted numbers
 */
function addNumbers1(str) {

    // \d+ means:
    //
    // \d = any digit from 0 to 9
    // +  = one or more occurrences
    //
    // "abc12xyz34"
    //
    // match(/\d+/g) returns:
    //
    // ["12", "34"]
    //
    // Note:
    // The returned values are strings.
    const numbers = str.match(/\d+/g) || [];


    // reduce() converts the array into a single value.
    //
    // Initial value of sum = 0
    //
    // First iteration:
    // sum = 0
    // num = "12"
    // 0 + Number("12") = 12
    //
    // Second iteration:
    // sum = 12
    // num = "34"
    // 12 + Number("34") = 46
    //
    // Final result = 46
    return numbers.reduce(
        (sum, num) => sum + Number(num),
        0
    );
}


// Test the built-in approach
console.log("JavaScript Built-in Approach:");
console.log(addNumbers1("abc12xyz34")); // 46