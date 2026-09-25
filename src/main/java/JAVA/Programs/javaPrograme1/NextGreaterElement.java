package JAVA.Programs.javaPrograme1;

    /*

        1. Create array.
        2. Take each element one by one.
        3. Check elements on its right.
        4. Find the first greater element.
        5. Store it and stop searching.
        6. If not found, keep `-1`.
        7. Print the result.



    Next Greater Element — Java Interview Question

    Question: Given an array, find the next greater element for every element. The next greater element is the first element on the right that is greater than the current element. If no greater element exists, return -1.

    Example
    Input:
    [4, 5, 2, 10, 8]

    Output:
    [5, 10, 10, -1, -1]

    Explanation:

    4 → 5
    5 → 10
    2 → 10
    10 → -1
    8 → -1


    */

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        for (int i = 0; i < arr.length; i++) {

            int nextGreater = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }

            System.out.println(arr[i] + " -> " + nextGreater);
        }
    }
}
