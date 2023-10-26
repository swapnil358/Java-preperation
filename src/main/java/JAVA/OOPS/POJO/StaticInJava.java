package JAVA.OOPS.POJO;

public class StaticInJava {
    /**
     * Static Variables (Class Variables): When a variable is declared as static, it becomes a class variable, also known as a static variable. This means there is only one copy of the variable that is shared among all instances of the class. Changes to a static variable affect all instances of the class. Static variables are often used for constants or for maintaining shared state across instances.
     *
     * java
     * Copy code
     * public class MyClass {
     *     static int count = 0;
     * }
     * Static Methods: A static method belongs to the class rather than to an instance of the class. You can call a static method using the class name, and it can't access instance-specific members (non-static variables or methods) directly.
     *
     * java
     * Copy code
     * public class MathUtils {
     *     public static int add(int a, int b) {
     *         return a + b;
     *     }
     * }
     * Static Blocks: Static blocks are used to initialize static variables or perform some one-time setup for the class. They are executed when the class is loaded by the JVM. Static blocks are declared within a class without any method name.
     *
     * java
     * Copy code
     * public class MyClass {
     *     static {
     *         // Initialization code for static variables
     *         // Executed when the class is loaded
     *     }
     * }
     * Static Nested Classes: You can define a class within another class and mark it as static. Static nested classes don't have access to the instance-specific members of the outer class and can be instantiated without creating an instance of the outer class.
     *
     * java
     * Copy code
     * public class OuterClass {
     *     static class StaticNestedClass {
     *         // ...
     *     }
     * }
     * Static Import: You can use import static to access static members of another class directly without qualifying them with the class name. This is often used for importing constants or utility methods.
     *
     * java
     * Copy code
     * import static java.lang.Math.PI;
     *
     * public class Circle {
     *     double area(double radius) {
     *         return PI * radius * radius;
     *     }
     * }
     * Singleton Design Pattern: The Singleton pattern often involves a private static instance variable and a static method to access that instance, ensuring that only one instance of the class is created.
     *
     * java
     * Copy code
     * public class Singleton {
     *     private static Singleton instance;
     *
     *     private Singleton() {
     *         // Private constructor
     *     }
     *
     *     public static Singleton getInstance() {
     *         if (instance == null) {
     *             instance = new Singleton();
     *         }
     *         return instance;
     *     }
     * }
     * In summary, the static keyword in Java is used to create members (variables and methods) that are associated with the class itself, rather than with instances of the class. Static members are shared among all instances of the class and can be accessed using the class name.
     */
}
