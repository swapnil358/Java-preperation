/*
 * JavaScript Interview Programs
 * Latest 5 Array Programs
 *
 * Style: Plain JavaScript / ES5
 * Focus: Interview-friendly logic
 */

// ============================================================
// 1. Find Largest Number in an Array
// ============================================================

var arr1 = [10, 25, 7, 45, 18];

var largest = arr1[0];

for (var i = 1; i < arr1.length; i++) {
    if (arr1[i] > largest) {
        largest = arr1[i];
    }
}

console.log("1. Largest Number:", largest);


// ============================================================
// 2. Find Second Largest Number in an Array
// ============================================================

var arr2 = [10, 25, 7, 45, 18];

var largest2 = -Infinity;
var secondLargest = -Infinity;

for (var i = 0; i < arr2.length; i++) {
    if (arr2[i] > largest2) {
        secondLargest = largest2;
        largest2 = arr2[i];
    } else if (arr2[i] > secondLargest && arr2[i] !== largest2) {
        secondLargest = arr2[i];
    }
}

console.log("2. Second Largest Number:", secondLargest);


// ============================================================
// 3. Find Missing Number in an Array
// Example: 1, 2, 3, 5
// Missing number = 4
// ============================================================

var arr3 = [1, 2, 3, 5];

var n = arr3.length + 1;

// Sum of numbers from 1 to n
var expectedSum = n * (n + 1) / 2;

var actualSum = 0;

for (var i = 0; i < arr3.length; i++) {
    actualSum = actualSum + arr3[i];
}

var missingNumber = expectedSum - actualSum;

console.log("3. Missing Number:", missingNumber);


// ============================================================
// 4. Find Duplicate Numbers in an Array
// ============================================================

var arr4 = [1, 2, 3, 2, 4, 5, 3, 6];

var duplicates = [];

for (var i = 0; i < arr4.length; i++) {

    for (var j = i + 1; j < arr4.length; j++) {

        if (arr4[i] === arr4[j] && duplicates.indexOf(arr4[i]) === -1) {
            duplicates.push(arr4[i]);
        }
    }
}

console.log("4. Duplicate Numbers:", duplicates);


// ============================================================
// 5. Remove Duplicate Elements from an Array
// ============================================================

var arr5 = [1, 2, 3, 2, 4, 1, 5, 3];

var uniqueArray = [];

for (var i = 0; i < arr5.length; i++) {

    if (uniqueArray.indexOf(arr5[i]) === -1) {
        uniqueArray.push(arr5[i]);
    }
}

console.log("5. Array After Removing Duplicates:", uniqueArray);


// ============================================================
// Expected Output
// ============================================================
//
// 1. Largest Number: 45
// 2. Second Largest Number: 25
// 3. Missing Number: 4
// 4. Duplicate Numbers: [2, 3]
// 5. Array After Removing Duplicates: [1, 2, 3, 4, 5]
//
// ============================================================
