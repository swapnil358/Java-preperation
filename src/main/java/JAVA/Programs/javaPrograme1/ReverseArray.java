package JAVA.Programs.javaPrograme1;

public class ReverseArray {
    public static void main(String[] args) {

        //two pointer technique

       // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] arr = {9,8,7,6,5,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
//            if(arr[start]<arr[end]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
//            }
        }

        for (int a : arr) {
            System.out.print(a);
        }
    }
}
