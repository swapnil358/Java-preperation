package JAVA.Programs.javaPrograme1;

public class ReverseArray {
    public static void main(String[] args) {

        //two pointer technique

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
