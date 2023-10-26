package JAVA_Programs.MorganStanleyJavaInterview;

public class programme1 {

    /**
     *  //++i is a pre-increment operator, which means it increments the value of i by 1 and then returns the updated value.
     *
     *             Here's what happens in each iteration of the loop:
     *
     *             i starts at 0.
     *
     *                     ++i increments it to 1.
     *             1 is printed to the console.
     *                     i starts at 1.
     *
     *                     ++i increments it to 2.
     *             2 is printed to the console.
     *                     i starts at 2.
     *
     *                     ++i increments it to 3.
     *             3 is printed to the console.
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(++i);
        }
    }
}
/**OUTPUT
 * 1
 * 3
 * 5
 * 7
 * 9
 * 11
 */
