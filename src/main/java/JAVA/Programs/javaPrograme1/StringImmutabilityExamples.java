package JAVA.Programs.javaPrograme1;

public class StringImmutabilityExamples {

    public static void main(String[] args) {

        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();

    }

    /*
     * Q1. What happens when we reassign a String?
     *
     * String is immutable.
     * s = "mango" does NOT modify the existing "apple" object.
     * It simply makes s refer to "mango".
     *
     * Output:
     * mango
     */
    private static void example1() {

        String s = "apple";

        s = "mango";

        System.out.println(s);
    }


    /*
     * Q2. Prove that String is immutable.
     *
     * Initially:
     *
     * s   ────────> "Java"
     * old ────────> "Java"
     *
     * concat() does NOT modify "Java".
     *
     * A new String "Java Test" is created.
     *
     * After concat:
     *
     * old ────────> "Java"
     *
     * s   ────────> "Java Test"
     *
     * Output:
     * Java
     * Java Test
     */
    private static void example2() {

        System.out.println("**** Prove String is immutable.");

        String s = "Java";

        String old = s;


        System.out.println(old);
        System.out.println(s);

        s = s.concat(" Test");  // concat() does NOT modify "Java".  A new String "Java Test" is created.

        System.out.println(old);
        System.out.println(s);
    }


    /*
     * Q3. Can a String object be modified?
     *
     * No.
     *
     * toUpperCase() returns a NEW String.
     *
     * We are ignoring the returned value here.
     *
     * Therefore s is still "hello".
     *
     * Output:
     * hello
     */
    private static void example3() {

        System.out.println("*** Can a String object be modified?");

        String s = "hello";

        s.toUpperCase(); //  o/p = hello  as toUpperCase() returns a NEW String. but we are ignoring return value

        System.out.println(s);

    }


    /*
     * Q4. What happens when we store the result of toUpperCase()?
     *
     * toUpperCase() does not modify the original String.
     * It returns a new String.
     *
     * s ────────> "hello"
     *
     * After:
     *
     * s = s.toUpperCase();
     *
     * s ────────> "HELLO"
     *
     * Output:
     * HELLO
     */
    private static void example4() {

        System.out.println("*** toUpperCase() returns a new String.");

        String s = "hello";

        s = s.toUpperCase();

        System.out.println(s);
    }


    /*
     * Q5. What happens when two String variables have the same literal?
     *
     * Java uses the String Pool for String literals.
     *
     * s1 ──────┐
     *           ├──────> "Java"
     * s2 ──────┘
     *
     * Therefore == returns true.
     *
     * Output:
     * true
     */
    private static void example5() {

        System.out.println("*** String Pool example.");

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
    }


    /*
     * Q6. What happens with new String()?
     *
     * new String() creates a separate String object.
     *
     * s1 ────────> Object 1 "Java"
     *
     * s2 ────────> Object 2 "Java"
     *
     * The content is the same,
     * but the objects are different.
     *
     * Therefore:
     *
     * ==       -> false
     * equals() -> true
     */
    private static void example6() {

        System.out.println("*** == vs equals()");

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);   //false
        System.out.println(s1.equals(s2));  //true
    }


    /*
     * Q7. Difference between == and equals().
     *
     * == checks whether both references point
     * to the same object.
     *
     * equals() checks the content of the String.
     *
     * s1 ────────> "Java"
     * s2 ────────> "Java"
     *
     * Here the content is equal.
     */
    private static void example7() {

        System.out.println("*** == vs equals()");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
    }


    /*
     * Q8. What happens if concat() result is ignored?
     *
     * concat() returns a NEW String.
     *
     * We are not assigning the returned value back to s.
     *
     * Therefore s remains "Java".
     *
     * Output:
     * Java
     */
    private static void example8() {

        System.out.println("*** concat() result ignored.");

        String s = "Java";

        s.concat(" Selenium");

        System.out.println(s);
    }


    /*
     * Q9. What happens if concat() result is assigned back?
     *
     * concat() returns a new String.
     *
     * This time we store the returned value:
     *
     * s = s.concat(" Selenium");
     *
     * Therefore s now refers to:
     *
     * "Java Selenium"
     */
    private static void example9() {

        System.out.println("*** concat() result assigned.");

        String s = "Java";

        s = s.concat(" Selenium");

        System.out.println(s);
    }


    /*
     * Q10. String vs StringBuilder.
     *
     * String:
     *
     * "Java" -> cannot be modified.
     *
     * StringBuilder:
     *
     * "Java" -> append(" Test") -> same object is modified.
     *
     * Output:
     *
     * Java Test
     */
    private static void example10() {

        System.out.println("*** StringBuilder is mutable.");

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Test");

        System.out.println(sb);
    }

}