package JAVA.Programs.javaPrograme1;
/*

To find the first and last occurrence of a target element in a sorted array, we can use Binary Search twice.
- First binary search finds the first occurrence.
- Second binary search finds the last occurrence.

Input:
arr = [1, 2, 2, 2, 3, 4, 5]
target = 2


Output:
First occurrence = 1
Last occurrence  = 3


* */

public class FirstAndLastOccurrence {

    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; // Search left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // Search right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        System.out.println(firstOccurrence(arr, target));
        System.out.println(lastOccurrence(arr, target));
    }
}
