package JAVA.Programs.DataStructurePrgm;

public class SecondLargestArray {
    public static void main(String[] args) {

        // https://youtu.be/R57n33zxgIw?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2
        System.out.println("method1");
        method1();
        System.out.println("method2");
        int[] a = {9, 3, 5, 2, 8, 1};
        method2(a);
    }

    private static void method1() {
        int[] a = {9, 3, 5, 2, 8, 1};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("After swapping: " + a[i]);
        }
        System.out.println("SecondLargestArray: " + a[1]);
    }

    /**
     * This is good example
     * @param a
     * @return
     */
    private static int method2(int a[]) {
        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
                System.out.println("secondLargest is: " + secondLargest);
            } else if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }
        }
        return secondLargest;

    }


}




