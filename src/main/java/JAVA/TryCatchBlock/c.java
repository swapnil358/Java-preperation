package JAVA.TryCatchBlock;

/**
 * In this example, the outer try block contains an inner try block.
 * If an exception occurs in the inner try block,
 * it is caught and handled by the inner catch block.
 * If the inner catch block does not handle the exception,
 * it is propagated to the outer catch block,
 * which can handle exceptions thrown by both the outer and inner try blocks.
 *
 *
 *
 */

class NestedTryWithSingleCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer Try Block - Start");

            try {
                // Inner try block
                System.out.println("Inner Try Block");
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                // Handle the ArithmeticException in the inner catch block
                System.out.println("Inner Catch Block: ArithmeticException caught - " + e.getMessage());
            }

            System.out.println("Outer Try Block - End");
        } catch (Exception e) {
            // Handle any exception caught in the outer catch block
            System.out.println("Outer Catch Block: Exception caught - " + e.getMessage());
        }
    }
}
