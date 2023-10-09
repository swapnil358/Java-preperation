package Programs.DataStructurePrgm;


//pgm to find the maximum product (i.e multiplication) in array

public class maxProductInArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 7, 3, 2, 89};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;


        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest) {
                secondLowest = num;
            }
        }
        System.out.println("highest:" + highest);
        System.out.println("secondHighest:" + secondHighest);
        System.out.println("lowest:" + lowest);
        System.out.println("secondHighest:" + secondHighest);

        int product1 = highest * secondHighest;
        int product2 = lowest * secondLowest;

        System.out.println("Maximum product is" + ":" + Math.max(product1, product2));
    }


}
