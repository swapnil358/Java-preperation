package JAVA.TryCatchBlock;

public class TC {
///*
//
//    public static void main(String[] args) {
//
//        /**
//         *  but in such cases, you must include either a
//         *  finally block or both finally and catch blocks.
//         *
//         * Example 1: Try-Catch
//         *
//         */
//// 1.
//        try {
//            // code that might throw an exception
//        } catch (IndexOutOfBoundsException e) {
//            // handle the exception
//        } catch (NullPointerException e2) {
//
//        }
//
//
//        /**
//         * there is a try block followed by a catch block,
//         * which handles any exception that might occur inside the try block.
//         *
//         * Example 2: Try-Finally
//         *
//         */
//
//        try {
//            // code that might throw an exception
//        } finally {
//            // code that will always be executed, whether an exception occurs or not
//        }
//
//
//        /**
//         * there is a try block followed by a finally block.
//         * The code inside the finally block will be executed regardless of
//         * whether an exception occurs or not.
//         *
//         * Try-Catch-Finally
//         */
//        try {
//            // code that might throw an exception
//        } catch (Exception e) {
//            // handle the exception
//        } finally {
//            // code that will always be executed, whether an exception occurs or not
//        }
//
//
//        /**
//         * This is syntactically correct,
//         * but it's generally not recommended in most scenarios because it means that
//         * if an exception occurs,
//         * there is no code to handle or clean up after the exception.
//         *
//         */
//        try {
//            if (20 != 0) {
//                // code that might throw an exception
//            } else {
//
//            }
//
//
//            /**
//             *it is possible to have nested try blocks with a single catch block in Java.
//             * This is known as nested exception handling.
//             * In this scenario,
//             * if an exception occurs in the inner try block, the control is transferred to the catch block.
//             * If the catch block does not handle the exception,
//             * it can be propagated to the outer try block's catch block.
//             *
//             */
//
//            try {
//                // Outer try block
//                System.out.println("Outer Try Block - Start");
//
//                try {
//                    // Inner try block
//                    System.out.println("Inner Try Block");
//                    int result = 10 / 0; // This will throw an ArithmeticException
//                } catch (ArithmeticException e) {
//                    // Handle the ArithmeticException in the inner catch block
//                    System.out.println("Inner Catch Block: ArithmeticException caught - " + e.getMessage());
//                }
//
//                System.out.println("Outer Try Block - End");
//            } catch (Exception e) {
//                // Handle any exception caught in the outer catch block
//                System.out.println("Outer Catch Block: Exception caught - " + e.getMessage());
//            }
//
//
//        }
//    }
//
//}
}