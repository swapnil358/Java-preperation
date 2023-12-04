package JAVA.OOPS.StringImmutableConcept;

public class StringConcept {

    // String pool
    // Security
    // Class loading mechanism
    // Optimization and Performance
    // It can not be inherited
    // Wrapper classes -- int, long, double, float will be final/immutable

    public static void main(String[] args) {

        String s1 = "Java"; // 1) String Pool
        String s2 = "Java";
        //s2 = "Naveen";
        String s3 = "C++";
        s3.concat("C");
        System.out.println("s1" + " " + s1);
        System.out.println("s2" + " " + s2);
        System.out.println("s3" + " " + s3);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }


    /**
     * Explaination
     * 1. s1 == s2: This comparison checks whether the two String references (s1 and s2) point to the same memory location.
     * In this case, both s1 and s2 are string literals, and in Java, string literals are interned,
     * meaning they share the same memory location if they have the same content.
     * So, s1 == s2 will return true because both s1 and s2 refer to the same "Java" string literal.
     *
     * 2.s1.equals(s2): This comparison checks whether the content of the two String objects is the same.
     * Since both s1 and s2 contain the same string "Java," s1.equals(s2) will return true.
     */
}
