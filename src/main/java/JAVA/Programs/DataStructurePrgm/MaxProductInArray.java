package JAVA.Programs.DataStructurePrgm;

// Program to find the maximum product of any two elements in an array.
//
// Approach:
//
// The maximum product can come from two possibilities:
//
// 1. Two largest positive numbers
//       highest * secondHighest
//
// 2. Two smallest negative numbers
//       lowest * secondLowest
//
// Example:
// {-10, -20, 2, 5}
//
// Two largest numbers:
// 5 and 2
// Product = 5 * 2 = 10
//
// Two smallest numbers:
// -20 and -10
// Product = -20 * -10 = 200
//
// Therefore, maximum product = 200.
//
// We find the highest, second highest, lowest and second lowest
// values in a SINGLE traversal of the array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxProductInArray {

    public static void main(String[] args) {
        int[] arr = {5,4,1,9,10};

        int highest = arr[0];
        int s_highest = arr[0];
        int lowest = arr[0];
        int s_lowest = arr[0];

        for(int num : arr){
            if(num > highest){
                s_highest = highest;
                highest = num;

            }else if(num > s_highest){
                s_highest = num;

            }else if(num < lowest){
                s_lowest = lowest;
                lowest = num;
            }else if(num > s_lowest){
                s_lowest = num;
            }

        }
        System.out.println("highest: " + highest);
        System.out.println("s_highest: " + s_highest);
        System.out.println("lowest: " + lowest);
        System.out.println("s_lowest: " + s_lowest);

        int prod1 = highest * s_highest;
        int prod2 = lowest * s_lowest;

        System.out.println("prod1: " + prod1);
        System.out.println("prod2: " + prod2);

        if(prod1 > prod2){
            System.out.println("Maximum product is: " + prod1);
        }else{
            System.out.println("Maximum product is: " + prod2);
        }
    }
}