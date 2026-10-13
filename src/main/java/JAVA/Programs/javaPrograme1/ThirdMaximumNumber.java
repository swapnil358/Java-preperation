package JAVA.Programs.javaPrograme1;


public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third maximum distinct number does not exist");
        } else {
            System.out.println("Third maximum: " + third);
        }
    }
}